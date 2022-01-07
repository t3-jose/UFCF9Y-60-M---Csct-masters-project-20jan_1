package UI;

import capricorn.HoneypotManager;
import capricorn.argument;

public class SystemProtection extends javax.swing.JFrame {

    /**
     * Creates new form SystemProtection
     */
    public SystemProtection() {
        initComponents();
        help();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("System Protection"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Choose Your Operation");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Install", "Uninstall", "Repair", "Guard", "Help" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 157, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            if(this.jComboBox1.getSelectedItem().toString().equals("Install")){
                install();
            }else if(this.jComboBox1.getSelectedItem().toString().equals("Uninstall")){
                uninstall();
            }else if(this.jComboBox1.getSelectedItem().toString().equals("Repair")){
                repair();
            }else if(this.jComboBox1.getSelectedItem().toString().equals("Guard")){
                guard();
            
            }else if(this.jComboBox1.getSelectedItem().toString().equals("Help")){
                help();
            }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(SystemProtection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemProtection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemProtection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemProtection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemProtection().setVisible(true);
            }
        });
    }

    // Variables declaration //GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables


private void help() {
        jTextArea1.setText("");
        jTextArea1.append(" -----------------------------------------------------------------\n");
        jTextArea1.append(" guard        monitor the system\n");
        jTextArea1.append(" install      install the honeypot folders and monitor the system afterwards\n");
        jTextArea1.append(" repair       replace all the honeypot files, this should be done after a blocked ransomware attack\n");
        jTextArea1.append(" scan         scan for files with a specific file extension, which should be supplied as an additional parameter\n");
        jTextArea1.append(" uninstall    remove all the honeypot files and folders from the system\n");
        jTextArea1.append(" status       show the location of the honeypot folders\n");
        jTextArea1.append(" -----------------------------------------------------------------\n");
        
    }


private  void repair() {
        jTextArea1.setText("");
        jTextArea1.append("[+]The bees are repairing the honeypots. Please give them a minute.\n");
        HoneypotManager honeypotManager = new HoneypotManager(argument.REPAIR, null);
        jTextArea1.append("[+]The honeypots have succesfully been repaired! The bees can now guard your system again.\n");
    }

    /**
     * The uninstall function removes the files from the honeypots and also
     * deletes the honeypot folders
     */
    private  void uninstall() {
        jTextArea1.setText("");
        jTextArea1.append("[+]Emptying the honeypots and removing the honeypot folders\n");
        HoneypotManager honeypotManager = new HoneypotManager(argument.UNINSTALL, null);
        jTextArea1.append("[+]Uninstalling is now complete, Capricorn's honeypots have been removed from the system.\n");
    }

    /**
     * The install function creates the honeypot folders and fills them with
     * honeypot files
     */
    private  void install() {
        jTextArea1.setText("");
        jTextArea1.append("[+]Setting up the honeypots. Bees can easily be distracted, so give them a minute.\n");
        HoneypotManager honeypotManager = new HoneypotManager(argument.INSTALL, null);
        jTextArea1.append("[+]The bees have succesfully filled the honeypots!\n");
    }
    private  void scan(String fileExtension) {
        jTextArea1.append("[+]Scanning for encrypted files in the honeypot folders \n");
        HoneypotManager honeypotManager = new HoneypotManager(argument.SCAN, fileExtension);
    }

    /**
     * The guard function monitors the honeypot folders on changes and protects
     * the system whenever needed. After installing, this is the only function
     * that needs to be called to start the monitoring process
     */
    private  void guard() {
        jTextArea1.setText("");
        jTextArea1.append("[+]The guards are spread out and are will alert the hive if there is danger ahead! You can continue to work safely!\n");
        HoneypotManager honeypotManager = new HoneypotManager(argument.GUARD, null);
    }

        private static void printArgs() {
        System.getProperties().list(System.out);
    }
}
