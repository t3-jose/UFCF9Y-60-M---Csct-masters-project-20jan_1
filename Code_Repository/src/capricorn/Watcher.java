
package capricorn;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Watcher {

    /**
     * In Java, a boolean is false by default. The isActive boolean is used to
     * stop the monitoring process if need be.
     */
    private boolean isActive;

    /**
     * The WatchService is the Java class which monitors files and/or folders
     * using the host's filesystem API.
     */
    private WatchService watcher;

    /**
     * The Shutdowner is used to shut the system down in the case of a detection
     */
    private Shutdowner shutdowner;

    /**
     * The Watcher class can function with any given list of Paths. In the case
     * that the amount or location of the directories change in the future, the
     * list can be obtained in one location.
     *
     * @param directories the directories to be monitored
     */
    public Watcher(List<Path> directories) {
        try {
            watcher = FileSystems.getDefault().newWatchService();
        } catch (IOException ex) {
            System.out.println("[+]An error occurred during the initialisation of the filesystem watcher. Therefore System can not function as intended, resulting in the termination of the process.");
            System.out.println("[+]System will now exit");
            System.exit(1);
        }
        shutdowner = new Shutdowner();
        registerDirectories(directories);
    }

    /**
     * Start the monitoring
     */
    public void start() {
        isActive = true;
        watch();
    }

    /**
     * Stop the monitoring
     */
    public void stop() {
        isActive = false;
    }

    /**
     * Monitor the list of directories, which has been provided in the
     * constructor
     */
    private void watch() {
        //Due to the difference in the system API of Windows and Linux, the OS needs to be determined
        boolean isWindows = Utilities.checkWindows();

        try {
            WatchKey watchKey;
            while (isActive) {
                watchKey = watcher.take();

                //If the operating system is NOT Windows, the thread (and since 
                //the program is not multi-threaded, the whole program) will 
                //sleep for 50 miliseconds. In Linux the system doesn't push
                //the changes to the API, so Java pulls the results. 
                //If there is no delay, the CPU usage of the Java program
                //is extremely high (averaging 90% CPU during tests on virtual machines)
                if (!isWindows) {
                    Thread.sleep(50);
                }
                List<WatchEvent<?>> events = watchKey.pollEvents();
                for (WatchEvent event : events) {

                    //For every event that is logged, we full file location is logged in the Library log
                    Path dir = (Path) watchKey.watchable();
                    WatchEvent<Path> contextPath = (WatchEvent<Path>) event;
                    Path filePath = dir.resolve((contextPath.context()));
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Library.logs.add("[" + dateFormat.format(Calendar.getInstance().getTime()) + "] [" + event.kind().name() + "] " + filePath);

                    //If a file is created, edited or deleted, the shutdown function is tirggered
                    if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE || event.kind() == StandardWatchEventKinds.ENTRY_DELETE || event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
                        try {
                            Utilities.writeFile(Library.logs, Paths.get("").toAbsolutePath().toString() + System.getProperty("file.separator"), "CapricornLog.txt");
                            //Utilities.writeFile(Library.logs, Paths.get("").toAbsolutePath().toString() + System.getProperty("file.separator"), "CapricornLog.txt");
                        } catch (Exception e) {
                            //Since the detection already happened, there should be no delay in the shutdown command, therefore this error is ignored for the system's safety
                        }
                        //Commence shutdown of the OS
                        shutdowner.shutdown();
                    }
                }
                watchKey.reset();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Watcher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * The directories should be registered at the (global variable) watcher.
     * This is done in the constructor
     *
     * @param directories the list of directories that should be registered to
     * be monitored
     */
    private void registerDirectories(List<Path> directories) {
        for (Path directory : directories) {
            try {
                directory.register(watcher, StandardWatchEventKinds.ENTRY_CREATE,
                        StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
            } catch (IOException ex) {
                System.out.println("[+]One or more directories could not be added to the watcher, to reinstall the direcotries run System again with the correct privileges.");
                System.out.println("[+]System will now exit");
                System.exit(0);
            }
        }
    }
}
