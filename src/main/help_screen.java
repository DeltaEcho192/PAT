/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class help_screen extends javax.swing.JFrame {

    /**
     * Creates new form help_screen
     */
    public help_screen() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
    }
    
    main M = new main();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        loginB = new javax.swing.JButton();
        patientB = new javax.swing.JButton();
        pharmacyB = new javax.swing.JButton();
        financeB = new javax.swing.JButton();
        doctorB = new javax.swing.JButton();
        backB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        helpL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        helpL.setText("Help Screen");

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane1.setViewportView(outputTextArea);

        loginB.setText("Login");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });

        patientB.setText("Paitent");
        patientB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBActionPerformed(evt);
            }
        });

        pharmacyB.setText("Pharmcy");
        pharmacyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyBActionPerformed(evt);
            }
        });

        financeB.setText("Finance");
        financeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeBActionPerformed(evt);
            }
        });

        doctorB.setText("Doctor");
        doctorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorBActionPerformed(evt);
            }
        });

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpL)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patientB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pharmacyB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(financeB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doctorB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(143, 143, 143)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpL)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginB)
                        .addGap(32, 32, 32)
                        .addComponent(patientB)
                        .addGap(28, 28, 28)
                        .addComponent(pharmacyB)
                        .addGap(30, 30, 30)
                        .addComponent(financeB)
                        .addGap(37, 37, 37)
                        .addComponent(doctorB)
                        .addGap(259, 259, 259)
                        .addComponent(backB))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Calls method from main class and uses a integer to define what section of the help menu is to be displayed.
    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        main_screen MainSc = new main_screen();
        MainSc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBActionPerformed

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
        outputTextArea.setText(M.fileReader(0));
    }//GEN-LAST:event_loginBActionPerformed

    private void patientBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBActionPerformed
        outputTextArea.setText(M.fileReader(2));
    }//GEN-LAST:event_patientBActionPerformed

    private void pharmacyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyBActionPerformed
        outputTextArea.setText(M.fileReader(1));
    }//GEN-LAST:event_pharmacyBActionPerformed

    private void financeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeBActionPerformed
        outputTextArea.setText(M.fileReader(4));
    }//GEN-LAST:event_financeBActionPerformed

    private void doctorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorBActionPerformed
        outputTextArea.setText(M.fileReader(3));
    }//GEN-LAST:event_doctorBActionPerformed

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
            java.util.logging.Logger.getLogger(help_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(help_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(help_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(help_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new help_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JButton doctorB;
    private javax.swing.JButton financeB;
    private javax.swing.JLabel helpL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginB;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JButton patientB;
    private javax.swing.JButton pharmacyB;
    // End of variables declaration//GEN-END:variables
}
