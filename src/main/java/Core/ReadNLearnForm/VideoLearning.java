/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Core.ReadNLearnForm;

import Core.Actions.ButtonActions;
import Core.ReadNLearn;
import Utilities.MusicPlayer;

import java.awt.*;

/**
 * @author Marc
 */
public class VideoLearning extends javax.swing.JFrame {

    private MusicPlayer musicPlayer;

    /**
     * Creates new form VideoLearning
     */
    public VideoLearning() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

        returnButton.setOpaque(false);
        returnButton.setContentAreaFilled(false);
        returnButton.setBorderPainted(false);
        returnButton.setBackground(new Color(0, 0, 0, 0));

        nextButton.setOpaque(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setBorderPainted(false);
        nextButton.setBackground(new Color(0, 0, 0, 0));

        musicPlayer = MusicPlayer.getInstance();

        vowels1.setMusicPlayer(musicPlayer);
        consonants.setMusicPlayer(musicPlayer);

        ButtonActions.setCursorForButtons(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR), returnButton, nextButton);
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        letterSoundTabbedPane = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        vowels1 = new Core.ReadNLearnForm.VLessonsModules.Vowels();
        jScrollPane2 = new javax.swing.JScrollPane();
        consonants = new Core.ReadNLearnForm.VLessonsModules.Consonants();
        returnButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(vowels1);

        letterSoundTabbedPane.addTab("Lesson 1: Vowels", jScrollPane1);

        jScrollPane2.setViewportView(consonants);

        letterSoundTabbedPane.addTab("Lesson 2: Consonants", jScrollPane2);

        getContentPane().add(letterSoundTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1908, 891));

        returnButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back_Button__150x150.png"))); // NOI18N
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 90));

        nextButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next Button (150x150).png"))); // NOI18N
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 10, 160, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plain Background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 2130, 1370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        // TODO add your handling code here:
        int selectedIndex = letterSoundTabbedPane.getSelectedIndex();
        if (selectedIndex < letterSoundTabbedPane.getTabCount() - 1) {
            letterSoundTabbedPane.setSelectedIndex(selectedIndex + 1);
        } else {
            letterSoundTabbedPane.setSelectedIndex(0);
        }
    }//GEN-LAST:event_nextButtonMouseClicked

    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
        // TODO add your handling code here:
        int selectedIndex = letterSoundTabbedPane.getSelectedIndex();
        if (selectedIndex > 0) {
            letterSoundTabbedPane.setSelectedIndex(selectedIndex - 1);
        } else {
            VideoLearning.this.dispose();
            ReadNLearn readNLearn = new ReadNLearn();
            readNLearn.setVisible(true);
        }
    }//GEN-LAST:event_returnButtonMouseClicked

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VideoLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoLearning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Core.ReadNLearnForm.VLessonsModules.Consonants consonants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane letterSoundTabbedPane;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton returnButton;
    private Core.ReadNLearnForm.VLessonsModules.Vowels vowels1;
    // End of variables declaration//GEN-END:variables
}
