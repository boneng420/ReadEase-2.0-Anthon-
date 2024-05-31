/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.core.readease;

import HomePage.HomePage;
import java.awt.Color;

/**
 *
 * @author Marc
 */
public class StartingPage extends javax.swing.JFrame {

	/**
	 * Creates new form Main
	 */
	public StartingPage() {
		initComponents();
                contButton.setOpaque(false);
contButton.setContentAreaFilled(false);
contButton.setBorderPainted(false);
contButton.setBackground(new Color(0, 0, 0, 0));
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contButton.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        contButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cute Wood Game Button Twitch Panel.png"))); // NOI18N
        contButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contButtonActionPerformed(evt);
            }
        });
        getContentPane().add(contButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 430, 490, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StartingPage.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void contButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contButtonActionPerformed
                // TODO add your handling code here:

			this.dispose();
			java.awt.EventQueue.invokeLater(() -> {
				try {
					new HomePage().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
        }//GEN-LAST:event_contButtonActionPerformed

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
			java.util.logging.Logger.getLogger(StartingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(StartingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(StartingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(StartingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new StartingPage().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
