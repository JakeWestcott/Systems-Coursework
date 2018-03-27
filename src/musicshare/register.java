/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicshare;

/**
 *
 * @author Theo
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField_username = new javax.swing.JTextField();
        textField_pob = new javax.swing.JTextField();
        textField_dob = new javax.swing.JTextField();
        label_username = new javax.swing.JLabel();
        label_pob = new javax.swing.JLabel();
        label_dob = new javax.swing.JLabel();
        label_profile = new javax.swing.JLabel();
        label_cancel = new javax.swing.JLabel();
        comboBox_genre = new javax.swing.JComboBox<>();
        botton_addProfile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_genre = new javax.swing.JTextArea();
        button_register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Music Share - Register");

        textField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_usernameActionPerformed(evt);
            }
        });

        label_username.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        label_username.setText("Username");

        label_pob.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        label_pob.setText("Place of Birth");

        label_dob.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        label_dob.setText("Date of Birth");

        label_profile.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        label_profile.setText("Music Profile:");

        label_cancel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        label_cancel.setText("or Cancel");

        comboBox_genre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        comboBox_genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classical", "Country", "Dance", "Hip Hop / Rap", "Indie", "Jazz", "Opera", "Pop", "R&B / Soul", "Reggae", "Rock", " " }));

        botton_addProfile.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        botton_addProfile.setText("Add");

        textArea_genre.setColumns(20);
        textArea_genre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        textArea_genre.setRows(5);
        jScrollPane1.setViewportView(textArea_genre);

        button_register.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        button_register.setText("Register");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_register)
                    .addComponent(label_pob)
                    .addComponent(label_username)
                    .addComponent(label_dob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField_username)
                            .addComponent(textField_pob, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textField_dob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_cancel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_profile)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(comboBox_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botton_addProfile))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_username)
                                    .addComponent(textField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBox_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botton_addProfile)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_profile)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_pob)
                            .addComponent(textField_pob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_dob)
                            .addComponent(textField_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_register)
                    .addComponent(label_cancel))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_usernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botton_addProfile;
    private javax.swing.JButton button_register;
    private javax.swing.JComboBox<String> comboBox_genre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_cancel;
    private javax.swing.JLabel label_dob;
    private javax.swing.JLabel label_pob;
    private javax.swing.JLabel label_profile;
    private javax.swing.JLabel label_username;
    private javax.swing.JTextArea textArea_genre;
    private javax.swing.JTextField textField_dob;
    private javax.swing.JTextField textField_pob;
    private javax.swing.JTextField textField_username;
    // End of variables declaration//GEN-END:variables
}
