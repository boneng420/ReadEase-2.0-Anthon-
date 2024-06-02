/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Core;

import Core.AssessmentPage.OralAssessment;
import Core.AssessmentPage.TakeChallengeAssessment;
import java.awt.Color;
import HomePage.HomePage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * @author Marc
 */
public class Assessment extends javax.swing.JFrame {

    /**
     * Creates new form Assessment
     */
    public Assessment() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        separateButtonsAnimation();
        oralAssessmentButton.setOpaque(false);
        oralAssessmentButton.setContentAreaFilled(false);
        oralAssessmentButton.setBorderPainted(false);
        oralAssessmentButton.setBackground(new Color(0, 0, 0, 0));
        
        takeChallengeButton.setOpaque(false);
        takeChallengeButton.setContentAreaFilled(false);
        takeChallengeButton.setBorderPainted(false);
        takeChallengeButton.setBackground(new Color(0, 0, 0, 0));
        
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setBackground(new Color(0, 0, 0, 0));
    }
     private void separateButtonsAnimation() {
        int initialX1 = oralAssessmentButton.getX();
        int initialX2 = takeChallengeButton.getX();

        Timer timer = new Timer(10, new ActionListener() {
            int distanceMoved = 0;
            final int separationDistance = 150; // Adjust this value as needed for longer separation

            @Override
            public void actionPerformed(ActionEvent e) {
                if (distanceMoved < separationDistance) {
                    // Move the buttons apart
                    oralAssessmentButton.setLocation(oralAssessmentButton.getX() - 1, oralAssessmentButton.getY());
                    takeChallengeButton.setLocation(takeChallengeButton.getX() + 1, takeChallengeButton.getY());
                    distanceMoved++;
                } else {
                    ((Timer) e.getSource()).stop(); // Stop the timer
                }
            }
        });
        timer.start();
     }
    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oralAssessmentButton = new javax.swing.JButton();
        takeChallengeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oralAssessmentButton.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        oralAssessmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OAButton.png"))); // NOI18N
        oralAssessmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oralAssessmentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(oralAssessmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 120, 390, 600));

        takeChallengeButton.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        takeChallengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TakeChallenge(Button).png"))); // NOI18N
        takeChallengeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeChallengeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(takeChallengeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 100, 370, 620));

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 940, 120, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment(Background).gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1920, 1000));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void oralAssessmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oralAssessmentButtonActionPerformed
        // TODO add your handling code here:
        OralAssessment oralAssessment = new OralAssessment();
        oralAssessment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_oralAssessmentButtonActionPerformed

    private void takeChallengeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeChallengeButtonActionPerformed
        // TODO add your handling code here:
        TakeChallengeAssessment takeChallengeAssessment = new TakeChallengeAssessment();
        takeChallengeAssessment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_takeChallengeButtonActionPerformed

        private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
                // TODO add your handling code here:
		HomePage homePage = new HomePage();
		homePage.setVisible(true);
		this.dispose();
        }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Assessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assessment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton oralAssessmentButton;
    private javax.swing.JButton takeChallengeButton;
    // End of variables declaration//GEN-END:variables
}
