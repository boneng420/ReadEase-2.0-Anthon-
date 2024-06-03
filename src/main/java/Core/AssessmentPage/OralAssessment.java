/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Core.AssessmentPage;

import Core.Actions.ButtonActions;
import Core.Assessment;
import Utilities.MusicPlayer;

import javax.swing.*;
import java.awt.*;

/**
 * @author Marc
 */
public class OralAssessment extends javax.swing.JFrame {

    private MusicPlayer musicPlayer;

    public OralAssessment() {
        initComponents();

        musicPlayer = MusicPlayer.getInstance();

        clearButton5.setOpaque(false);
        clearButton5.setContentAreaFilled(false);
        clearButton5.setBorderPainted(false);
        clearButton5.setBackground(new Color(0, 0, 0, 0));
        clearButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ReadButton5.setOpaque(false);
        ReadButton5.setContentAreaFilled(false);
        ReadButton5.setBorderPainted(false);
        ReadButton5.setBackground(new Color(0, 0, 0, 0));
        ReadButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        isWordButton5.setOpaque(false);
        isWordButton5.setContentAreaFilled(false);
        isWordButton5.setBorderPainted(false);
        isWordButton5.setBackground(new Color(0, 0, 0, 0));
        isWordButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        TheWordButton5.setOpaque(false);
        TheWordButton5.setContentAreaFilled(false);
        TheWordButton5.setBorderPainted(false);
        TheWordButton5.setBackground(new Color(0, 0, 0, 0));
        TheWordButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        onWordButton5.setOpaque(false);
        onWordButton5.setContentAreaFilled(false);
        onWordButton5.setBorderPainted(false);
        onWordButton5.setBackground(new Color(0, 0, 0, 0));
        onWordButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        theWordButton5.setOpaque(false);
        theWordButton5.setContentAreaFilled(false);
        theWordButton5.setBorderPainted(false);
        theWordButton5.setBackground(new Color(0, 0, 0, 0));
        theWordButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        catWordButton5.setOpaque(false);
        catWordButton5.setContentAreaFilled(false);
        catWordButton5.setBorderPainted(false);
        catWordButton5.setBackground(new Color(0, 0, 0, 0));
        catWordButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        boxWordButton5.setOpaque(false);
        boxWordButton5.setContentAreaFilled(false);
        boxWordButton5.setBorderPainted(false);
        boxWordButton5.setBackground(new Color(0, 0, 0, 0));
        boxWordButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        nextButton5.setOpaque(false);
        nextButton5.setContentAreaFilled(false);
        nextButton5.setBorderPainted(false);
        nextButton5.setBackground(new Color(0, 0, 0, 0));
        nextButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        returnButton1.setOpaque(false);
        returnButton1.setContentAreaFilled(false);
        returnButton1.setBorderPainted(false);
        returnButton1.setBackground(new Color(0, 0, 0, 0));
        returnButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        clearButton4.setOpaque(false);
        clearButton4.setContentAreaFilled(false);
        clearButton4.setBorderPainted(false);
        clearButton4.setBackground(new Color(0, 0, 0, 0));
        clearButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ReadButton4.setOpaque(false);
        ReadButton4.setContentAreaFilled(false);
        ReadButton4.setBorderPainted(false);
        ReadButton4.setBackground(new Color(0, 0, 0, 0));
        ReadButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        areWordButton4.setOpaque(false);
        areWordButton4.setContentAreaFilled(false);
        areWordButton4.setBorderPainted(false);
        areWordButton4.setBackground(new Color(0, 0, 0, 0));
        areWordButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        applesWordButton4.setOpaque(false);
        applesWordButton4.setContentAreaFilled(false);
        applesWordButton4.setBorderPainted(false);
        applesWordButton4.setBackground(new Color(0, 0, 0, 0));
        applesWordButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        sixWordButton4.setOpaque(false);
        sixWordButton4.setContentAreaFilled(false);
        sixWordButton4.setBorderPainted(false);
        sixWordButton4.setBackground(new Color(0, 0, 0, 0));
        sixWordButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ThereWordButton4.setOpaque(false);
        ThereWordButton4.setContentAreaFilled(false);
        ThereWordButton4.setBorderPainted(false);
        ThereWordButton4.setBackground(new Color(0, 0, 0, 0));
        ThereWordButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        nextButton4.setOpaque(false);
        nextButton4.setContentAreaFilled(false);
        nextButton4.setBorderPainted(false);
        nextButton4.setBackground(new Color(0, 0, 0, 0));
        nextButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        TheWordButton2.setOpaque(false);
        TheWordButton2.setContentAreaFilled(false);
        TheWordButton2.setBorderPainted(false);
        TheWordButton2.setBackground(new Color(0, 0, 0, 0));
        TheWordButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        clearButton3.setOpaque(false);
        clearButton3.setContentAreaFilled(false);
        clearButton3.setBorderPainted(false);
        clearButton3.setBackground(new Color(0, 0, 0, 0));
        clearButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ReadButton3.setOpaque(false);
        ReadButton3.setContentAreaFilled(false);
        ReadButton3.setBorderPainted(false);
        ReadButton3.setBackground(new Color(0, 0, 0, 0));
        ReadButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        TheWordButton3.setOpaque(false);
        TheWordButton3.setContentAreaFilled(false);
        TheWordButton3.setBorderPainted(false);
        TheWordButton3.setBackground(new Color(0, 0, 0, 0));
        TheWordButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        fishWordButton3.setOpaque(false);
        fishWordButton3.setContentAreaFilled(false);
        fishWordButton3.setBorderPainted(false);
        fishWordButton3.setBackground(new Color(0, 0, 0, 0));
        fishWordButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        bigWordButton3.setOpaque(false);
        bigWordButton3.setContentAreaFilled(false);
        bigWordButton3.setBorderPainted(false);
        bigWordButton3.setBackground(new Color(0, 0, 0, 0));
        bigWordButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        hasWordButton3.setOpaque(false);
        hasWordButton3.setContentAreaFilled(false);
        hasWordButton3.setBorderPainted(false);
        hasWordButton3.setBackground(new Color(0, 0, 0, 0));
        hasWordButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        finsWordButton3.setOpaque(false);
        finsWordButton3.setContentAreaFilled(false);
        finsWordButton3.setBorderPainted(false);
        finsWordButton3.setBackground(new Color(0, 0, 0, 0));
        finsWordButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        nextButton3.setOpaque(false);
        nextButton3.setContentAreaFilled(false);
        nextButton3.setBorderPainted(false);
        nextButton3.setBackground(new Color(0, 0, 0, 0));
        nextButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        isWordButton2.setOpaque(false);
        isWordButton2.setContentAreaFilled(false);
        isWordButton2.setBorderPainted(false);
        isWordButton2.setBackground(new Color(0, 0, 0, 0));
        isWordButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        theWordButton2.setOpaque(false);
        theWordButton2.setContentAreaFilled(false);
        theWordButton2.setBorderPainted(false);
        theWordButton2.setBackground(new Color(0, 0, 0, 0));
        theWordButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        matWordButton2.setOpaque(false);
        matWordButton2.setContentAreaFilled(false);
        matWordButton2.setBorderPainted(false);
        matWordButton2.setBackground(new Color(0, 0, 0, 0));
        matWordButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        onWordButton2.setOpaque(false);
        onWordButton2.setContentAreaFilled(false);
        onWordButton2.setBorderPainted(false);
        onWordButton2.setBackground(new Color(0, 0, 0, 0));
        onWordButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        catWordButton2.setOpaque(false);
        catWordButton2.setContentAreaFilled(false);
        catWordButton2.setBorderPainted(false);
        catWordButton2.setBackground(new Color(0, 0, 0, 0));
        catWordButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        clearButton2.setOpaque(false);
        clearButton2.setContentAreaFilled(false);
        clearButton2.setBorderPainted(false);
        clearButton2.setBackground(new Color(0, 0, 0, 0));
        clearButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ReadButton2.setOpaque(false);
        ReadButton2.setContentAreaFilled(false);
        ReadButton2.setBorderPainted(false);
        ReadButton2.setBackground(new Color(0, 0, 0, 0));
        ReadButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        nextButton2.setOpaque(false);
        nextButton2.setContentAreaFilled(false);
        nextButton2.setBorderPainted(false);
        nextButton2.setBackground(new Color(0, 0, 0, 0));
        nextButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        returnButton.setOpaque(false);
        returnButton.setContentAreaFilled(false);
        returnButton.setBorderPainted(false);
        returnButton.setBackground(new Color(0, 0, 0, 0));
        returnButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        nextButton1.setOpaque(false);
        nextButton1.setContentAreaFilled(false);
        nextButton1.setBorderPainted(false);
        nextButton1.setBackground(new Color(0, 0, 0, 0));
        nextButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        isWordButton1.setOpaque(false);
        isWordButton1.setContentAreaFilled(false);
        isWordButton1.setBorderPainted(false);
        isWordButton1.setBackground(new Color(0, 0, 0, 0));
        isWordButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        wetWordButton1.setOpaque(false);
        wetWordButton1.setContentAreaFilled(false);
        wetWordButton1.setBorderPainted(false);
        wetWordButton1.setBackground(new Color(0, 0, 0, 0));
        wetWordButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        netWordButton1.setOpaque(false);
        netWordButton1.setContentAreaFilled(false);
        netWordButton1.setBorderPainted(false);
        netWordButton1.setBackground(new Color(0, 0, 0, 0));
        netWordButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        TheWordButton1.setOpaque(false);
        TheWordButton1.setContentAreaFilled(false);
        TheWordButton1.setBorderPainted(false);
        TheWordButton1.setBackground(new Color(0, 0, 0, 0));
        TheWordButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        clearButton1.setOpaque(false);
        clearButton1.setContentAreaFilled(false);
        clearButton1.setBorderPainted(false);
        clearButton1.setBackground(new Color(0, 0, 0, 0));
        clearButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        readButton1.setOpaque(false);
        readButton1.setContentAreaFilled(false);
        readButton1.setBorderPainted(false);
        readButton1.setBackground(new Color(0, 0, 0, 0));
        readButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/Assessment/Oral Assessment/WetNet.png"));
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(iconT1.getWidth(), iconT1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        iconT1.setIcon(scaledIcon);

        ImageIcon originalIconT2 = new ImageIcon(getClass().getResource("/Assessment/Oral Assessment/CatMat.png"));
        Image originalImageT2 = originalIconT2.getImage();
        Image scaledImageT2 = originalImageT2.getScaledInstance(iconT2.getWidth(), iconT2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIconT2 = new ImageIcon(scaledImageT2);
        iconT2.setIcon(scaledIconT2);

        ImageIcon originalIconT3 = new ImageIcon(getClass().getResource("/Assessment/Oral Assessment/FishFins.png"));
        Image originalImageT3 = originalIconT3.getImage();
        Image scaledImageT3 = originalImageT3.getScaledInstance(iconT3.getWidth(), iconT3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIconT3 = new ImageIcon(scaledImageT3);
        iconT3.setIcon(scaledIconT3);

        ImageIcon originalIconT4 = new ImageIcon(getClass().getResource("/Assessment/Oral Assessment/Apple.png"));
        Image originalImageT4 = originalIconT4.getImage();
        Image scaledImageT4 = originalImageT4.getScaledInstance(iconT4.getWidth(), iconT4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIconT4 = new ImageIcon(scaledImageT4);
        iconT4.setIcon(scaledIconT4);

        ImageIcon originalIconT5 = new ImageIcon(getClass().getResource("/Assessment/Oral Assessment/CatBox.png"));
        Image originalImageT5 = originalIconT5.getImage();
        Image scaledImageT5 = originalImageT5.getScaledInstance(iconT5.getWidth(), iconT5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIconT5 = new ImageIcon(scaledImageT5);
        iconT5.setIcon(scaledIconT5);
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        assessmentTabbedPane = new javax.swing.JTabbedPane();
        q1Panel = new javax.swing.JPanel();
        q1Label = new javax.swing.JLabel();
        directionLabel = new javax.swing.JLabel();
        textArea1 = new javax.swing.JTextArea();
        clearButton1 = new javax.swing.JButton();
        readButton1 = new javax.swing.JButton();
        netWordButton1 = new javax.swing.JButton();
        TheWordButton1 = new javax.swing.JButton();
        wetWordButton1 = new javax.swing.JButton();
        isWordButton1 = new javax.swing.JButton();
        nextButton1 = new javax.swing.JButton();
        textToSpeechToggleButton1 = new javax.swing.JToggleButton();
        iconT1 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        BG = new javax.swing.JLabel();
        q2Panel = new javax.swing.JPanel();
        q2Label = new javax.swing.JLabel();
        directionLabel2 = new javax.swing.JLabel();
        textArea2 = new javax.swing.JTextArea();
        clearButton2 = new javax.swing.JButton();
        ReadButton2 = new javax.swing.JButton();
        matWordButton2 = new javax.swing.JButton();
        TheWordButton2 = new javax.swing.JButton();
        isWordButton2 = new javax.swing.JButton();
        onWordButton2 = new javax.swing.JButton();
        nextButton2 = new javax.swing.JButton();
        textToSpeechToggleButton2 = new javax.swing.JToggleButton();
        catWordButton2 = new javax.swing.JButton();
        theWordButton2 = new javax.swing.JButton();
        iconT2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        q3Panel = new javax.swing.JPanel();
        q3Label = new javax.swing.JLabel();
        directionLabel3 = new javax.swing.JLabel();
        textArea3 = new javax.swing.JTextArea();
        clearButton3 = new javax.swing.JButton();
        ReadButton3 = new javax.swing.JButton();
        fishWordButton3 = new javax.swing.JButton();
        TheWordButton3 = new javax.swing.JButton();
        bigWordButton3 = new javax.swing.JButton();
        hasWordButton3 = new javax.swing.JButton();
        nextButton3 = new javax.swing.JButton();
        textToSpeechToggleButton3 = new javax.swing.JToggleButton();
        finsWordButton3 = new javax.swing.JButton();
        iconT3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        q4Panel = new javax.swing.JPanel();
        q4Label = new javax.swing.JLabel();
        directionLabel4 = new javax.swing.JLabel();
        textArea4 = new javax.swing.JTextArea();
        clearButton4 = new javax.swing.JButton();
        ReadButton4 = new javax.swing.JButton();
        areWordButton4 = new javax.swing.JButton();
        sixWordButton4 = new javax.swing.JButton();
        applesWordButton4 = new javax.swing.JButton();
        ThereWordButton4 = new javax.swing.JButton();
        nextButton4 = new javax.swing.JButton();
        textToSpeechToggleButton4 = new javax.swing.JToggleButton();
        iconT4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        q5Panel = new javax.swing.JPanel();
        q4Label1 = new javax.swing.JLabel();
        directionLabel5 = new javax.swing.JLabel();
        textArea5 = new javax.swing.JTextArea();
        clearButton5 = new javax.swing.JButton();
        ReadButton5 = new javax.swing.JButton();
        boxWordButton5 = new javax.swing.JButton();
        isWordButton5 = new javax.swing.JButton();
        TheWordButton5 = new javax.swing.JButton();
        theWordButton5 = new javax.swing.JButton();
        nextButton5 = new javax.swing.JButton();
        textToSpeechToggleButton5 = new javax.swing.JToggleButton();
        catWordButton5 = new javax.swing.JButton();
        onWordButton5 = new javax.swing.JButton();
        returnButton1 = new javax.swing.JButton();
        iconT5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q1Panel.setBackground(new java.awt.Color(204, 204, 204));
        q1Panel.setToolTipText("");
        q1Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        q1Panel.setPreferredSize(new java.awt.Dimension(1235, 812));
        q1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q1Label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        q1Label.setForeground(new java.awt.Color(153, 255, 51));
        q1Label.setText("1. What can you say about the net?");
        q1Panel.add(q1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        directionLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 35)); // NOI18N
        directionLabel.setForeground(new java.awt.Color(204, 204, 0));
        directionLabel.setText("Direction: Describe the picture using the word");
        q1Panel.add(directionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 800, -1));

        textArea1.setBackground(new java.awt.Color(255, 255, 204));
        textArea1.setColumns(20);
        textArea1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        textArea1.setForeground(new java.awt.Color(0, 0, 0));
        textArea1.setRows(5);
        q1Panel.add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 820, 100));
        textArea1.setEditable(false);

        clearButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClearButton.png"))); // NOI18N
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });
        q1Panel.add(clearButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 150, 50));

        readButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/READ_Button__140_x_125 (1).png"))); // NOI18N
        readButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readButton1ActionPerformed(evt);
            }
        });
        q1Panel.add(readButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, 150, 50));

        netWordButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        netWordButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net__Button.png"))); // NOI18N
        netWordButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netWordButton1ActionPerformed(evt);
            }
        });
        q1Panel.add(netWordButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 180, 60));

        TheWordButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TheWordButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_The__Button.png"))); // NOI18N
        TheWordButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheWordButton1ActionPerformed(evt);
            }
        });
        q1Panel.add(TheWordButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 170, 60));

        wetWordButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        wetWordButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wet Button.png"))); // NOI18N
        wetWordButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wetWordButton1ActionPerformed(evt);
            }
        });
        q1Panel.add(wetWordButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 170, 50));

        isWordButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        isWordButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/is_Button.png"))); // NOI18N
        isWordButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isWordButton1ActionPerformed(evt);
            }
        });
        q1Panel.add(isWordButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 160, 50));

        nextButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nextButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next Button (150x150).png"))); // NOI18N
        nextButton1.setPreferredSize(new java.awt.Dimension(65, 30));
        nextButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButton1ActionPerformed(evt);
            }
        });
        q1Panel.add(nextButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 620, 160, 90));

        textToSpeechToggleButton1.setText("Sound");
        textToSpeechToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textToSpeechToggleButton1ActionPerformed(evt);
            }
        });
        q1Panel.add(textToSpeechToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 40));

        iconT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment/Oral Assessment/WetNet.png"))); // NOI18N
        iconT1.setPreferredSize(new java.awt.Dimension(50, 15));
        q1Panel.add(iconT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 480, 380));

        returnButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back_Button__150x150.png"))); // NOI18N
        returnButton.setPreferredSize(new java.awt.Dimension(65, 30));
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        q1Panel.add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 160, 80));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background (1280 x 720 px).gif"))); // NOI18N
        q1Panel.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -60, 1380, 850));

        assessmentTabbedPane.addTab("tab1", q1Panel);

        q2Panel.setBackground(new java.awt.Color(204, 204, 204));
        q2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q2Label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        q2Label.setForeground(new java.awt.Color(153, 255, 51));
        q2Label.setText("2. Where is the Cat?");
        q2Panel.add(q2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        directionLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 35)); // NOI18N
        directionLabel2.setForeground(new java.awt.Color(204, 204, 0));
        directionLabel2.setText("Direction: Describe the picture using the word");
        q2Panel.add(directionLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 672, -1));

        textArea2.setEditable(false);
        textArea2.setBackground(new java.awt.Color(255, 255, 204));
        textArea2.setColumns(20);
        textArea2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        textArea2.setForeground(new java.awt.Color(0, 0, 0));
        textArea2.setRows(5);
        q2Panel.add(textArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 870, 120));
        textArea1.setEditable(false);

        clearButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClearButton.png"))); // NOI18N
        clearButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton2ActionPerformed(evt);
            }
        });
        q2Panel.add(clearButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 150, 60));

        ReadButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/READ_Button__140_x_125 (1).png"))); // NOI18N
        ReadButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadButton2ActionPerformed(evt);
            }
        });
        q2Panel.add(ReadButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 140, 50));

        matWordButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        matWordButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mat_Button__250x250_-.png"))); // NOI18N
        matWordButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matWordButton2ActionPerformed(evt);
            }
        });
        q2Panel.add(matWordButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 160, 60));

        TheWordButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TheWordButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_The__Button.png"))); // NOI18N
        TheWordButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheWordButton2ActionPerformed(evt);
            }
        });
        q2Panel.add(TheWordButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 160, 60));

        isWordButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        isWordButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/is_Button.png"))); // NOI18N
        isWordButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isWordButton2ActionPerformed(evt);
            }
        });
        q2Panel.add(isWordButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 160, 60));

        onWordButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        onWordButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/on_Button__250x250_-.png"))); // NOI18N
        onWordButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onWordButton2ActionPerformed(evt);
            }
        });
        q2Panel.add(onWordButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 150, 60));

        nextButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nextButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next Button (150x150).png"))); // NOI18N
        nextButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButton2ActionPerformed(evt);
            }
        });
        q2Panel.add(nextButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 620, 160, 80));

        textToSpeechToggleButton2.setText("Sound");
        textToSpeechToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textToSpeechToggleButton2ActionPerformed(evt);
            }
        });
        q2Panel.add(textToSpeechToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        catWordButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        catWordButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat_Button__250x250___1_-.png"))); // NOI18N
        catWordButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catWordButton2ActionPerformed(evt);
            }
        });
        q2Panel.add(catWordButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 170, 50));

        theWordButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        theWordButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/the_Button__smol___250x250_.png"))); // NOI18N
        theWordButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theWordButton2ActionPerformed(evt);
            }
        });
        q2Panel.add(theWordButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 160, 50));

        iconT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment/Oral Assessment/CatMat.png"))); // NOI18N
        iconT2.setPreferredSize(new java.awt.Dimension(50, 15));
        q2Panel.add(iconT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 500, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background (1280 x 720 px).gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        q2Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        assessmentTabbedPane.addTab("tab2", q2Panel);

        q3Panel.setBackground(new java.awt.Color(204, 204, 204));
        q3Panel.setMaximumSize(new java.awt.Dimension(1280, 720));
        q3Panel.setMinimumSize(new java.awt.Dimension(1280, 720));
        q3Panel.setPreferredSize(new java.awt.Dimension(1280, 720));
        q3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q3Label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        q3Label.setForeground(new java.awt.Color(153, 255, 51));
        q3Label.setText("3. What does the fish have?");
        q3Panel.add(q3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 91, -1, -1));

        directionLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 35)); // NOI18N
        directionLabel3.setForeground(new java.awt.Color(204, 204, 0));
        directionLabel3.setText("Direction: Describe the picture using the word");
        q3Panel.add(directionLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 47, 672, -1));

        textArea3.setEditable(false);
        textArea3.setBackground(new java.awt.Color(255, 255, 204));
        textArea3.setColumns(20);
        textArea3.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        textArea3.setForeground(new java.awt.Color(0, 0, 0));
        textArea3.setRows(5);
        q3Panel.add(textArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 890, 170));
        textArea1.setEditable(false);

        clearButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClearButton.png"))); // NOI18N
        clearButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton3ActionPerformed(evt);
            }
        });
        q3Panel.add(clearButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 170, 150, 50));

        ReadButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/READ_Button__140_x_125 (1).png"))); // NOI18N
        ReadButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadButton3ActionPerformed(evt);
            }
        });
        q3Panel.add(ReadButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 140, 50));

        fishWordButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fishWordButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fish_Button__250x250_.png"))); // NOI18N
        fishWordButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishWordButton3ActionPerformed(evt);
            }
        });
        q3Panel.add(fishWordButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 170, 50));

        TheWordButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TheWordButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_The__Button.png"))); // NOI18N
        TheWordButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheWordButton3ActionPerformed(evt);
            }
        });
        q3Panel.add(TheWordButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 160, 60));

        bigWordButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bigWordButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/big_Button__smol___250x250_-.png"))); // NOI18N
        bigWordButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigWordButton3ActionPerformed(evt);
            }
        });
        q3Panel.add(bigWordButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 160, 50));

        hasWordButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hasWordButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/has_Button__250x250___1_.png"))); // NOI18N
        hasWordButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasWordButton3ActionPerformed(evt);
            }
        });
        q3Panel.add(hasWordButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, 140, 60));

        nextButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nextButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next Button (150x150).png"))); // NOI18N
        nextButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButton3ActionPerformed(evt);
            }
        });
        q3Panel.add(nextButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 600, 140, 100));

        textToSpeechToggleButton3.setText("Sound");
        textToSpeechToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textToSpeechToggleButton3ActionPerformed(evt);
            }
        });
        q3Panel.add(textToSpeechToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        finsWordButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        finsWordButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fins_Button__250x250___.png"))); // NOI18N
        finsWordButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finsWordButton3ActionPerformed(evt);
            }
        });
        q3Panel.add(finsWordButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 180, 60));

        iconT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment/Oral Assessment/FishFins.png"))); // NOI18N
        iconT3.setPreferredSize(new java.awt.Dimension(50, 15));
        q3Panel.add(iconT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 560, 550));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background (1280 x 720 px).gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel3.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel3.setPreferredSize(new java.awt.Dimension(1280, 720));
        q3Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1280, 740));

        assessmentTabbedPane.addTab("tab3", q3Panel);

        q4Panel.setBackground(new java.awt.Color(204, 204, 204));
        q4Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q4Label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        q4Label.setForeground(new java.awt.Color(153, 255, 51));
        q4Label.setText("4. How many apples are there?");
        q4Panel.add(q4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 91, -1, -1));

        directionLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 35)); // NOI18N
        directionLabel4.setForeground(new java.awt.Color(204, 204, 0));
        directionLabel4.setText("Direction: Describe the picture using the word");
        q4Panel.add(directionLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 47, 672, -1));

        textArea4.setEditable(false);
        textArea4.setBackground(new java.awt.Color(255, 255, 204));
        textArea4.setColumns(20);
        textArea4.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        textArea4.setForeground(new java.awt.Color(0, 0, 0));
        textArea4.setRows(5);
        q4Panel.add(textArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 142, 890, 130));
        textArea1.setEditable(false);

        clearButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClearButton.png"))); // NOI18N
        clearButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton4ActionPerformed(evt);
            }
        });
        q4Panel.add(clearButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, 140, 50));

        ReadButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/READ_Button__140_x_125 (1).png"))); // NOI18N
        ReadButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadButton4ActionPerformed(evt);
            }
        });
        q4Panel.add(ReadButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 150, 50));

        areWordButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        areWordButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/are_Button__250x250_-.png"))); // NOI18N
        areWordButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areWordButton4ActionPerformed(evt);
            }
        });
        q4Panel.add(areWordButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 160, 60));

        sixWordButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sixWordButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/six_Button__250x250_-.png"))); // NOI18N
        sixWordButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixWordButton4ActionPerformed(evt);
            }
        });
        q4Panel.add(sixWordButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 150, 70));

        applesWordButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        applesWordButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apples_Button__250x250_-.png"))); // NOI18N
        applesWordButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applesWordButton4ActionPerformed(evt);
            }
        });
        q4Panel.add(applesWordButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 160, 60));

        ThereWordButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ThereWordButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/There_Button__250x250___1_-.png"))); // NOI18N
        ThereWordButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThereWordButton4ActionPerformed(evt);
            }
        });
        q4Panel.add(ThereWordButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 170, 60));

        nextButton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nextButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next Button (150x150).png"))); // NOI18N
        nextButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButton4ActionPerformed(evt);
            }
        });
        q4Panel.add(nextButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 590, 160, 120));

        textToSpeechToggleButton4.setText("Sound");
        textToSpeechToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textToSpeechToggleButton4ActionPerformed(evt);
            }
        });
        q4Panel.add(textToSpeechToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        iconT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment/Oral Assessment/Apple.png"))); // NOI18N
        iconT4.setPreferredSize(new java.awt.Dimension(50, 15));
        q4Panel.add(iconT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 520, 400));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background (1280 x 720 px).gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        q4Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1280, 760));

        assessmentTabbedPane.addTab("tab4", q4Panel);

        q5Panel.setBackground(new java.awt.Color(204, 204, 204));
        q5Panel.setMaximumSize(new java.awt.Dimension(1280, 720));
        q5Panel.setMinimumSize(new java.awt.Dimension(1280, 720));
        q5Panel.setPreferredSize(new java.awt.Dimension(1280, 720));
        q5Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q4Label1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        q4Label1.setForeground(new java.awt.Color(153, 255, 51));
        q4Label1.setText("5. What animal is on the box?");
        q5Panel.add(q4Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        directionLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 35)); // NOI18N
        directionLabel5.setForeground(new java.awt.Color(204, 204, 0));
        directionLabel5.setText("Direction: Describe the picture using the word");
        q5Panel.add(directionLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 672, -1));

        textArea5.setEditable(false);
        textArea5.setBackground(new java.awt.Color(255, 255, 204));
        textArea5.setColumns(20);
        textArea5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        textArea5.setForeground(new java.awt.Color(0, 0, 0));
        textArea5.setRows(5);
        q5Panel.add(textArea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 142, 970, 110));
        textArea1.setEditable(false);

        clearButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClearButton.png"))); // NOI18N
        clearButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton5ActionPerformed(evt);
            }
        });
        q5Panel.add(clearButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 130, 150, 50));

        ReadButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/READ_Button__140_x_125 (1).png"))); // NOI18N
        ReadButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadButton5ActionPerformed(evt);
            }
        });
        q5Panel.add(ReadButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 200, 140, 50));

        boxWordButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        boxWordButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Box_Button__250x250___1_.png"))); // NOI18N
        boxWordButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxWordButton5ActionPerformed(evt);
            }
        });
        q5Panel.add(boxWordButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 160, 60));

        isWordButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        isWordButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/is_Button.png"))); // NOI18N
        isWordButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isWordButton5ActionPerformed(evt);
            }
        });
        q5Panel.add(isWordButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 160, 60));

        TheWordButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TheWordButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_The__Button.png"))); // NOI18N
        TheWordButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheWordButton5ActionPerformed(evt);
            }
        });
        q5Panel.add(TheWordButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 150, 60));

        theWordButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        theWordButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/the_Button__smol___250x250_.png"))); // NOI18N
        theWordButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theWordButton5ActionPerformed(evt);
            }
        });
        q5Panel.add(theWordButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 160, 60));

        nextButton5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nextButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next Button (150x150).png"))); // NOI18N
        nextButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButton5ActionPerformed(evt);
            }
        });
        q5Panel.add(nextButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, 160, 100));

        textToSpeechToggleButton5.setText("Sound");
        textToSpeechToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textToSpeechToggleButton5ActionPerformed(evt);
            }
        });
        q5Panel.add(textToSpeechToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        catWordButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        catWordButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat_Button__250x250___1_-.png"))); // NOI18N
        catWordButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catWordButton5ActionPerformed(evt);
            }
        });
        q5Panel.add(catWordButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 160, 60));

        onWordButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        onWordButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/on_Button__250x250_-.png"))); // NOI18N
        onWordButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onWordButton5ActionPerformed(evt);
            }
        });
        q5Panel.add(onWordButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 140, 60));

        returnButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        returnButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit_Button__250x250_.png"))); // NOI18N
        returnButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton1ActionPerformed(evt);
            }
        });
        q5Panel.add(returnButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 70, 90));

        iconT5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment/Oral Assessment/CatBox.png"))); // NOI18N
        iconT5.setPreferredSize(new java.awt.Dimension(50, 15));
        q5Panel.add(iconT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 450, 450));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background (1280 x 720 px).gif"))); // NOI18N
        jLabel5.setText("jLabel5");
        q5Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1340, 770));

        assessmentTabbedPane.addTab("tab5", q5Panel);

        getContentPane().add(assessmentTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -34, 1247, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String[] q1Words = {"The", "net", "is", "wet"};
    String[] q2Words = {"The", "cat", "is", "on", "the", "mat"};
    String[] q3Words = {"The", "fish", "has", "big", "fins"};
    String[] q4Words = {"There", "are", "six", "apples"};
    String[] q5Words = {"The", "cat", "is", "on", "the", "box"};

    private void TheWordButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Append the word to the text area
        textArea1.append(q1Words[0] + " ");
        ButtonActions.speak(q1Words[0] + " ", textToSpeechToggleButton1);
    }

    private void clearButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton2ActionPerformed
        // TODO add your handling code here:
        ButtonActions.clearTextArea(textArea2);
    }//GEN-LAST:event_clearButton2ActionPerformed

    private void ReadButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadButton2ActionPerformed
        // TODO add your handling code here:
        ButtonActions.readText(textArea2, musicPlayer);
    }//GEN-LAST:event_ReadButton2ActionPerformed

    private void matWordButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matWordButton2ActionPerformed
        // TODO add your handling code here:
        textArea2.append(q2Words[5] + " ");
        ButtonActions.speak(q2Words[5] + " ", textToSpeechToggleButton2);
    }//GEN-LAST:event_matWordButton2ActionPerformed

    private void TheWordButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheWordButton2ActionPerformed
        // TODO add your handling code here:
        textArea2.append(q2Words[0] + " ");
        ButtonActions.speak(q2Words[0] + " ", textToSpeechToggleButton2);
    }//GEN-LAST:event_TheWordButton2ActionPerformed

    private void isWordButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isWordButton2ActionPerformed
        // TODO add your handling code here:
        textArea2.append(q2Words[2] + " ");
        ButtonActions.speak(q2Words[2] + " ", textToSpeechToggleButton2);
    }//GEN-LAST:event_isWordButton2ActionPerformed

    private void onWordButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onWordButton2ActionPerformed
        // TODO add your handling code here:
        textArea2.append(q2Words[3] + " ");
        ButtonActions.speak(q2Words[3] + " ", textToSpeechToggleButton2);
    }//GEN-LAST:event_onWordButton2ActionPerformed

    private void nextButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButton2ActionPerformed
        // TODO add your handling code here:
        String userAnswer = textArea2.getText().trim();
        ButtonActions.checkAnswerAndNext(q2Words, userAnswer, assessmentTabbedPane, textArea2, true);
    }//GEN-LAST:event_nextButton2ActionPerformed

    private void textToSpeechToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textToSpeechToggleButton2ActionPerformed
        // TODO add your handling code here:
        ButtonActions.toggleTextToSpeech(textToSpeechToggleButton2);
    }//GEN-LAST:event_textToSpeechToggleButton2ActionPerformed

    private void catWordButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catWordButton2ActionPerformed
        // TODO add your handling code here:
        textArea2.append(q2Words[1] + " ");
        ButtonActions.speak(q2Words[1] + " ", textToSpeechToggleButton2);
    }//GEN-LAST:event_catWordButton2ActionPerformed

    private void theWordButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theWordButton2ActionPerformed
        // TODO add your handling code here:
        textArea2.append(q2Words[4] + " ");
        ButtonActions.speak(q2Words[4] + " ", textToSpeechToggleButton2);
    }//GEN-LAST:event_theWordButton2ActionPerformed

    private void clearButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton3ActionPerformed
        // TODO add your handling code here:
        ButtonActions.clearTextArea(textArea3);
    }//GEN-LAST:event_clearButton3ActionPerformed

    private void ReadButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadButton3ActionPerformed
        // TODO add your handling code here:
        ButtonActions.readText(textArea3, musicPlayer);
    }//GEN-LAST:event_ReadButton3ActionPerformed

    private void fishWordButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishWordButton3ActionPerformed
        // TODO add your handling code here:
        textArea3.append(q3Words[1] + " ");
        ButtonActions.speak(q3Words[1] + " ", textToSpeechToggleButton3);
    }//GEN-LAST:event_fishWordButton3ActionPerformed

    private void TheWordButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheWordButton3ActionPerformed
        // TODO add your handling code here:
        textArea3.append(q3Words[0] + " ");
        ButtonActions.speak(q3Words[0] + " ", textToSpeechToggleButton3);
    }//GEN-LAST:event_TheWordButton3ActionPerformed

    private void bigWordButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigWordButton3ActionPerformed
        // TODO add your handling code here:
        textArea3.append(q3Words[3] + " ");
        ButtonActions.speak(q3Words[3] + " ", textToSpeechToggleButton3);
    }//GEN-LAST:event_bigWordButton3ActionPerformed

    private void hasWordButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasWordButton3ActionPerformed
        // TODO add your handling code here:
        textArea3.append(q3Words[2] + " ");
        ButtonActions.speak(q3Words[2] + " ", textToSpeechToggleButton3);
    }//GEN-LAST:event_hasWordButton3ActionPerformed

    private void nextButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButton3ActionPerformed
        // TODO add your handling code here:
        String userAnswer = textArea3.getText().trim();
        ButtonActions.checkAnswerAndNext(q3Words, userAnswer, assessmentTabbedPane, textArea3, true);
    }//GEN-LAST:event_nextButton3ActionPerformed

    private void textToSpeechToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textToSpeechToggleButton3ActionPerformed
        // TODO add your handling code here:
        ButtonActions.toggleTextToSpeech(textToSpeechToggleButton3);
    }//GEN-LAST:event_textToSpeechToggleButton3ActionPerformed

    private void finsWordButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finsWordButton3ActionPerformed
        // TODO add your handling code here:
        textArea3.append(q3Words[4] + " ");
        ButtonActions.speak(q3Words[4] + " ", textToSpeechToggleButton3);
    }//GEN-LAST:event_finsWordButton3ActionPerformed

    private void clearButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton4ActionPerformed
        // TODO add your handling code here:
        ButtonActions.clearTextArea(textArea4);
    }//GEN-LAST:event_clearButton4ActionPerformed

    private void ReadButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadButton4ActionPerformed
        // TODO add your handling code here:
        ButtonActions.readText(textArea4, musicPlayer);
    }//GEN-LAST:event_ReadButton4ActionPerformed

    private void areWordButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areWordButton4ActionPerformed
        // TODO add your handling code here:
        textArea4.append(q4Words[1] + " ");
        ButtonActions.speak(q4Words[1] + " ", textToSpeechToggleButton4);
    }//GEN-LAST:event_areWordButton4ActionPerformed

    private void sixWordButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixWordButton4ActionPerformed
        // TODO add your handling code here:
        textArea4.append(q4Words[2] + " ");
        ButtonActions.speak(q4Words[2] + " ", textToSpeechToggleButton4);
    }//GEN-LAST:event_sixWordButton4ActionPerformed

    private void applesWordButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applesWordButton4ActionPerformed
        // TODO add your handling code here:
        textArea4.append(q4Words[3] + " ");
        ButtonActions.speak(q4Words[3] + " ", textToSpeechToggleButton4);
    }//GEN-LAST:event_applesWordButton4ActionPerformed

    private void ThereWordButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThereWordButton4ActionPerformed
        // TODO add your handling code here:
        textArea4.append(q4Words[0] + " ");
        ButtonActions.speak(q4Words[0] + " ", textToSpeechToggleButton4);
    }//GEN-LAST:event_ThereWordButton4ActionPerformed

    private void nextButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButton4ActionPerformed
        // TODO add your handling code here:
        String userAnswer = textArea4.getText().trim();
        ButtonActions.checkAnswerAndNext(q4Words, userAnswer, assessmentTabbedPane, textArea4, true);
    }//GEN-LAST:event_nextButton4ActionPerformed

    private void textToSpeechToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textToSpeechToggleButton4ActionPerformed
        // TODO add your handling code here:
        ButtonActions.toggleTextToSpeech(textToSpeechToggleButton4);
    }//GEN-LAST:event_textToSpeechToggleButton4ActionPerformed

    private void clearButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton5ActionPerformed
        // TODO add your handling code here:
        ButtonActions.clearTextArea(textArea5);
    }//GEN-LAST:event_clearButton5ActionPerformed

    private void ReadButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadButton5ActionPerformed
        // TODO add your handling code here:
        ButtonActions.readText(textArea5, musicPlayer);
    }//GEN-LAST:event_ReadButton5ActionPerformed

    private void boxWordButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxWordButton5ActionPerformed
        // TODO add your handling code here:
        textArea5.append(q5Words[5] + " ");
        ButtonActions.speak(q5Words[5] + " ", textToSpeechToggleButton5);
    }//GEN-LAST:event_boxWordButton5ActionPerformed

    private void isWordButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isWordButton5ActionPerformed
        // TODO add your handling code here:
        textArea5.append(q5Words[2] + " ");
        ButtonActions.speak(q5Words[2] + " ", textToSpeechToggleButton5);
    }//GEN-LAST:event_isWordButton5ActionPerformed

    private void TheWordButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheWordButton5ActionPerformed
        // TODO add your handling code here:
        textArea5.append(q5Words[0] + " ");
        ButtonActions.speak(q5Words[0] + " ", textToSpeechToggleButton5);
    }//GEN-LAST:event_TheWordButton5ActionPerformed

    private void theWordButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theWordButton5ActionPerformed
        // TODO add your handling code here:
        textArea5.append(q5Words[4] + " ");
        ButtonActions.speak(q5Words[4] + " ", textToSpeechToggleButton5);
    }//GEN-LAST:event_theWordButton5ActionPerformed

    private void nextButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButton5ActionPerformed
        // TODO add your handling code here:
        String userAnswer = textArea5.getText().trim();
        ButtonActions.checkAnswerAndNext(q5Words, userAnswer, assessmentTabbedPane, textArea5, true);
    }//GEN-LAST:event_nextButton5ActionPerformed

    private void textToSpeechToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textToSpeechToggleButton5ActionPerformed
        // TODO add your handling code here:
        ButtonActions.toggleTextToSpeech(textToSpeechToggleButton5);
    }//GEN-LAST:event_textToSpeechToggleButton5ActionPerformed

    private void catWordButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catWordButton5ActionPerformed
        // TODO add your handling code here:
        textArea5.append(q5Words[1] + " ");
        ButtonActions.speak(q5Words[1] + " ", textToSpeechToggleButton5);
    }//GEN-LAST:event_catWordButton5ActionPerformed

    private void onWordButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onWordButton5ActionPerformed
        // TODO add your handling code here:
        textArea5.append(q5Words[3] + " ");
        ButtonActions.speak(q5Words[3] + " ", textToSpeechToggleButton5);
    }//GEN-LAST:event_onWordButton5ActionPerformed

    private void returnButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton1ActionPerformed
        // TODO add your handling code here:
        Assessment assessment = new Assessment();
        assessment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnButton1ActionPerformed

        private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
                // TODO add your handling code here:
                Assessment assessment = new Assessment();
                assessment.setVisible(true);
                this.dispose();
        }//GEN-LAST:event_returnButtonActionPerformed

        private void textToSpeechToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textToSpeechToggleButton1ActionPerformed
                // TODO add your handling code here:
                ButtonActions.toggleTextToSpeech(textToSpeechToggleButton1);
        }//GEN-LAST:event_textToSpeechToggleButton1ActionPerformed

        private void nextButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButton1ActionPerformed
                // TODO add your handling code here:String correctAnswer = "The net is wet";
                String userAnswer = textArea1.getText().trim();
                ButtonActions.checkAnswerAndNext(q1Words, userAnswer, assessmentTabbedPane, textArea1, true);
        }//GEN-LAST:event_nextButton1ActionPerformed

        private void isWordButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isWordButton1ActionPerformed
                // TODO add your handling code here:
                textArea1.append(q1Words[2] + " ");
                ButtonActions.speak(q1Words[2] + " ", textToSpeechToggleButton1);
        }//GEN-LAST:event_isWordButton1ActionPerformed

        private void wetWordButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wetWordButton1ActionPerformed
                // TODO add your handling code here:
                textArea1.append(q1Words[3] + " ");
                ButtonActions.speak(q1Words[3] + " ", textToSpeechToggleButton1);
        }//GEN-LAST:event_wetWordButton1ActionPerformed

        private void netWordButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netWordButton1ActionPerformed
                // TODO add your handling code here:
                textArea1.append(q1Words[1] + " ");
                ButtonActions.speak(q1Words[1] + " ", textToSpeechToggleButton1);
        }//GEN-LAST:event_netWordButton1ActionPerformed

        private void readButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readButton1ActionPerformed
                // TODO add your handling code here:
                ButtonActions.readText(textArea1, musicPlayer);
        }//GEN-LAST:event_readButton1ActionPerformed

        private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
                // TODO add your handling code here:
                ButtonActions.clearTextArea(textArea1);
        }//GEN-LAST:event_clearButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(OralAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OralAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OralAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OralAssessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OralAssessment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton ReadButton2;
    private javax.swing.JButton ReadButton3;
    private javax.swing.JButton ReadButton4;
    private javax.swing.JButton ReadButton5;
    private javax.swing.JButton TheWordButton1;
    private javax.swing.JButton TheWordButton2;
    private javax.swing.JButton TheWordButton3;
    private javax.swing.JButton TheWordButton5;
    private javax.swing.JButton ThereWordButton4;
    private javax.swing.JButton applesWordButton4;
    private javax.swing.JButton areWordButton4;
    private javax.swing.JTabbedPane assessmentTabbedPane;
    private javax.swing.JButton bigWordButton3;
    private javax.swing.JButton boxWordButton5;
    private javax.swing.JButton catWordButton2;
    private javax.swing.JButton catWordButton5;
    private javax.swing.JButton clearButton1;
    private javax.swing.JButton clearButton2;
    private javax.swing.JButton clearButton3;
    private javax.swing.JButton clearButton4;
    private javax.swing.JButton clearButton5;
    private javax.swing.JLabel directionLabel;
    private javax.swing.JLabel directionLabel2;
    private javax.swing.JLabel directionLabel3;
    private javax.swing.JLabel directionLabel4;
    private javax.swing.JLabel directionLabel5;
    private javax.swing.JButton finsWordButton3;
    private javax.swing.JButton fishWordButton3;
    private javax.swing.JButton hasWordButton3;
    private javax.swing.JLabel iconT1;
    private javax.swing.JLabel iconT2;
    private javax.swing.JLabel iconT3;
    private javax.swing.JLabel iconT4;
    private javax.swing.JLabel iconT5;
    private javax.swing.JButton isWordButton1;
    private javax.swing.JButton isWordButton2;
    private javax.swing.JButton isWordButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton matWordButton2;
    private javax.swing.JButton netWordButton1;
    private javax.swing.JButton nextButton1;
    private javax.swing.JButton nextButton2;
    private javax.swing.JButton nextButton3;
    private javax.swing.JButton nextButton4;
    private javax.swing.JButton nextButton5;
    private javax.swing.JButton onWordButton2;
    private javax.swing.JButton onWordButton5;
    private javax.swing.JLabel q1Label;
    private javax.swing.JPanel q1Panel;
    private javax.swing.JLabel q2Label;
    private javax.swing.JPanel q2Panel;
    private javax.swing.JLabel q3Label;
    private javax.swing.JPanel q3Panel;
    private javax.swing.JLabel q4Label;
    private javax.swing.JLabel q4Label1;
    private javax.swing.JPanel q4Panel;
    private javax.swing.JPanel q5Panel;
    private javax.swing.JButton readButton1;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton returnButton1;
    private javax.swing.JButton sixWordButton4;
    private javax.swing.JTextArea textArea1;
    private javax.swing.JTextArea textArea2;
    private javax.swing.JTextArea textArea3;
    private javax.swing.JTextArea textArea4;
    private javax.swing.JTextArea textArea5;
    private javax.swing.JToggleButton textToSpeechToggleButton1;
    private javax.swing.JToggleButton textToSpeechToggleButton2;
    private javax.swing.JToggleButton textToSpeechToggleButton3;
    private javax.swing.JToggleButton textToSpeechToggleButton4;
    private javax.swing.JToggleButton textToSpeechToggleButton5;
    private javax.swing.JButton theWordButton2;
    private javax.swing.JButton theWordButton5;
    private javax.swing.JButton wetWordButton1;
    // End of variables declaration//GEN-END:variables
}