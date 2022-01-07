package CS.NodeA;

import chatbeanmanager.ChatBeanManager;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import mangerbean.ManagerBeanClass;


public class ChatNodeThreadOne extends Thread {

    public String enc_MSG_RECIEVED;
    public String dec_MSG_RECIEVED;
    public String msgRecieved;
    public String file_NAME;
    public String fileContents;
    public String enc_File_Contents;
    public String dec_File_Contents;

    
    ServerSocket serverSocket;
    Socket socket;
    private ObjectInputStream oin;
    private ObjectOutputStream out;
    ChatWindowNodeOne cwno;
    ChatBeanManager chatbeanManager;
    
    public ChatNodeThreadOne(ChatWindowNodeOne cwno) {
        try {
            this.cwno = cwno;
            serverSocket = new ServerSocket(Settings.NODES_CHAT_PORT);
            System.out.println("Node 1 Chat Manger is Started");
            start();
        } catch (IOException ex) {
            Logger.getLogger(ChatNodeThreadOne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                socket = serverSocket.accept();
                System.out.println("The connection has established: " + socket.getInetAddress());
                openReader();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void sendMessage(ChatBeanManager cbm) {
        try {
            out.writeObject(cbm);
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    private void openReader() {
        try {

            out = new ObjectOutputStream(socket.getOutputStream());
            oin = new ObjectInputStream(socket.getInputStream());
            MSGRecieverThread msgrec = new MSGRecieverThread(cwno, out, oin);
            System.out.println("Message Reciever");
        } catch (Exception e) {
            System.out.println("Error at openReader" + e);
        }
    }

    public class MSGRecieverThread extends Thread {

        ChatWindowNodeOne chatWindow;
        ObjectInputStream oin;
        ObjectOutputStream out;
        Socket socket;
        ManagerBeanClass mbeanclass;

        public MSGRecieverThread() {
        }

        public MSGRecieverThread(ChatWindowNodeOne chatWindow, ObjectOutputStream out, ObjectInputStream oin) throws IOException {
            this.chatWindow = chatWindow;
            this.out = out;
            this.oin = oin;
            start();
        }
        
        public void run(){
            while(true){
                try{
                    chatbeanManager = (ChatBeanManager) oin.readObject();
                    if(chatbeanManager.getSTR_MESSAGE()!=null){
                        System.out.println(chatbeanManager.getSTR_MESSAGE());
                    }
                    if(chatbeanManager.getSTR_MESSAGE()!=null){
                        msgRecieved = chatbeanManager.getSTR_MESSAGE();
                        chatWindow.jtaRecTXTMSG.setText("Rec: "+msgRecieved);
                        
                    }
                    
                    
                    if(chatbeanManager.getNAME_OF_FILE()!=null){
                  
                        file_NAME = chatbeanManager.getNAME_OF_FILE();
                        enc_File_Contents = chatbeanManager.getSTR_FILE_CONTENTS();
                        System.out.println("Recieved File Contents: ");
                        System.out.println(enc_File_Contents);
                        
                        //AESAlgorithm aes = new AESAlgorithm(chatWindow.sharedKey);
                        //dec_File_Contents  = aes.decrypt(enc_File_Contents);
                        FileWriterApp  fileWriter = new FileWriterApp();
                        fileWriter.writeGivenFile(file_NAME,enc_File_Contents);
                        chatWindow.jtfRecFile.setText(file_NAME);
                    }

                    
                }catch(Exception e){
                    
                }
            }
        }
    }
}