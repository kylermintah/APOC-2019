/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.io.*;
/**
 *
 * @author Kyler Mintah
 */
public class LogInScreen extends javax.swing.JFrame {

    private String username;
    private String password;
    /**
     * Creates new form LogInScreen
     */
    public LogInScreen() {
        initComponents();
       this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JPanel();
        nextButton = new javax.swing.JPanel();
        previousButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField.setText("Username");
        usernameTextField.setBorder(null);
        getContentPane().add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 320, 50));

        passwordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTextField.setText("Password");
        passwordTextField.setBorder(null);
        getContentPane().add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 415, 320, 50));

        submitButton.setBorderPainted(false);
        submitButton.setContentAreaFilled(false);
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 270, 60));

        logoutButton.setOpaque(false);
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout logoutButtonLayout = new javax.swing.GroupLayout(logoutButton);
        logoutButton.setLayout(logoutButtonLayout);
        logoutButtonLayout.setHorizontalGroup(
            logoutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        logoutButtonLayout.setVerticalGroup(
            logoutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, -1, -1));

        nextButton.setOpaque(false);
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout nextButtonLayout = new javax.swing.GroupLayout(nextButton);
        nextButton.setLayout(nextButtonLayout);
        nextButtonLayout.setHorizontalGroup(
            nextButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        nextButtonLayout.setVerticalGroup(
            nextButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 690, -1, -1));

        previousButton.setOpaque(false);
        previousButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout previousButtonLayout = new javax.swing.GroupLayout(previousButton);
        previousButton.setLayout(previousButtonLayout);
        previousButtonLayout.setHorizontalGroup(
            previousButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        previousButtonLayout.setVerticalGroup(
            previousButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(previousButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        usernameTextField.setText("Username");
        passwordTextField.setText("Password");
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        // TODO add your handling code here:
        username = usernameTextField.getText();
        password = passwordTextField.getText();
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid "
                    + "username and password.");
        } else {
            try {
                LoginBackend log = new LoginBackend("src/Data.txt");
                if (log.login(username, password)) {
                    //Transition to main survey here
                    
                    QuickScreen qs = new QuickScreen();
                    qs.setLocationRelativeTo(null);
                    this.setVisible(false);
                    qs.setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username "
                            + "or password");
                }
            } catch (IOException e) {
                System.out.println("Error accessing file");
            }
        }
    }//GEN-LAST:event_nextButtonMouseClicked

    private void previousButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousButtonMouseClicked
        // TODO add your handling code here:
//        usernameTextField.setText("Username");
//        passwordTextField.setText("Password");
new LanguageScreen().setVisible(true);
this.setVisible(false);


    }//GEN-LAST:event_previousButtonMouseClicked

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        // TODO add your handling code here:
        username = usernameTextField.getText();
        password = passwordTextField.getText();
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid "
                    + "username and password.");
        } else {
            try {
                LoginBackend log = new LoginBackend("src/Data.txt");
                if (log.login(username, password)) {
                    //Transition to main survey here
                     QuickScreen qs = new QuickScreen();
                    qs.setLocationRelativeTo(null);
                    this.setVisible(false);
                    qs.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username "
                            + "or password");
                }
            } catch (IOException e) {
                System.out.println("Error accessing file");
            }
        }
    }//GEN-LAST:event_submitButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel logoutButton;
    private javax.swing.JPanel nextButton;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JPanel previousButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
