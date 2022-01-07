
package capricorn;

import javax.swing.JOptionPane;

public class Capricorn {

    private static final String VERSION = "1.1 (stable release)";

    public static void main(String[] args) {
        System.out.println("Honeypot " + VERSION);
        System.out.println("Developed by MSIS Students");
        
        //String input = JOptionPane.showInputDialog("Enter Your Command");
        
        if (args.length <= 0) {
            help();
        } else if (args.length > 0) {
            if (args[0].equals("-scan") && args.length == 2) {
                scan(args[1]);
            } else if (args[0].equals("-uninstall")) {
                //Remove the files in the honeypot folders and delete the folders afterwards
                uninstall();
            } else if (args[0].equals("-install")) {
                //Create the honeypot folders and fille the folders with honeypot files
                install();
            } else if (args[0].equals("-repair")) {
                //Empty the honeypots and fill them again
                repair();
            } else if (args[0].equals("-guard")) {
                //Guard system: monitoring the honeypot folders
                guard();
            } else if (args[0].equals("-status")) {
                //Show the location of the honeypot folders
                status();
            } else {
                //Show help
                help();
            }
        }
        
        
        
//        if (args.length <= 0) {
//            help();
//        } else if (args.length > 0) {
//            if (args[0].equals("-scan") && args.length == 2) {
//                scan(args[1]);
//            } else if (args[0].equals("-uninstall")) {
//                //Remove the files in the honeypot folders and delete the folders afterwards
//                uninstall();
//            } else if (args[0].equals("-install")) {
//                //Create the honeypot folders and fille the folders with honeypot files
//                install();
//            } else if (args[0].equals("-repair")) {
//                //Empty the honeypots and fill them again
//                repair();
//            } else if (args[0].equals("-guard")) {
//                //Guard system: monitoring the honeypot folders
//                guard();
//            } else if (args[0].equals("-status")) {
//                //Show the location of the honeypot folders
//                status();
//            } else {
//                //Show help
//                help();
//            }
//        }
    }

    /**
     * Show the honeypot folder location
     */
    private static void status() {
        HoneypotManager honeypotManager = new HoneypotManager(argument.STATUS, null);
    }

    /**
     * The help function is called whenever an unknown parameter is registered.
     */
    private static void help() {
        System.out.println("Unknown parameter(s) detected. Use one of the following arguments: \n");
        System.out.println(" -guard        monitor the system");
        System.out.println(" -install      install the honeypot folders and monitor the system afterwards");
        System.out.println(" -repair       replace all the honeypot files, this should be done after a blocked ransomware attack");
        System.out.println(" -scan         scan for files with a specific file extension, which should be supplied as an additional parameter");
        System.out.println(" -uninstall    remove all the honeypot files and folders from the system");
        System.out.println(" -status       show the location of the honeypot folders");
        System.out.println(" -help         to show this information\n");
    }

    /**
     * The repair function empties the honeypots and fills them again.
     */
    private static void repair() {
        System.out.println("[+]The bees are repairing the honeypots. Please give them a minute.");
        HoneypotManager honeypotManager = new HoneypotManager(argument.REPAIR, null);
        System.out.println("[+]The honeypots have succesfully been repaired! The bees can now guard your system again.");
    }

    /**
     * The uninstall function removes the files from the honeypots and also
     * deletes the honeypot folders
     */
    private static void uninstall() {
        System.out.println("[+]Emptying the honeypots and removing the honeypot folders");
        HoneypotManager honeypotManager = new HoneypotManager(argument.UNINSTALL, null);
        System.out.println("[+]Uninstalling is now complete, Capricorn's honeypots have been removed from the system.");
    }

    /**
     * The install function creates the honeypot folders and fills them with
     * honeypot files
     */
    private static void install() {
        System.out.println("[+]Setting up the honeypots. Bees can easily be distracted, so give them a minute.");
        HoneypotManager honeypotManager = new HoneypotManager(argument.INSTALL, null);
        System.out.println("[+]The bees have succesfully filled the honeypots!");
    }    private static void scan(String fileExtension) {
        System.out.println("[+]Scanning for encrypted files in the honeypot folders \n");
        HoneypotManager honeypotManager = new HoneypotManager(argument.SCAN, fileExtension);
    }

    /**
     * The guard function monitors the honeypot folders on changes and protects
     * the system whenever needed. After installing, this is the only function
     * that needs to be called to start the monitoring process
     */
    private static void guard() {
        System.out.println("[+]The guards are spread out and are will alert the hive if there is danger ahead! You can continue to work safely!");
        HoneypotManager honeypotManager = new HoneypotManager(argument.GUARD, null);
    }

        private static void printArgs() {
        System.getProperties().list(System.out);
    }
}
