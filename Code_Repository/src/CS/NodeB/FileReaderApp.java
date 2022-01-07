package CS.NodeB;


import java.io.*;

public class FileReaderApp {

    public String readGivenFile(String filename) {

        String fileName = filename;
        try {
            byte[] buffer = new byte[1000];
            FileInputStream inputStream = new FileInputStream(fileName);
            int total = 0;
            int nRead = 0;
            while ((nRead = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer));
                total += nRead;
            }
            inputStream.close();
            System.out.println("Read " + total + " bytes");
            return new String(buffer);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '"+ fileName + "'");
            
            return "Unable to read file";
        } catch (IOException ex) {
            System.out.println("Error reading file '"+ fileName + "'");
            return "Unable to read file";
        }
    }
}