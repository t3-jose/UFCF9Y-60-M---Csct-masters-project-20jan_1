package CS.NodeB;

import chatbeanmanager.ChatBeanManager;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


public class ChatWindowNodeTwo extends javax.swing.JFrame {

    public ObjectOutputStream ostream;
    public ObjectInputStream istream;
    public Socket chatSocket;
    ChatBeanManager chatbeanManager;
    public String sharedKey;

    
    JFileChooser jfc;
    File selectedFile;
    String file_NAME;
    String fileContents;
    String encFileContents;

    
    
    public String msgRecived;
    public String enc_MSG_RECIEVED;
    public String dec_MSG_RECIEVED;
    public String file_Name;
    public String enc_File_Content;
    public String dec_File_Content;
    
    String encMessageToSend;
    String msgToSend;
    
    
    public ChatWindowNodeTwo(String sharedKey) {
        this.sharedKey = sharedKey;
        initComponents();
    
        
        jfc = new JFileChooser();
        jfc.setMultiSelectionEnabled(false);
        jfc.setMultiSelectionEnabled(false);
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setDialogTitle("Select Any Text File");

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaTXTMSGSend = new javax.swing.JTextArea();
        btnSendTXTMSG = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaTXTMSGRec = new javax.swing.JTextArea();
        btnSelectFile = new javax.swing.JButton();
        jtfSelectFile = new javax.swing.JTextField();
        btnSendFile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfRecFile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Node Two");

        jLabel1.setText("Enter Text Message");

        jtaTXTMSGSend.setColumns(20);
        jtaTXTMSGSend.setRows(5);
        jScrollPane1.setViewportView(jtaTXTMSGSend);

        btnSendTXTMSG.setText("Send");
        btnSendTXTMSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendTXTMSGActionPerformed(evt);
            }
        });

        jtaTXTMSGRec.setColumns(20);
        jtaTXTMSGRec.setRows(5);
        jScrollPane2.setViewportView(jtaTXTMSGRec);

        btnSelectFile.setText("Select File");
        btnSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFileActionPerformed(evt);
            }
        });

        btnSendFile.setText("Send");
        btnSendFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFileActionPerformed(evt);
            }
        });

        jLabel3.setText("Recieved File");

        jLabel4.setText("------File Operations----");

        jButton1.setText("Start Node 2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rec.setText("Recieved  Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnSendTXTMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSelectFile)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfSelectFile)
                                    .addComponent(btnSendFile, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfRecFile, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSendTXTMSG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rec))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectFile))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSendFile)
                                .addGap(18, 18, 18)
                                .addComponent(jtfRecFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendTXTMSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendTXTMSGActionPerformed
        
        try{
            ChatBeanManager cbm = new ChatBeanManager();
            cbm.setSTR_MESSAGE(jtaTXTMSGSend.getText());
            ostream.writeObject(cbm);
            
        }catch(Exception e){
            
        }

    }//GEN-LAST:event_btnSendTXTMSGActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            chatSocket = new Socket(Settings.NODES_CHAT_HOST, Settings.NODES_CHAT_PORT);
            openStreams();
            System.out.println("Connected To Node 1");
            ChatBeanManager cbm = new ChatBeanManager();
            cbm.setSTR_MESSAGE("Connected To Node 1");
            ostream.writeObject(cbm);
            ChatNodeThreadTwo chatNodeTwo = new ChatNodeThreadTwo();
            chatNodeTwo.start();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFileActionPerformed
        
        int result = jfc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = jfc.getSelectedFile();
            System.out.println(selectedFile.toPath());
            file_NAME = selectedFile.getName();
            //System.out.println(selectedFile);
            System.out.println(file_NAME);
            FileReaderApp fileReader = new FileReaderApp();
            fileContents = fileReader.readGivenFile(selectedFile.toPath().toString());
            jtfSelectFile.setText(file_NAME);
        }
    }//GEN-LAST:event_btnSelectFileActionPerformed

    private void btnSendFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFileActionPerformed
        try {
            ChatBeanManager cbm = new ChatBeanManager();
            cbm.setSTR_FILE_CONTENTS(fileContents);
            cbm.setNAME_OF_FILE(file_NAME);
            ostream.writeObject(cbm);
        } catch (IOException ex) {
            Logger.getLogger(ChatWindowNodeTwo.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_btnSendFileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatWindowNodeTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatWindowNodeTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatWindowNodeTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatWindowNodeTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ChatWindowNodeTwo("lv39eptlvuhaqqsr").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSelectFile;
    public javax.swing.JButton btnSendFile;
    public javax.swing.JButton btnSendTXTMSG;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextArea jtaTXTMSGRec;
    public javax.swing.JTextArea jtaTXTMSGSend;
    public javax.swing.JTextField jtfRecFile;
    public javax.swing.JTextField jtfSelectFile;
    private javax.swing.JLabel rec;
    // End of variables declaration//GEN-END:variables

    private void openStreams() {
        try {
            ostream = new ObjectOutputStream(chatSocket.getOutputStream());
            istream = new ObjectInputStream(chatSocket.getInputStream());
        } catch (Exception e) {
        }
    }

    
    public class ChatNodeThreadTwo extends Thread {

        public ChatNodeThreadTwo() {
        }
        
        public void run(){
            while(true){
                try{
                    chatbeanManager = (ChatBeanManager) istream.readObject();
                    
                    if(chatbeanManager.getSTR_MESSAGE()!=null){
                        System.out.println("Recieved Message: "+chatbeanManager.getSTR_MESSAGE());
                    }
                    
                    if(chatbeanManager.getSTR_MESSAGE()!=null){
                        msgRecived = chatbeanManager.getSTR_MESSAGE();
                        jtaTXTMSGRec.setText("REC: "+msgRecived);
                        
                        
                    }
                    
                    if(chatbeanManager.getNAME_OF_FILE()!=null){
                  
                        file_Name = chatbeanManager.getNAME_OF_FILE();
                        enc_File_Content = chatbeanManager.getSTR_FILE_CONTENTS();
                        //AESAlgorithm aes = new AESAlgorithm(sharedKey);
                        //dec_File_Content  = aes.decrypt(enc_File_Content);
                        System.out.println("Recieved File Contents: ");
                        System.out.println(enc_File_Content);
                        
                        FileWriterApp  fileWriter = new FileWriterApp();
                        fileWriter.writeGivenFile(file_Name,enc_File_Content);
                        jtfRecFile.setText(file_Name);
                    }
                    
                    
                }catch(Exception e){
                    
                }
            }
        }
    }
}