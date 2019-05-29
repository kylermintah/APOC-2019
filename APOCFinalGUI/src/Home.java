/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.python.util.PythonInterpreter;

/**
 *
 * @author Kyler Mintah
 */
public class Home extends javax.swing.JFrame {
private int q1 =-1; 
private int q2 =-1; 
private int q3 =-1; 
private int q4 =-1; 


    /**
     * Creates new form Home
     */
    public Home() {
        this.setLocationRelativeTo(null);
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

        Question2 = new javax.swing.ButtonGroup();
        Question3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        QoneOone = new javax.swing.JRadioButton();
        QoneOtwo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        QtwoOone = new javax.swing.JRadioButton();
        QtwoOtwo = new javax.swing.JRadioButton();
        QtwoOthree = new javax.swing.JRadioButton();
        QfourOfour = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        cholesterolField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Male");

        jLabel3.setText("Female");

        Question2.add(QoneOone);
        QoneOone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QoneOoneActionPerformed(evt);
            }
        });

        Question2.add(QoneOtwo);
        QoneOtwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QoneOtwoActionPerformed(evt);
            }
        });

        jLabel6.setText("Question 2: Sex");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        Question3.add(QtwoOone);
        QtwoOone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtwoOoneActionPerformed(evt);
            }
        });

        Question3.add(QtwoOtwo);
        QtwoOtwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtwoOtwoActionPerformed(evt);
            }
        });

        Question3.add(QtwoOthree);
        QtwoOthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtwoOthreeActionPerformed(evt);
            }
        });

        Question3.add(QfourOfour);
        QfourOfour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QfourOfourActionPerformed(evt);
            }
        });

        jLabel8.setText("Question 3: Chest Pain");

        jLabel16.setText("Question 1: Age");

        jLabel4.setText("typical angina");

        jLabel5.setText("atypical angina");

        jLabel7.setText("non-anginal pain");

        jLabel9.setText("asymptomatic");

        jLabel10.setText("Question 4: Cholesterol");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(QoneOone))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(QoneOtwo))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel3))))
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(QtwoOone)))
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(QtwoOtwo)
                                            .addGap(25, 25, 25)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(QtwoOthree)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(57, 57, 57)
                                            .addComponent(QfourOfour))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addComponent(jLabel9)))
                                    .addGap(10, 10, 10)))
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel1)))
                        .addContainerGap(460, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitButton))
                        .addContainerGap(772, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cholesterolField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(QoneOone)
                    .addComponent(QoneOtwo))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QtwoOtwo)
                            .addComponent(QtwoOone, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(QtwoOthree)
                            .addComponent(QfourOfour))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(284, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(cholesterolField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(submitButton)
                        .addContainerGap(157, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean checkRadioButtons(){
        boolean result = true;
        if (Question2.getSelection()== null){
            result = false;
        } 
        if (Question3.getSelection()== null){
            result = false;
        }
        
        return result;
    }
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
         // TODO add your handling code here:
        
        //Verify Input
        boolean valid = true;
        if (!cholesterolField.getText().trim().isEmpty()){
            try{
              q1 = Integer.parseInt(ageField.getText());
            }catch (NumberFormatException ex) {
                //handle exception here
                JOptionPane.showMessageDialog(null, "Please enter a valid age");
                valid = false;
                q1 = -1;
            } finally{
                 System.out.println("Question 1 registered. Answer = "+q1);
            }
        }
        else{
            valid = false;
        }
            valid = checkRadioButtons();
            if (!cholesterolField.getText().trim().isEmpty()){
            try{
              q4 = Integer.parseInt(cholesterolField.getText());
            }catch (NumberFormatException ex) {
                //handle exception here
                JOptionPane.showMessageDialog(null, "Please enter a valid cholesterol level");
                valid = false;
                q4 = -1;
            } finally {
                System.out.println("Question 4 registered. Answer = "+q4);
            }
            } else{
                valid = false;
            }
            if (valid == true){
                Parsing obj = new Parsing(q1,q2,q3,q4);
                obj.submit("entry.txt");
                
                 Properties p = new Properties();
         
            p.setProperty("python.path", "C:/githubProjects/APOC-2019/jython2.7.0");
            p.setProperty("python.home", "C:/githubProjects/APOC-2019/jython2.7.0");
            p.setProperty("python.prefix", "C:/githubProjects/APOC-2019/jython2.7.0");
            PythonInterpreter.initialize(p,p, new String[0]);
                
            PythonInterpreter interp = new PythonInterpreter();
            InputStream br = null;
            try {
                br = new BufferedInputStream(new FileInputStream("C:\\githubProjects\\APOC-2019\\apoc_code.py"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            interp.execfile(br);
            interp.close();
            } else{
                JOptionPane.showMessageDialog(null, "Please enter all fields correctly");
            }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void QoneOoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QoneOoneActionPerformed
        // TODO add your handling code here:
        q2 = 1;
    }//GEN-LAST:event_QoneOoneActionPerformed

    private void QoneOtwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QoneOtwoActionPerformed
        // TODO add your handling code here:
        q2 = 0;
    }//GEN-LAST:event_QoneOtwoActionPerformed

    private void QtwoOoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtwoOoneActionPerformed
        // TODO add your handling code here:
        q3 = 0;
    }//GEN-LAST:event_QtwoOoneActionPerformed

    private void QtwoOtwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtwoOtwoActionPerformed
        // TODO add your handling code here:
        q3 = 1;
    }//GEN-LAST:event_QtwoOtwoActionPerformed

    private void QtwoOthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtwoOthreeActionPerformed
        // TODO add your handling code here:
        q3 = 2;
    }//GEN-LAST:event_QtwoOthreeActionPerformed

    private void QfourOfourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QfourOfourActionPerformed
        // TODO add your handling code here:
        q3 = 3;
    }//GEN-LAST:event_QfourOfourActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton QfourOfour;
    private javax.swing.JRadioButton QoneOone;
    private javax.swing.JRadioButton QoneOtwo;
    private javax.swing.JRadioButton QtwoOone;
    private javax.swing.JRadioButton QtwoOthree;
    private javax.swing.JRadioButton QtwoOtwo;
    private javax.swing.ButtonGroup Question2;
    private javax.swing.ButtonGroup Question3;
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField cholesterolField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
