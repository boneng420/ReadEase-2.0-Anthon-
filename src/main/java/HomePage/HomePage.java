/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HomePage;

import Core.Assessment;
import Core.ReadNLearn;
import com.core.readease.StartingPage;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;
/**
 * @author Marc
 */
public class HomePage extends javax.swing.JFrame {
    
    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
       separateButtonsAnimation();
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setBackground(new Color(0, 0, 0, 0));
        
        ReadNLearn.setOpaque(false);
        ReadNLearn.setContentAreaFilled(false);
        ReadNLearn.setBorderPainted(false);
        ReadNLearn.setBackground(new Color(0, 0, 0, 0));
        
        assessmentButton.setOpaque(false);
        assessmentButton.setContentAreaFilled(false);
        assessmentButton.setBorderPainted(false);
        assessmentButton.setBackground(new Color(0, 0, 0, 0));
    }
    private void separateButtonsAnimation() {
        int initialX1 = assessmentButton.getX();
        int initialX2 = ReadNLearn.getX();

        Timer timer = new Timer(10, new ActionListener() {
            int distanceMoved = 0;
            final int separationDistance = 200; // Adjust this value as needed for longer separation

            @Override
            public void actionPerformed(ActionEvent e) {
                if (distanceMoved < separationDistance) {
                    // Move the buttons apart
                    assessmentButton.setLocation(assessmentButton.getX() - 1, assessmentButton.getY());
                    ReadNLearn.setLocation(ReadNLearn.getX() + 1, ReadNLearn.getY());
                    distanceMoved++;
                } else {
                    ((Timer) e.getSource()).stop(); // Stop the timer
                }
            }
        });
        timer.start(); // Start the animation
    }
    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {
                java.awt.GridBagConstraints gridBagConstraints;

                ReadNLearn = new javax.swing.JButton();
                assessmentButton = new javax.swing.JButton();
                backButton = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new java.awt.GridBagLayout());

                ReadNLearn.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
                ReadNLearn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Read&Learn_Button(650x400).png"))); // NOI18N
                ReadNLearn.setPreferredSize(new java.awt.Dimension(200, 25));
                ReadNLearn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ReadNLearnMouseClicked(evt);
                        }
                });
                ReadNLearn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ReadNLearnActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.gridwidth = 3;
                gridBagConstraints.gridheight = 2;
                gridBagConstraints.ipady = 30;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(230, 1097, 0, 0);
                getContentPane().add(ReadNLearn, gridBagConstraints);

                assessmentButton.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
                assessmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment_Button( 650x400).png"))); // NOI18N
                assessmentButton.setPreferredSize(new java.awt.Dimension(200, 25));
                assessmentButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                assessmentButtonMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                assessmentButtonMouseExited(evt);
                        }
                });
                assessmentButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                assessmentButtonActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.gridheight = 2;
                gridBagConstraints.ipady = 30;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(230, 897, 0, 0);
                getContentPane().add(assessmentButton, gridBagConstraints);

                backButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backButtonActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.ipadx = 66;
                gridBagConstraints.ipady = 120;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(20, 23, 0, 0);
                getContentPane().add(backButton, gridBagConstraints);

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage.gif"))); // NOI18N
                jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1180));
                jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1180));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.gridwidth = 5;
                gridBagConstraints.gridheight = 4;
                gridBagConstraints.ipadx = 230;
                gridBagConstraints.ipady = 110;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
                getContentPane().add(jLabel1, gridBagConstraints);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.ipadx = 390;
                gridBagConstraints.ipady = 640;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(160, 1087, 0, 0);
                getContentPane().add(jLabel2, gridBagConstraints);

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
                        this.dispose();
			StartingPage startingpage = new StartingPage();
                         startingpage.setVisible(true);
                        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void ReadNLearnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadNLearnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReadNLearnActionPerformed

    private void ReadNLearnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReadNLearnMouseClicked
        // TODO add your handling code here:
        ReadNLearn readNLearn = new ReadNLearn();
        readNLearn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReadNLearnMouseClicked

    private void assessmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assessmentButtonActionPerformed
        // TODO add your handling code here:
        Assessment assessment = new Assessment();
        assessment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_assessmentButtonActionPerformed

    private void assessmentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assessmentButtonMouseExited
        // TODO add your handling code here:
        assessmentButton.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_assessmentButtonMouseExited

    private void assessmentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assessmentButtonMouseEntered
        // TODO add your handling code here:
        assessmentButton.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_assessmentButtonMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });

    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton ReadNLearn;
        private javax.swing.JButton assessmentButton;
        private javax.swing.JButton backButton;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        // End of variables declaration//GEN-END:variables

}
