package capricorn;

import java.io.IOException;

public class Shutdowner {

    public Shutdowner() {

    }

    public void shutdown() {
        Runtime rt = Runtime.getRuntime();
        try {
            Process pr;
            if (Utilities.checkWindows()) {
                pr = rt.exec("cmd /c shutdown /a"); //abort any pending shutdown which prevents the shutdown command (thanks Jurjen de Jonge)
                pr = rt.exec("cmd /c shutdown /f /p"); // /f /p to shutdown without warning or waiting on 'Do you want to save this document' prompts
            } else {
                pr = rt.exec("halt -p -f"); // -f -p to shutdown the system instantly. Possible downside of this method is that files that are currently being written are not saved. The ransomware is most likely affected by this, as it was during my testing with one sample.
                pr = rt.exec("shutdown now"); //The halt option needs root, which works faster on distirbutions like Kali where everything runs as root. On other Linux systems, the shutdown system needs to be used.
            }
        } catch (IOException e) {
            //The user is notified about the failure to shut down and the user is requested to power off the machine as quick as possible
            System.out.println("[+]URGENT WARNING: Honeypot detected changes in the honeypot folders but failed to initiate the shutdown of the machine. The shutdown process is restarted. Please shut down your machine manually to make sure the device is shut down.");
            //If the system doesn't shut down, we have to try again
            shutdown();
        }
    }
}
