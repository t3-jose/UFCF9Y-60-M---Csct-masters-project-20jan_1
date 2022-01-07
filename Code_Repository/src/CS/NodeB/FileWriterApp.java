package CS.NodeB;


import java.io.*;

public class FileWriterApp {

    public void writeGivenFile(String filename, String data) {

        String fileName = filename;

        try {

            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
//            bufferedWriter.write(" here is some text.");
//            bufferedWriter.newLine();
//            bufferedWriter.write("We are writing");
//            bufferedWriter.write(" the text to the file.");
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Error writing to file '"+ fileName + "'");
        }
    }
}