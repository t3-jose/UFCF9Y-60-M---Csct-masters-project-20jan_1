package capricorn;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;

public class Utilities {

    public static boolean checkWindows() {
        //If the os.name property of the Dalvik VM contains windows, the system is Windows based
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            return true;
        }
        return false;
    }

    public static List<Path> getDirectories(boolean createFolders) {
        List<Path> directories = new ArrayList<>();
        //Add the root of the drive on which the user profile is located is installed
        directories.add(Paths.get(getRootDrive().toString() + getHoneypotFolderName() + getFileSeparator()));
        //Add user specific directories
        directories.addAll(getUserDirectories());

        //Upon the first failure to create a missing directory, the program will exit
        //This only happens if the boolean createFolders is true
        if (createFolders) {
            for (Path path : directories) {
                if (!checkDirectory(path)) {
                    createHoneypotDirectory(path);
                }
            }
        }
        return directories;
    }

    /**
     * Get the root of the drive on which the user folders are located.
     *
     * @return the path to the root of the drive
     */
    public static Path getRootDrive() {
        if (checkWindows()) { //Check if the system is running on Windows, if not: it is running Linux
            //Return root of the default drive, usually C:\
            return Paths.get(System.getProperty("user.home").substring(0, 3));
        }
        //Return root of the filesystem on Linux
        return Paths.get("/");
    }

    /**
     * Using the given list, a random entry out of the list will be returned
     *
     * @param list the list out of which the random entry must be chosen
     * @return a random entry out of the given list
     */
    public static String getRandomListEntry(List<String> list) {
        //Using a secure random to prevent predictability
        SecureRandom secureRandom = new SecureRandom();
        //return a single entry from the list
        return list.get(secureRandom.nextInt(list.size())); //the nextInt function excludes the highest number, which is also excluded in the size() function (as is shown in the Javadoc of size())
    }

    /**
     * Get all the user specific directories
     *
     * @return a list with Paths of the user specific directories
     */
    private static List<Path> getUserDirectories() {
        //Initialise the list which will return all paths
        List<Path> directories = new ArrayList<>();
        //Platform home and platform file separator are used to set-up the userHome variable; suited for both Windows and Linux
        String userHome = System.getProperty("user.home") + getFileSeparator();
        //Select the specific folders of this user and add the honeypot folder in the end
        Path desktop = Paths.get(userHome + "Desktop" + getFileSeparator() + getHoneypotFolderName() + getFileSeparator());
        Path documents = Paths.get(userHome + "Documents" + getFileSeparator() + getHoneypotFolderName() + getFileSeparator());
        Path music = Paths.get(userHome + "Music" + getFileSeparator() + getHoneypotFolderName() + getFileSeparator());
        Path downloads = Paths.get(userHome + "Downloads" + getFileSeparator() + getHoneypotFolderName() + getFileSeparator());
        Path pictures = Paths.get(userHome + "Pictures" + getFileSeparator() + getHoneypotFolderName() + getFileSeparator());
        Path videos = Paths.get(userHome + "Videos" + getFileSeparator() + getHoneypotFolderName() + getFileSeparator());

        //Add all entries to the list of directories
        directories.add(desktop);
        directories.add(documents);
        directories.add(music);
        directories.add(downloads);
        directories.add(pictures);
        directories.add(videos);
        return directories;
    }

    /**
     * Check if a directory exists
     *
     * @param path the path to the directory
     * @return true if the file exists and is a directory, false if otherwise
     */
    public static boolean checkDirectory(Path path) {
        File directory = new File(path.toString());
        if (directory.exists() && directory.isDirectory()) {
            return true;
        }
        return false;
    }

    /**
     * Check if a file exists
     *
     * @param path path to the file
     * @return true if the file exists and is a file, false if otherwise
     */
    public static boolean checkFile(Path path) {
        File file = new File(path.toString());
        if (file.exists() && file.isFile()) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param fileContent the content which should be written to end of the file
     * @param pwd The directory in which the file should be placed. pwd is short
     * for 'print working directory' (similar to the bash command).
     * @param outputName the name of the file which is written in pwd
     * @return true if the writing is successful, false if there is an error.
     */
    public static boolean writeFile(List<String> fileContent, String pwd, String outputName) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(pwd + Utilities.getFileSeparator() + outputName), true));
            for (String s : fileContent) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     *
     * @param fileContent the byte[] to be written
     * @param pwd The directory in which the file should be placed. pwd is short
     * for 'print working directory' (similar to the bash command).
     * @param outputName the name of the file which is written in pwd
     * @return true if the content is written, false if the array which contains
     * the content is null or if an error occurred.
     */
    public static boolean writeByteArray(byte[] fileContent, String pwd, String outputName) {
        if (fileContent == null) {
            return false;
        }
        Path path = Paths.get(pwd + Utilities.getFileSeparator() + outputName);
        try {
            OutputStream os = new FileOutputStream(path.toFile());
            os.write(fileContent);
            os.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Empty the honeypot folders
     */
    public static void emptyHoneypots() {
        File folder;
        File[] listOfFiles;
        double total = getDirectories(false).size();
        double currentHoneypot = 0;
        double percentage;
        for (Path path : getDirectories(false)) {
            //Notify the user of the removal in the files in the honeypot directories
            System.out.println("[+]Emptying '" + path.toString() + "'!");
            folder = path.toFile();
            listOfFiles = folder.listFiles();
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    listOfFiles[i].delete();
                }
            }
            //Add one to the count of honeypots that has been emptied
            currentHoneypot++;
            //Calculate the progress percentage
            percentage = currentHoneypot / total * 100;
            //Show the progress to the user, the percentage is casted as an int to only show whole percentages
            System.out.println("[+]Progress: " + (int) percentage + "%\n");
        }
    }

    /**
     * Remove the honeypot folders
     */
    public static void removeHoneypotFolders() {
        double total = getDirectories(false).size();
        double currentHoneypot = 0;
        double percentage;
        for (Path path : Utilities.getDirectories(false)) {
            //Notify the user of the removal of the honeypot directories
            System.out.println("[+]Removing '" + path.toString() + "'!");
            path.toFile().delete();
            //Add one to the count of honeypots that has been removed
            currentHoneypot++;
            //Calculate the progress percentage
            percentage = currentHoneypot / total * 100;
            //Show the progress to the user, the percentage is casted as an int to only show whole percentages
            System.out.println("[+]Progress: " + (int) percentage + "%\n");
        }
    }

    /**
     * Get the system specific file separator
     *
     * @return the system specific file separator
     */
    public static String getFileSeparator() {
        return System.getProperty("file.separator");
    }

    /**
     * To change the folder name of the honeypots, it should be changed it.
     *
     * @return the honeypot folder name used in all directories that are
     * monitored
     */
    private static String getHoneypotFolderName() {
        return "A";
    }

    /**
     * Create a honeypot folder based in the given path
     *
     * @param path the path where the honeypot should be made
     */
    private static void createHoneypotDirectory(Path path) {
        File file = new File(path.toString());
        try {
            file.mkdir();
        } catch (SecurityException se) {
            System.out.println("[+]Unable to create the honeypot directory at " + path.toString());
            System.out.println("[+]Run System with the correct privilege to write in the directory. System will now exit.");
            System.exit(1);
        }
    }
}
