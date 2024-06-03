/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Core;

import Core.Actions.ButtonActions;
import Core.ReadNLearnForm.StoryLearning;
import Core.ReadNLearnForm.VideoLearning;
import HomePage.HomePage;
import Utilities.MusicPlayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Marc
 */
public class ReadNLearn extends javax.swing.JFrame {

    private MusicPlayer musicPlayer;

    /**
     * Creates new form ReadNLearn
     */
    public ReadNLearn() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        separateButtonsAnimation();
        sLearningButton.setOpaque(false);
        sLearningButton.setContentAreaFilled(false);
        sLearningButton.setBorderPainted(false);
        sLearningButton.setBackground(new Color(0, 0, 0, 0));

        vLessonButton.setOpaque(false);
        vLessonButton.setContentAreaFilled(false);
        vLessonButton.setBorderPainted(false);
        vLessonButton.setBackground(new Color(0, 0, 0, 0));

        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setBackground(new Color(0, 0, 0, 0));

        musicPlayer = MusicPlayer.getInstance();

        ButtonActions.setCursorForButtons(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR), sLearningButton, vLessonButton, backButton);
    }

    private void separateButtonsAnimation() {
        int initialX1 = sLearningButton.getX();
        int initialX2 = vLessonButton.getX();

        Timer timer = new Timer(10, new ActionListener() {
            int distanceMoved = 0;
            final int separationDistance = 150; // Adjust this value as needed for longer separation

            @Override
            public void actionPerformed(ActionEvent e) {
                if (distanceMoved < separationDistance) {
                    // Move the buttons apart
                    sLearningButton.setLocation(sLearningButton.getX() - 1, sLearningButton.getY());
                    vLessonButton.setLocation(vLessonButton.getX() + 1, vLessonButton.getY());
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

        vLessonButton = new javax.swing.JButton();
        sLearningButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vLessonButton.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        vLessonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VideoLesson_Button.png"))); // NOI18N
        vLessonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vLessonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(vLessonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 180, 380, 610));

        sLearningButton.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        sLearningButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StoryLearning_Button.png"))); // NOI18N
        sLearningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sLearningButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sLearningButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, 380, 600));

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 980, 170, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment(Background).gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1070));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sLearningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sLearningButtonActionPerformed
        // TODO add your handling code here:
        MusicPlayer.getInstance().buttonClickedSound("click");

        StoryLearning storyLearning = new StoryLearning();
        storyLearning.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sLearningButtonActionPerformed

    private void vLessonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vLessonButtonActionPerformed
        // TODO add your handling code here:
        MusicPlayer.getInstance().buttonClickedSound("click");

        VideoLearning videoLearning = new VideoLearning();
        videoLearning.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vLessonButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MusicPlayer.getInstance().buttonClickedSound("click");

        HomePage homepage = new HomePage();
        homepage.setVisible(true);
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
            java.util.logging.Logger.getLogger(ReadNLearn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadNLearn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadNLearn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadNLearn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadNLearn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sLearningButton;
    private javax.swing.JButton vLessonButton;
    // End of variables declaration//GEN-END:variables
}
