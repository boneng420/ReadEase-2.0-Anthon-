/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Core.ReadNLearnForm.VLessonsModules;

import Core.Actions.ButtonActions;

import javax.swing.*;
import java.awt.*;

/**
 * @author Marc
 */
public class Consonants extends javax.swing.JPanel {

    //    Methods creates a hand cursor for the labels
    private void setHandCursor(JLabel... labels) {
        for (JLabel label : labels) {
            label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }

    /**
     * Creates new form Vowel
     */
    public Consonants() {
        initComponents();

        setHandCursor(BbLabel, CcLabel, DdLabel, FfLabel, GgLabel, HhLabel, JjLabel, KkLabel, LlLabel, MmLabel, NnLabel, PpLabel, QqLabel, RrLabel, SsLabel, TtLabel, VvLabel, WwLabel, XxLabel, YyLabel, ZzLabel);
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                BbLabel = new javax.swing.JLabel();
                CcLabel = new javax.swing.JLabel();
                DdLabel = new javax.swing.JLabel();
                FfLabel = new javax.swing.JLabel();
                GgLabel = new javax.swing.JLabel();
                HhLabel = new javax.swing.JLabel();
                JjLabel = new javax.swing.JLabel();
                KkLabel = new javax.swing.JLabel();
                LlLabel = new javax.swing.JLabel();
                MmLabel = new javax.swing.JLabel();
                NnLabel = new javax.swing.JLabel();
                PpLabel = new javax.swing.JLabel();
                QqLabel = new javax.swing.JLabel();
                RrLabel = new javax.swing.JLabel();
                SsLabel = new javax.swing.JLabel();
                TtLabel = new javax.swing.JLabel();
                VvLabel = new javax.swing.JLabel();
                WwLabel = new javax.swing.JLabel();
                XxLabel = new javax.swing.JLabel();
                YyLabel = new javax.swing.JLabel();
                ZzLabel = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();

                BbLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                BbLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Bb.png"))); // NOI18N
                BbLabel.setText("/bi:/ B for boy");
                BbLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                BbLabelMouseClicked(evt);
                        }
                });

                CcLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                CcLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Cc.png"))); // NOI18N
                CcLabel.setText("/si:/ C for cat");
                CcLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                CcLabelMouseClicked(evt);
                        }
                });

                DdLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                DdLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Dd.png"))); // NOI18N
                DdLabel.setText("/di:/ D for duck");
                DdLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                DdLabelMouseClicked(evt);
                        }
                });

                FfLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                FfLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Ff.png"))); // NOI18N
                FfLabel.setText("/ɛf/ F for fish");
                FfLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                FfLabelMouseClicked(evt);
                        }
                });

                GgLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                GgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Gg.png"))); // NOI18N
                GgLabel.setText("/dʒi:/ G for girl");
                GgLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                GgLabelMouseClicked(evt);
                        }
                });

                HhLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                HhLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Hh.png"))); // NOI18N
                HhLabel.setText("/eɪtʃ/ H for hat");

                JjLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                JjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Jj.png"))); // NOI18N
                JjLabel.setText("/dʒeɪ/ J for jelly");
                JjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                JjLabelMouseClicked(evt);
                        }
                });

                KkLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                KkLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Kk.png"))); // NOI18N
                KkLabel.setText("/keɪ/ K for kite");
                KkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                KkLabelMouseClicked(evt);
                        }
                });

                LlLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                LlLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Ll.png"))); // NOI18N
                LlLabel.setText("/ɛl/ L for lion");
                LlLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                LlLabelMouseClicked(evt);
                        }
                });

                MmLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                MmLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Mm.png"))); // NOI18N
                MmLabel.setText("/ɛm/ M for moon");
                MmLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                MmLabelMouseClicked(evt);
                        }
                });

                NnLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                NnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Nn.png"))); // NOI18N
                NnLabel.setText("/ɛn/ N for net");
                NnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                NnLabelMouseClicked(evt);
                        }
                });

                PpLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                PpLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Pp.png"))); // NOI18N
                PpLabel.setText("/piː/ P for pizza");
                PpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                PpLabelMouseClicked(evt);
                        }
                });

                QqLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                QqLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Qq.png"))); // NOI18N
                QqLabel.setText("/kju:/ Q for queen");
                QqLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                QqLabelMouseClicked(evt);
                        }
                });

                RrLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                RrLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Rr.png"))); // NOI18N
                RrLabel.setText("/ɑ:/ R for rabbit");
                RrLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                RrLabelMouseClicked(evt);
                        }
                });

                SsLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                SsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Ss.png"))); // NOI18N
                SsLabel.setText("/ɛs/ S for sun");
                SsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                SsLabelMouseClicked(evt);
                        }
                });

                TtLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                TtLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Tt.png"))); // NOI18N
                TtLabel.setText("/ti:/ T for table");
                TtLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                TtLabelMouseClicked(evt);
                        }
                });

                VvLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                VvLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Vv.png"))); // NOI18N
                VvLabel.setText("/vi:/ V for van");
                VvLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                VvLabelMouseClicked(evt);
                        }
                });

                WwLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                WwLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Ww.jpg"))); // NOI18N
                WwLabel.setText("/ˈdʌbəlˌju:/ W for window");
                WwLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                WwLabelMouseClicked(evt);
                        }
                });

                XxLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                XxLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Xx.png"))); // NOI18N
                XxLabel.setText("/ɛks/ X as in box");
                XxLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                XxLabelMouseClicked(evt);
                        }
                });

                YyLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                YyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Yy.png"))); // NOI18N
                YyLabel.setText("/waɪ/ Y for yoghurt");
                YyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                YyLabelMouseClicked(evt);
                        }
                });

                ZzLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
                ZzLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alphabet letters/Consonants/Zz.png"))); // NOI18N
                ZzLabel.setText("/zi:/ Z for zebra");
                ZzLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ZzLabelMouseClicked(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("CONSONANTS");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GgLabel)
                                        .addComponent(JjLabel)
                                        .addComponent(LlLabel)
                                        .addComponent(NnLabel)
                                        .addComponent(QqLabel)
                                        .addComponent(SsLabel)
                                        .addComponent(VvLabel)
                                        .addComponent(XxLabel)
                                        .addComponent(DdLabel)
                                        .addComponent(BbLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(KkLabel)
                                        .addComponent(HhLabel)
                                        .addComponent(MmLabel)
                                        .addComponent(PpLabel)
                                        .addComponent(RrLabel)
                                        .addComponent(TtLabel)
                                        .addComponent(WwLabel)
                                        .addComponent(YyLabel)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FfLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(CcLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(56, 56, 56))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(ZzLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CcLabel)
                                        .addComponent(BbLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DdLabel)
                                        .addComponent(FfLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GgLabel)
                                        .addComponent(HhLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JjLabel)
                                        .addComponent(KkLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LlLabel)
                                        .addComponent(MmLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NnLabel)
                                        .addComponent(PpLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(QqLabel)
                                        .addComponent(RrLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SsLabel)
                                        .addComponent(TtLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(VvLabel)
                                        .addComponent(WwLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(XxLabel)
                                        .addComponent(YyLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(ZzLabel)
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

    String[] consonants = {"Bb", "Cc", "Dd", "Ff", "Gg", "Hh", "Jj", "Kk", "Ll", "Mm", "Nn", "Pp", "Qq", "Rr", "Ss", "Tt", "Vv", "Ww", "Xx", "Yy", "Zz"};
    int[] consonantsDurationInSeconds = {15, 24, 13, 14, 24, 14, 12, 13, 12, 14, 14, 14, 14, 14, 14, 12, 13, 12, 15, 18, 16};

    private void BbLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BbLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[0], consonants[0], false);
    }//GEN-LAST:event_BbLabelMouseClicked


    private void CcLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CcLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[1], consonants[1], false);
    }//GEN-LAST:event_CcLabelMouseClicked

    private void DdLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DdLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[2], consonants[2], false);
    }//GEN-LAST:event_DdLabelMouseClicked

    private void FfLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FfLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[3], consonants[3], false);
    }//GEN-LAST:event_FfLabelMouseClicked

    private void GgLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GgLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[4], consonants[4], false);
    }//GEN-LAST:event_GgLabelMouseClicked

    private void JjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JjLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[6], consonants[6], false);
    }//GEN-LAST:event_JjLabelMouseClicked

    private void LlLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LlLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[8], consonants[8], false);
    }//GEN-LAST:event_LlLabelMouseClicked

    private void KkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KkLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[7], consonants[7], false);
    }//GEN-LAST:event_KkLabelMouseClicked

    private void MmLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MmLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[9], consonants[9], false);
    }//GEN-LAST:event_MmLabelMouseClicked

    private void NnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NnLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[10], consonants[10], false);
    }//GEN-LAST:event_NnLabelMouseClicked

    private void PpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PpLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[11], consonants[11], false);
    }//GEN-LAST:event_PpLabelMouseClicked

    private void QqLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QqLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[12], consonants[12], false);
    }//GEN-LAST:event_QqLabelMouseClicked

    private void RrLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RrLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[13], consonants[13], false);
    }//GEN-LAST:event_RrLabelMouseClicked

    private void SsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SsLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[14], consonants[14], false);
    }//GEN-LAST:event_SsLabelMouseClicked

    private void TtLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[15], consonants[15], false);
    }//GEN-LAST:event_TtLabelMouseClicked

    private void VvLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VvLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[16], consonants[16], false);
    }//GEN-LAST:event_VvLabelMouseClicked

    private void WwLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WwLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[17], consonants[17], false);
    }//GEN-LAST:event_WwLabelMouseClicked

    private void XxLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XxLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[18], consonants[18], false);
    }//GEN-LAST:event_XxLabelMouseClicked

    private void YyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YyLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[19], consonants[19], false);
    }//GEN-LAST:event_YyLabelMouseClicked

    private void ZzLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZzLabelMouseClicked
        // TODO add your handling code here:
        ButtonActions.playVideoLesson(consonantsDurationInSeconds[20], consonants[20], false);
    }//GEN-LAST:event_ZzLabelMouseClicked


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel BbLabel;
        private javax.swing.JLabel CcLabel;
        private javax.swing.JLabel DdLabel;
        private javax.swing.JLabel FfLabel;
        private javax.swing.JLabel GgLabel;
        private javax.swing.JLabel HhLabel;
        private javax.swing.JLabel JjLabel;
        private javax.swing.JLabel KkLabel;
        private javax.swing.JLabel LlLabel;
        private javax.swing.JLabel MmLabel;
        private javax.swing.JLabel NnLabel;
        private javax.swing.JLabel PpLabel;
        private javax.swing.JLabel QqLabel;
        private javax.swing.JLabel RrLabel;
        private javax.swing.JLabel SsLabel;
        private javax.swing.JLabel TtLabel;
        private javax.swing.JLabel VvLabel;
        private javax.swing.JLabel WwLabel;
        private javax.swing.JLabel XxLabel;
        private javax.swing.JLabel YyLabel;
        private javax.swing.JLabel ZzLabel;
        private javax.swing.JLabel jLabel1;
        // End of variables declaration//GEN-END:variables
}
