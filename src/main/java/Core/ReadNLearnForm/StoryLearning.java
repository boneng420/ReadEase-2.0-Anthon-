/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Core.ReadNLearnForm;

import Core.Actions.ButtonActions;
import Core.ReadNLearn;
import Utilities.MusicPlayer;

import javax.swing.*;

/**
 * @author Marc
 */
public class StoryLearning extends javax.swing.JFrame {

    private MusicPlayer musicPlayer;

    /**
     * Creates new form StoryLearning
     */
    public StoryLearning() {
        initComponents();

        musicPlayer = MusicPlayer.getInstance();

        ButtonGroup groupQ1T1 = new ButtonGroup();
        groupQ1T1.add(ARadioButtonQ1T1);
        groupQ1T1.add(BRadioButtonQ1T1);
        groupQ1T1.add(CRadioButtonQ1T1);
        groupQ1T1.add(DRadioButtonQ1T1);

        ButtonGroup groupQ2T1 = new ButtonGroup();
        groupQ2T1.add(ARadioButtonQ2T1);
        groupQ2T1.add(BRadioButtonQ2T1);
        groupQ2T1.add(CRadioButtonQ2T1);
        groupQ2T1.add(DRadioButtonQ2T1);

        ButtonGroup groupQ3T1 = new ButtonGroup();
        groupQ3T1.add(ARadioButtonQ3T1);
        groupQ3T1.add(BRadioButtonQ3T1);
        groupQ3T1.add(CRadioButtonQ3T1);
        groupQ3T1.add(DRadioButtonQ3T1);

        ButtonGroup groupQ4T1 = new ButtonGroup();
        groupQ4T1.add(ARadioButtonQ4T1);
        groupQ4T1.add(BRadioButtonQ4T1);
        groupQ4T1.add(CRadioButtonQ4T1);
        groupQ4T1.add(DRadioButtonQ4T1);

//        TAB 2

        ButtonGroup groupQ1T2 = new ButtonGroup();
        groupQ1T2.add(ARadioButtonQ1T2);
        groupQ1T2.add(BRadioButtonQ1T2);
        groupQ1T2.add(CRadioButtonQ1T2);
        groupQ1T2.add(DRadioButtonQ1T2);

        ButtonGroup groupQ2T2 = new ButtonGroup();
        groupQ2T2.add(ARadioButtonQ2T2);
        groupQ2T2.add(BRadioButtonQ2T2);
        groupQ2T2.add(CRadioButtonQ2T2);
        groupQ2T2.add(DRadioButtonQ2T2);

        ButtonGroup groupQ3T2 = new ButtonGroup();
        groupQ3T2.add(ARadioButtonQ3T2);
        groupQ3T2.add(BRadioButtonQ3T2);
        groupQ3T2.add(CRadioButtonQ3T2);
        groupQ3T2.add(DRadioButtonQ3T2);

        ButtonGroup groupQ4T2 = new ButtonGroup();
        groupQ4T2.add(ARadioButtonQ4T2);
        groupQ4T2.add(BRadioButtonQ4T2);
        groupQ4T2.add(CRadioButtonQ4T2);
        groupQ4T2.add(DRadioButtonQ4T2);

        ButtonGroup groupQ1T3 = new ButtonGroup();
        groupQ1T3.add(ARadioButtonQ1T3);
        groupQ1T3.add(BRadioButtonQ1T3);
        groupQ1T3.add(CRadioButtonQ1T3);
        groupQ1T3.add(DRadioButtonQ1T3);

        ButtonGroup groupQ2T3 = new ButtonGroup();
        groupQ2T3.add(ARadioButtonQ2T3);
        groupQ2T3.add(BRadioButtonQ2T3);
        groupQ2T3.add(CRadioButtonQ2T3);
        groupQ2T3.add(DRadioButtonQ2T3);

        ButtonGroup groupQ3T3 = new ButtonGroup();
        groupQ3T3.add(ARadioButtonQ3T3);
        groupQ3T3.add(BRadioButtonQ3T3);
        groupQ3T3.add(CRadioButtonQ3T3);
        groupQ3T3.add(DRadioButtonQ3T3);

        ButtonGroup groupQ4T3 = new ButtonGroup();
        groupQ4T3.add(ARadioButtonQ4T3);
        groupQ4T3.add(BRadioButtonQ4T3);
        groupQ4T3.add(CRadioButtonQ4T3);
        groupQ4T3.add(DRadioButtonQ4T3);

        ButtonGroup groupQ1T4 = new ButtonGroup();
        groupQ1T4.add(ARadioButtonQ1T4);
        groupQ1T4.add(BRadioButtonQ1T4);
        groupQ1T4.add(CRadioButtonQ1T4);
        groupQ1T4.add(DRadioButtonQ1T4);

        ButtonGroup groupQ2T4 = new ButtonGroup();
        groupQ2T4.add(ARadioButtonQ2T4);
        groupQ2T4.add(BRadioButtonQ2T4);
        groupQ2T4.add(CRadioButtonQ2T4);
        groupQ2T4.add(DRadioButtonQ2T4);

        ButtonGroup groupQ3T4 = new ButtonGroup();
        groupQ3T4.add(ARadioButtonQ3T4);
        groupQ3T4.add(BRadioButtonQ3T4);
        groupQ3T4.add(CRadioButtonQ3T4);
        groupQ3T4.add(DRadioButtonQ3T4);

        ButtonGroup groupQ4T4 = new ButtonGroup();
        groupQ4T4.add(ARadioButtonQ4T4);
        groupQ4T4.add(BRadioButtonQ4T4);
        groupQ4T4.add(CRadioButtonQ4T4);
        groupQ4T4.add(DRadioButtonQ4T4);

        ButtonGroup groupQ1T5 = new ButtonGroup();
        groupQ1T5.add(ARadioButtonQ1T5);
        groupQ1T5.add(BRadioButtonQ1T5);
        groupQ1T5.add(CRadioButtonQ1T5);
        groupQ1T5.add(DRadioButtonQ1T5);

        ButtonGroup groupQ2T5 = new ButtonGroup();
        groupQ2T5.add(ARadioButtonQ2T5);
        groupQ2T5.add(BRadioButtonQ2T5);
        groupQ2T5.add(CRadioButtonQ2T5);
        groupQ2T5.add(DRadioButtonQ3T5);

        ButtonGroup groupQ3T5 = new ButtonGroup();
        groupQ3T5.add(ARadioButtonQ3T5);
        groupQ3T5.add(BRadioButtonQ3T5);
        groupQ3T5.add(CRadioButtonQ3T5);
        groupQ3T5.add(DRadioButtonQ3T5);

        ButtonGroup groupQ4T5 = new ButtonGroup();
        groupQ4T5.add(ARadioButtonQ4T5);
        groupQ4T5.add(BRadioButtonQ4T5);
        groupQ4T5.add(CRadioButtonQ4T5);
        groupQ4T5.add(DRadioButtonQ4T5);
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaT1 = new javax.swing.JTextArea();
        jPanelT1 = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        q1Label = new javax.swing.JLabel();
        q2Label = new javax.swing.JLabel();
        q3label = new javax.swing.JLabel();
        q4Label = new javax.swing.JLabel();
        DRadioButtonQ1T1 = new javax.swing.JRadioButton();
        ARadioButtonQ1T1 = new javax.swing.JRadioButton();
        BRadioButtonQ1T1 = new javax.swing.JRadioButton();
        DRadioButtonQ2T1 = new javax.swing.JRadioButton();
        CRadioButtonQ1T1 = new javax.swing.JRadioButton();
        ARadioButtonQ2T1 = new javax.swing.JRadioButton();
        CRadioButtonQ3T1 = new javax.swing.JRadioButton();
        BRadioButtonQ2T1 = new javax.swing.JRadioButton();
        CRadioButtonQ2T1 = new javax.swing.JRadioButton();
        DRadioButtonQ3T1 = new javax.swing.JRadioButton();
        BRadioButtonQ3T1 = new javax.swing.JRadioButton();
        ARadioButtonQ3T1 = new javax.swing.JRadioButton();
        CRadioButtonQ4T1 = new javax.swing.JRadioButton();
        DRadioButtonQ4T1 = new javax.swing.JRadioButton();
        ARadioButtonQ4T1 = new javax.swing.JRadioButton();
        BRadioButtonQ4T1 = new javax.swing.JRadioButton();
        returnButton0 = new javax.swing.JLabel();
        nextButtonT1 = new javax.swing.JLabel();
        readButtonT1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaT2 = new javax.swing.JTextArea();
        jPanelT2 = new javax.swing.JPanel();
        questionLabel1 = new javax.swing.JLabel();
        q1Label1 = new javax.swing.JLabel();
        q2Label1 = new javax.swing.JLabel();
        q3label1 = new javax.swing.JLabel();
        q4Label1 = new javax.swing.JLabel();
        DRadioButtonQ1T2 = new javax.swing.JRadioButton();
        CRadioButtonQ1T2 = new javax.swing.JRadioButton();
        BRadioButtonQ1T2 = new javax.swing.JRadioButton();
        DRadioButtonQ2T2 = new javax.swing.JRadioButton();
        ARadioButtonQ2T2 = new javax.swing.JRadioButton();
        CRadioButtonQ3T2 = new javax.swing.JRadioButton();
        BRadioButtonQ2T2 = new javax.swing.JRadioButton();
        CRadioButtonQ2T2 = new javax.swing.JRadioButton();
        DRadioButtonQ3T2 = new javax.swing.JRadioButton();
        BRadioButtonQ3T2 = new javax.swing.JRadioButton();
        ARadioButtonQ3T2 = new javax.swing.JRadioButton();
        CRadioButtonQ4T2 = new javax.swing.JRadioButton();
        DRadioButtonQ4T2 = new javax.swing.JRadioButton();
        ARadioButtonQ4T2 = new javax.swing.JRadioButton();
        BRadioButtonQ4T2 = new javax.swing.JRadioButton();
        ARadioButtonQ1T2 = new javax.swing.JRadioButton();
        nextButtonT2 = new javax.swing.JLabel();
        readButtonT2 = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaT3 = new javax.swing.JTextArea();
        jPanelT3 = new javax.swing.JPanel();
        questionLabel2 = new javax.swing.JLabel();
        q1Label2 = new javax.swing.JLabel();
        q2Label2 = new javax.swing.JLabel();
        q3label2 = new javax.swing.JLabel();
        q4Label2 = new javax.swing.JLabel();
        DRadioButtonQ1T3 = new javax.swing.JRadioButton();
        ARadioButtonQ1T3 = new javax.swing.JRadioButton();
        BRadioButtonQ1T3 = new javax.swing.JRadioButton();
        DRadioButtonQ2T3 = new javax.swing.JRadioButton();
        CRadioButtonQ1T3 = new javax.swing.JRadioButton();
        ARadioButtonQ2T3 = new javax.swing.JRadioButton();
        CRadioButtonQ3T3 = new javax.swing.JRadioButton();
        BRadioButtonQ2T3 = new javax.swing.JRadioButton();
        CRadioButtonQ2T3 = new javax.swing.JRadioButton();
        DRadioButtonQ3T3 = new javax.swing.JRadioButton();
        BRadioButtonQ3T3 = new javax.swing.JRadioButton();
        ARadioButtonQ3T3 = new javax.swing.JRadioButton();
        CRadioButtonQ4T3 = new javax.swing.JRadioButton();
        DRadioButtonQ4T3 = new javax.swing.JRadioButton();
        ARadioButtonQ4T3 = new javax.swing.JRadioButton();
        BRadioButtonQ4T3 = new javax.swing.JRadioButton();
        nextButtonT3 = new javax.swing.JLabel();
        readButtonT3 = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaT4 = new javax.swing.JTextArea();
        jPanelT4 = new javax.swing.JPanel();
        questionLabel3 = new javax.swing.JLabel();
        q1Label3 = new javax.swing.JLabel();
        q2Label3 = new javax.swing.JLabel();
        q3label3 = new javax.swing.JLabel();
        q4Label3 = new javax.swing.JLabel();
        DRadioButtonQ1T4 = new javax.swing.JRadioButton();
        ARadioButtonQ1T4 = new javax.swing.JRadioButton();
        BRadioButtonQ1T4 = new javax.swing.JRadioButton();
        DRadioButtonQ2T4 = new javax.swing.JRadioButton();
        CRadioButtonQ1T4 = new javax.swing.JRadioButton();
        ARadioButtonQ2T4 = new javax.swing.JRadioButton();
        CRadioButtonQ3T4 = new javax.swing.JRadioButton();
        BRadioButtonQ2T4 = new javax.swing.JRadioButton();
        CRadioButtonQ2T4 = new javax.swing.JRadioButton();
        DRadioButtonQ3T4 = new javax.swing.JRadioButton();
        BRadioButtonQ3T4 = new javax.swing.JRadioButton();
        ARadioButtonQ3T4 = new javax.swing.JRadioButton();
        CRadioButtonQ4T4 = new javax.swing.JRadioButton();
        DRadioButtonQ4T4 = new javax.swing.JRadioButton();
        ARadioButtonQ4T4 = new javax.swing.JRadioButton();
        BRadioButtonQ4T4 = new javax.swing.JRadioButton();
        nextButtonT4 = new javax.swing.JLabel();
        readButtonT4 = new javax.swing.JLabel();
        background3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textAreaT5 = new javax.swing.JTextArea();
        jPanelT5 = new javax.swing.JPanel();
        questionLabel4 = new javax.swing.JLabel();
        q1Label4 = new javax.swing.JLabel();
        q2Label4 = new javax.swing.JLabel();
        q3label4 = new javax.swing.JLabel();
        q4Label4 = new javax.swing.JLabel();
        DRadioButtonQ1T5 = new javax.swing.JRadioButton();
        ARadioButtonQ1T5 = new javax.swing.JRadioButton();
        BRadioButtonQ1T5 = new javax.swing.JRadioButton();
        DButtonQ2T5 = new javax.swing.JRadioButton();
        CRadioButtonQ1T5 = new javax.swing.JRadioButton();
        ARadioButtonQ2T5 = new javax.swing.JRadioButton();
        CRadioButtonQ3T5 = new javax.swing.JRadioButton();
        BRadioButtonQ2T5 = new javax.swing.JRadioButton();
        CRadioButtonQ2T5 = new javax.swing.JRadioButton();
        DRadioButtonQ3T5 = new javax.swing.JRadioButton();
        BRadioButtonQ3T5 = new javax.swing.JRadioButton();
        ARadioButtonQ3T5 = new javax.swing.JRadioButton();
        CRadioButtonQ4T5 = new javax.swing.JRadioButton();
        DRadioButtonQ4T5 = new javax.swing.JRadioButton();
        ARadioButtonQ4T5 = new javax.swing.JRadioButton();
        BRadioButtonQ4T5 = new javax.swing.JRadioButton();
        exitButton5 = new javax.swing.JLabel();
        readButtonT5 = new javax.swing.JLabel();
        background4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaT1.setEditable(false);
        textAreaT1.setColumns(20);
        textAreaT1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        textAreaT1.setLineWrap(true);
        textAreaT1.setRows(5);
        textAreaT1.setText("The New Bicycle\n \nEmma has a new bicycle.  It is bright pink and shiny.  \nIt was a gift from her uncle.  He hid it behind a bush \nto surprise her.  \nWhen Emma looked behind the bush and saw the \nbicycle, she jumped for joy.  It was just what she \nwanted.  She gave her uncle a big hug. \nShe loves her new bicycle, and she loves her uncle. ");
        textAreaT1.setToolTipText("");
        textAreaT1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textAreaT1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 25, 270, 420));

        jPanelT1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questionLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        questionLabel.setText("Questions");
        jPanelT1.add(questionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, -1, -1));

        q1Label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q1Label.setText("1. What Color is the Bicycle?");
        jPanelT1.add(q1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, -1, -1));

        q2Label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q2Label.setText("2. Who was it gift from?");
        jPanelT1.add(q2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, -1, -1));

        q3label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q3label.setText("3. Where was it hidden?");
        jPanelT1.add(q3label, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

        q4Label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q4Label.setText("4. When Emma saw the bicycle, what did she do?");
        jPanelT1.add(q4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 305, -1, -1));

        DRadioButtonQ1T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ1T1.setText("Pink");
        jPanelT1.add(DRadioButtonQ1T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 91, -1));

        ARadioButtonQ1T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ1T1.setText("Red");
        jPanelT1.add(ARadioButtonQ1T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 91, -1));

        BRadioButtonQ1T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ1T1.setText("Green");
        jPanelT1.add(BRadioButtonQ1T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 91, -1));

        DRadioButtonQ2T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ2T1.setText("Aunt");
        jPanelT1.add(DRadioButtonQ2T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 91, -1));

        CRadioButtonQ1T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ1T1.setText("Black");
        jPanelT1.add(CRadioButtonQ1T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 91, -1));

        ARadioButtonQ2T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ2T1.setText("Uncle");
        jPanelT1.add(ARadioButtonQ2T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 91, -1));

        CRadioButtonQ3T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ3T1.setText("On the table");
        jPanelT1.add(CRadioButtonQ3T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        BRadioButtonQ2T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ2T1.setText("Father");
        jPanelT1.add(BRadioButtonQ2T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 91, -1));

        CRadioButtonQ2T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ2T1.setText("Mother");
        jPanelT1.add(CRadioButtonQ2T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 91, -1));

        DRadioButtonQ3T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ3T1.setText("On the yard");
        jPanelT1.add(DRadioButtonQ3T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, -1));

        BRadioButtonQ3T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ3T1.setText("Behind the trunk");
        jPanelT1.add(BRadioButtonQ3T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, -1));

        ARadioButtonQ3T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ3T1.setText("Behind a bush");
        jPanelT1.add(ARadioButtonQ3T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        CRadioButtonQ4T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ4T1.setText("Cry");
        CRadioButtonQ4T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRadioButtonQ4T1ActionPerformed(evt);
            }
        });
        jPanelT1.add(CRadioButtonQ4T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 70, -1));

        DRadioButtonQ4T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ4T1.setText("Run away");
        DRadioButtonQ4T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRadioButtonQ4T1ActionPerformed(evt);
            }
        });
        jPanelT1.add(DRadioButtonQ4T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 90, -1));

        ARadioButtonQ4T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ4T1.setText("Laugh");
        jPanelT1.add(ARadioButtonQ4T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, -1));

        BRadioButtonQ4T1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ4T1.setText("Jump for Joy");
        jPanelT1.add(BRadioButtonQ4T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 130, -1));

        jPanel1.add(jPanelT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 25, 340, 403));

        returnButton0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button_Letters/back button.png"))); // NOI18N
        returnButton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButton0MouseClicked(evt);
            }
        });
        jPanel1.add(returnButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        nextButtonT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button_Letters/next button.png"))); // NOI18N
        nextButtonT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonT1MouseClicked(evt);
            }
        });
        jPanel1.add(nextButtonT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, -1));

        readButtonT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/READ_Button__140_x_125 (1).png"))); // NOI18N
        readButtonT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readButtonT1MouseClicked(evt);
            }
        });
        jPanel1.add(readButtonT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgbgbg.gif"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 600));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaT2.setEditable(false);
        textAreaT2.setColumns(20);
        textAreaT2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        textAreaT2.setLineWrap(true);
        textAreaT2.setRows(5);
        textAreaT2.setText("Summer Nights \n\nIt is nighttime in the summer.  \nLuke, Jake and Connor look up at the sky.  Jake sees \nthe Milky Way.  Luke points to the moon.  It is a half \nmoon.  Connor looks at all of the bright stars.  \nAfter they study the sky, they collect fireflies in a jar. \nThey hear an owl hoot loudly from a \nnearby tree.  \nThe boys love being outside on summer \nnights.  They sleep in a tent so they \ncan stay out all night.  \nWhen they are ready to go bed, they climb into the \ntent and use the fireflies as a nightlight.  \nThey let the fireflies go in the morning so they can \ncatch them again the next time they sleep outside. ");
        textAreaT2.setToolTipText("");
        textAreaT2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(textAreaT2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 25, 249, 383));

        jPanelT2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questionLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        questionLabel1.setText("Questions");
        jPanelT2.add(questionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, -1, -1));

        q1Label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q1Label1.setText("1. What do Luke, Jake and Connor look at? ");
        jPanelT2.add(q1Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, -1, -1));

        q2Label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q2Label1.setText("2. What does Luke point to in the sky?  ");
        jPanelT2.add(q2Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, -1, -1));

        q3label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q3label1.setText("3. What do the boys collect in a jar? ");
        jPanelT2.add(q3label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

        q4Label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q4Label1.setText("4. Where do the boys sleep?");
        jPanelT2.add(q4Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 305, -1, -1));

        DRadioButtonQ1T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ1T2.setText("The Sun");
        jPanelT2.add(DRadioButtonQ1T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 91, -1));

        CRadioButtonQ1T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ1T2.setText("A Bird");
        jPanelT2.add(CRadioButtonQ1T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 91, -1));

        BRadioButtonQ1T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ1T2.setText("The Sky");
        BRadioButtonQ1T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRadioButtonQ1T2ActionPerformed(evt);
            }
        });
        jPanelT2.add(BRadioButtonQ1T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 91, -1));

        DRadioButtonQ2T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ2T2.setText("The Plane");
        jPanelT2.add(DRadioButtonQ2T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 91, -1));

        ARadioButtonQ2T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ2T2.setText("The Clouds");
        jPanelT2.add(ARadioButtonQ2T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 91, -1));

        CRadioButtonQ3T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ3T2.setText("Ants");
        jPanelT2.add(CRadioButtonQ3T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        BRadioButtonQ2T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ2T2.setText("The Stars");
        BRadioButtonQ2T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRadioButtonQ2T2ActionPerformed(evt);
            }
        });
        jPanelT2.add(BRadioButtonQ2T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 91, -1));

        CRadioButtonQ2T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ2T2.setText("The Moon");
        jPanelT2.add(CRadioButtonQ2T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 91, -1));

        DRadioButtonQ3T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ3T2.setText("Leaves");
        jPanelT2.add(DRadioButtonQ3T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, -1));

        BRadioButtonQ3T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ3T2.setText("Worms");
        jPanelT2.add(BRadioButtonQ3T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, -1));

        ARadioButtonQ3T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ3T2.setText("Fireflies");
        jPanelT2.add(ARadioButtonQ3T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        CRadioButtonQ4T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ4T2.setText("In a tent");
        jPanelT2.add(CRadioButtonQ4T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 70, -1));

        DRadioButtonQ4T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ4T2.setText("On the grass");
        jPanelT2.add(DRadioButtonQ4T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 110, -1));

        ARadioButtonQ4T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ4T2.setText("In bed");
        jPanelT2.add(ARadioButtonQ4T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, -1));

        BRadioButtonQ4T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ4T2.setText("On a cot");
        jPanelT2.add(BRadioButtonQ4T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 90, -1));

        ARadioButtonQ1T2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ1T2.setText("The Night");
        jPanelT2.add(ARadioButtonQ1T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 91, -1));

        jPanel2.add(jPanelT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 25, 310, 403));

        nextButtonT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button_Letters/next button.png"))); // NOI18N
        nextButtonT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonT2MouseClicked(evt);
            }
        });
        jPanel2.add(nextButtonT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, -1));

        readButtonT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/READ_Button__140_x_125 (1).png"))); // NOI18N
        readButtonT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readButtonT2MouseClicked(evt);
            }
        });
        jPanel2.add(readButtonT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgbgbg.gif"))); // NOI18N
        jPanel2.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 600));

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaT3.setEditable(false);
        textAreaT3.setColumns(20);
        textAreaT3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        textAreaT3.setLineWrap(true);
        textAreaT3.setRows(5);
        textAreaT3.setText("The Puppy and the Kitten \n\nMy family just adopted a puppy and a kitten from the \nanimal shelter.  They were so young, they did not \neven have names yet.  We had to think of good \nnames for them. \nThe puppy likes to jump up.  The kitten likes to curl up \nin our laps. \n“What do you want to name them?” asked Mom. \nMy sister said, “Pounce for the puppy and Cuddles \nfor the kitten.”  \nWe all thought those names were \nperfect.   ");
        textAreaT3.setToolTipText("");
        textAreaT3.setWrapStyleWord(true);
        jScrollPane3.setViewportView(textAreaT3);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 25, 249, 383));

        jPanelT3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questionLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        questionLabel2.setText("Questions");
        jPanelT3.add(questionLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, -1, -1));

        q1Label2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q1Label2.setText("1. What animals did they adopt?");
        jPanelT3.add(q1Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, -1, -1));

        q2Label2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q2Label2.setText("2. What does the kitten like to do?");
        jPanelT3.add(q2Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, -1, -1));

        q3label2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q3label2.setText("3. What is the puppy’s name going to be?");
        jPanelT3.add(q3label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

        q4Label2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q4Label2.setText("4. Who thought the names were perfect?");
        jPanelT3.add(q4Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 305, -1, -1));

        DRadioButtonQ1T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ1T3.setText("Snake and Pig");
        jPanelT3.add(DRadioButtonQ1T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, -1));

        ARadioButtonQ1T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ1T3.setText("Puppy and Kitten");
        jPanelT3.add(ARadioButtonQ1T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        BRadioButtonQ1T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ1T3.setText("Fish and Rabbit");
        BRadioButtonQ1T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRadioButtonQ1T3ActionPerformed(evt);
            }
        });
        jPanelT3.add(BRadioButtonQ1T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, -1));

        DRadioButtonQ2T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ2T3.setText("Play");
        jPanelT3.add(DRadioButtonQ2T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 91, -1));

        CRadioButtonQ1T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ1T3.setText("Parrot and Hamster");
        jPanelT3.add(CRadioButtonQ1T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        ARadioButtonQ2T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ2T3.setText("Curl");
        jPanelT3.add(ARadioButtonQ2T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 91, -1));

        CRadioButtonQ3T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ3T3.setText("Fluffy");
        jPanelT3.add(CRadioButtonQ3T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        BRadioButtonQ2T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ2T3.setText("Jump");
        BRadioButtonQ2T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRadioButtonQ2T3ActionPerformed(evt);
            }
        });
        jPanelT3.add(BRadioButtonQ2T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 91, -1));

        CRadioButtonQ2T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ2T3.setText("Run");
        jPanelT3.add(CRadioButtonQ2T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 91, -1));

        DRadioButtonQ3T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ3T3.setText("Sparky");
        jPanelT3.add(DRadioButtonQ3T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, -1));

        BRadioButtonQ3T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ3T3.setText("Pounce");
        jPanelT3.add(BRadioButtonQ3T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, -1));

        ARadioButtonQ3T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ3T3.setText("Rover");
        jPanelT3.add(ARadioButtonQ3T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        CRadioButtonQ4T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ4T3.setText("Children");
        jPanelT3.add(CRadioButtonQ4T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 70, -1));

        DRadioButtonQ4T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ4T3.setText("All");
        jPanelT3.add(DRadioButtonQ4T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 110, -1));

        ARadioButtonQ4T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ4T3.setText("Emma");
        jPanelT3.add(ARadioButtonQ4T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, -1));

        BRadioButtonQ4T3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ4T3.setText("Parents");
        jPanelT3.add(BRadioButtonQ4T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 90, -1));

        jPanel3.add(jPanelT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 25, 310, 403));

        nextButtonT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button_Letters/next button.png"))); // NOI18N
        nextButtonT3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonT3MouseClicked(evt);
            }
        });
        jPanel3.add(nextButtonT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, -1));

        readButtonT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/READ_Button__140_x_125 (1).png"))); // NOI18N
        readButtonT3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readButtonT3MouseClicked(evt);
            }
        });
        jPanel3.add(readButtonT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgbgbg.gif"))); // NOI18N
        jPanel3.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 600));

        jTabbedPane1.addTab("tab3", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaT4.setEditable(false);
        textAreaT4.setColumns(20);
        textAreaT4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        textAreaT4.setLineWrap(true);
        textAreaT4.setRows(5);
        textAreaT4.setText("All About Bears\n \nThere are many kinds of bears.  Some bears live in \nwarm places, like sun bears.  Some bears live in cold \nplaces, like polar bears.  Bears are different colors, \ntoo.  They can be white, brown, or black.  Some \nbears eat plants.  Some bears eat animals.  \nBears have long snouts, or noses.  They have claws \nand fur, too.  Baby bears are called cubs.  \nWhen it gets cold, bears sleep in dens for the winter. \nDens can be in trees or caves.  When they are \nsleeping all winter, it is \ncalled hibernating.  Bears \ndo not eat when \nthey are \nhibernating. ");
        textAreaT4.setToolTipText("");
        textAreaT4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(textAreaT4);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 25, 249, 383));

        jPanelT4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questionLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        questionLabel3.setText("Questions");
        jPanelT4.add(questionLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, -1, -1));

        q1Label3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q1Label3.setText("1. Do all bears live in warm places?");
        jPanelT4.add(q1Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, -1, -1));

        q2Label3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q2Label3.setText("2. Where do bears sleep during the winter?");
        jPanelT4.add(q2Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, -1, -1));

        q3label3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q3label3.setText("3. What does hibernating mean? ");
        jPanelT4.add(q3label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

        q4Label3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q4Label3.setText("4. What is a baby bear called?");
        jPanelT4.add(q4Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 305, -1, -1));

        DRadioButtonQ1T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ1T4.setText("Sometimes");
        jPanelT4.add(DRadioButtonQ1T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 91, -1));

        ARadioButtonQ1T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ1T4.setText("Maybe");
        jPanelT4.add(ARadioButtonQ1T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        BRadioButtonQ1T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ1T4.setText("No");
        BRadioButtonQ1T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRadioButtonQ1T4ActionPerformed(evt);
            }
        });
        jPanelT4.add(BRadioButtonQ1T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, -1));

        DRadioButtonQ2T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ2T4.setText("Holes");
        DRadioButtonQ2T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRadioButtonQ2T4ActionPerformed(evt);
            }
        });
        jPanelT4.add(DRadioButtonQ2T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 91, -1));

        CRadioButtonQ1T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ1T4.setText("Yes");
        jPanelT4.add(CRadioButtonQ1T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        ARadioButtonQ2T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ2T4.setText("Dens");
        jPanelT4.add(ARadioButtonQ2T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 91, -1));

        CRadioButtonQ3T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ3T4.setText("Sleeping");
        jPanelT4.add(CRadioButtonQ3T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        BRadioButtonQ2T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ2T4.setText("Burrows");
        BRadioButtonQ2T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRadioButtonQ2T4ActionPerformed(evt);
            }
        });
        jPanelT4.add(BRadioButtonQ2T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 91, -1));

        CRadioButtonQ2T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ2T4.setText("Nests");
        jPanelT4.add(CRadioButtonQ2T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 91, -1));

        DRadioButtonQ3T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ3T4.setText("Playing");
        jPanelT4.add(DRadioButtonQ3T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, -1));

        BRadioButtonQ3T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ3T4.setText("Running");
        jPanelT4.add(BRadioButtonQ3T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, -1));

        ARadioButtonQ3T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ3T4.setText("Eating");
        jPanelT4.add(ARadioButtonQ3T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        CRadioButtonQ4T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ4T4.setText("Calf");
        jPanelT4.add(CRadioButtonQ4T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 70, -1));

        DRadioButtonQ4T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ4T4.setText("Joey");
        jPanelT4.add(DRadioButtonQ4T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 110, -1));

        ARadioButtonQ4T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ4T4.setText("Cub");
        jPanelT4.add(ARadioButtonQ4T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, -1));

        BRadioButtonQ4T4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ4T4.setText("Kid");
        jPanelT4.add(BRadioButtonQ4T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 90, -1));

        jPanel4.add(jPanelT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 25, 330, 403));

        nextButtonT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button_Letters/next button.png"))); // NOI18N
        nextButtonT4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonT4MouseClicked(evt);
            }
        });
        jPanel4.add(nextButtonT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, -1, -1));

        readButtonT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/READ_Button__140_x_125 (1).png"))); // NOI18N
        readButtonT4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readButtonT4MouseClicked(evt);
            }
        });
        jPanel4.add(readButtonT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgbgbg.gif"))); // NOI18N
        jPanel4.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 600));

        jTabbedPane1.addTab("tab4", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaT5.setEditable(false);
        textAreaT5.setColumns(20);
        textAreaT5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        textAreaT5.setLineWrap(true);
        textAreaT5.setRows(5);
        textAreaT5.setText("In Search of Courage\n \nPete did not like storms. He \ndid not like flashes of \nlightning or rumbles of \nthunder. Storms scared Pete. \n“It is OK to be scared,” his mom said. “We all \nget scared sometimes.” Still, Pete did not like \nstorms.  \n“No need to be scared,” his dad said. “The \nstorm is outside, and you are safe inside the \nhouse.” Still, storms scared Pete. \nOne day, Pete’s Granddad came to visit. While \nthey sat at the table eating lunch a storm blew \nup. A really big storm! The lightning flashed and \nthe thunder rolled and banged. Pete felt \nscared.  \n©   www.k5learning.com \nReading and Math for K-5  \nGrade 1 Reading Comprehension Worksheet \nGranddad put his hand on Pete’s \nshoulder. “Where is your courage, \nboy?” his Granddad asked.   \n“Does it go into hiding  \nduring a storm?” \nPete began to search the \nhouse. He searched \nunder his blankets and in \nthe bottom of his toy box. Pete searched the \nshadows where flashes of lightning could not \nreach. Pete found no trace of his courage. \nPete checked the corners of his closet and up \nin the attic. Pete checked spaces where the \nrumbles were quieter. Still, no trace of his \ncourage. Pete looked in places where the \nbangs did not sound so loud. Still, Pete found no \ntrace of his courage. \nPete’s Granddad found him \nsitting on the basement steps. \n“What’s the matter?” his \nGranddad asked. \n“I’ve look all over the house and I can’t find my \ncourage anywhere.” \nPete’s Granddad began to laugh.  \n“What’s so funny?” Pete asked. \n“Didn’t you notice, the storm’s over?” \nGranddad replied. \nPete began to laugh too. “I guess I was so busy \nlooking for my courage I forgot to be afraid!” ");
        textAreaT5.setToolTipText("");
        textAreaT5.setWrapStyleWord(true);
        jScrollPane5.setViewportView(textAreaT5);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 25, 249, 383));

        jPanelT5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questionLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        questionLabel4.setText("Questions");
        jPanelT5.add(questionLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, -1, -1));

        q1Label4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q1Label4.setText("1. What scared Pete?");
        jPanelT5.add(q1Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, -1, -1));

        q2Label4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q2Label4.setText("2. Where did Pete search for his courage?");
        jPanelT5.add(q2Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, -1, -1));

        q3label4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q3label4.setText("3. Who asked Pete about his courage?");
        jPanelT5.add(q3label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

        q4Label4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        q4Label4.setText("4. What did Pete forget to be afraid of?");
        jPanelT5.add(q4Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 305, -1, -1));

        DRadioButtonQ1T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ1T5.setText("Dogs");
        jPanelT5.add(DRadioButtonQ1T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 91, -1));

        ARadioButtonQ1T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ1T5.setText("Rains");
        jPanelT5.add(ARadioButtonQ1T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        BRadioButtonQ1T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ1T5.setText("Birds");
        BRadioButtonQ1T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRadioButtonQ1T5ActionPerformed(evt);
            }
        });
        jPanelT5.add(BRadioButtonQ1T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, -1));

        DButtonQ2T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DButtonQ2T5.setText("Beach");
        DButtonQ2T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DButtonQ2T5ActionPerformed(evt);
            }
        });
        jPanelT5.add(DButtonQ2T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 91, -1));

        CRadioButtonQ1T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ1T5.setText("Storms");
        jPanelT5.add(CRadioButtonQ1T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        ARadioButtonQ2T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ2T5.setText("School");
        jPanelT5.add(ARadioButtonQ2T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 91, -1));

        CRadioButtonQ3T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ3T5.setText("Mom");
        jPanelT5.add(CRadioButtonQ3T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        BRadioButtonQ2T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ2T5.setText("House");
        BRadioButtonQ2T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRadioButtonQ2T5ActionPerformed(evt);
            }
        });
        jPanelT5.add(BRadioButtonQ2T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 91, -1));

        CRadioButtonQ2T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ2T5.setText("Park");
        jPanelT5.add(CRadioButtonQ2T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 91, -1));

        DRadioButtonQ3T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ3T5.setText("Sister");
        jPanelT5.add(DRadioButtonQ3T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, -1));

        BRadioButtonQ3T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ3T5.setText("Dad");
        jPanelT5.add(BRadioButtonQ3T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, -1));

        ARadioButtonQ3T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ3T5.setText("Granddad");
        jPanelT5.add(ARadioButtonQ3T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        CRadioButtonQ4T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CRadioButtonQ4T5.setText("Thunder");
        jPanelT5.add(CRadioButtonQ4T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 70, -1));

        DRadioButtonQ4T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        DRadioButtonQ4T5.setText("Storm");
        jPanelT5.add(DRadioButtonQ4T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 110, -1));

        ARadioButtonQ4T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ARadioButtonQ4T5.setText("Lightning");
        jPanelT5.add(ARadioButtonQ4T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, -1));

        BRadioButtonQ4T5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BRadioButtonQ4T5.setText("Wind");
        jPanelT5.add(BRadioButtonQ4T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 90, -1));

        jPanel5.add(jPanelT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 25, 310, 403));

        exitButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button_Letters/next button.png"))); // NOI18N
        exitButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButton5MouseClicked(evt);
            }
        });
        jPanel5.add(exitButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 50, 50));

        readButtonT5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/READ_Button__140_x_125 (1).png"))); // NOI18N
        readButtonT5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readButtonT5MouseClicked(evt);
            }
        });
        jPanel5.add(readButtonT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgbgbg.gif"))); // NOI18N
        jPanel5.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 600));

        jTabbedPane1.addTab("tab5", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, -21, -1, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BRadioButtonQ1T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRadioButtonQ1T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRadioButtonQ1T2ActionPerformed

    private void BRadioButtonQ2T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRadioButtonQ2T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRadioButtonQ2T2ActionPerformed

    private void BRadioButtonQ1T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRadioButtonQ1T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRadioButtonQ1T3ActionPerformed

    private void BRadioButtonQ2T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRadioButtonQ2T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRadioButtonQ2T3ActionPerformed

    private void BRadioButtonQ1T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRadioButtonQ1T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRadioButtonQ1T4ActionPerformed

    private void BRadioButtonQ2T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRadioButtonQ2T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRadioButtonQ2T4ActionPerformed

    private void DRadioButtonQ2T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRadioButtonQ2T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DRadioButtonQ2T4ActionPerformed

    private void BRadioButtonQ1T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRadioButtonQ1T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRadioButtonQ1T5ActionPerformed

    private void DButtonQ2T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DButtonQ2T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DButtonQ2T5ActionPerformed

    private void BRadioButtonQ2T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRadioButtonQ2T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRadioButtonQ2T5ActionPerformed

    private void nextButtonT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonT1MouseClicked
        // TODO add your handling code here:
        JRadioButton[] radioButtons = {DRadioButtonQ1T1, ARadioButtonQ2T1, ARadioButtonQ3T1, BRadioButtonQ4T1};
        String[] correctAnswers = {DRadioButtonQ1T1.getText(), ARadioButtonQ2T1.getText(), ARadioButtonQ3T1.getText(), BRadioButtonQ4T1.getText()};
        ButtonActions.checkAnswerAndNextMultipleChoice(jTabbedPane1, radioButtons, correctAnswers);
    }//GEN-LAST:event_nextButtonT1MouseClicked

    private void returnButton0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButton0MouseClicked
        // TODO add your handling code here:
        ReadNLearn readNLearn = new ReadNLearn();
        readNLearn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnButton0MouseClicked

    private void readButtonT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readButtonT1MouseClicked
        // TODO add your handling code here:
        ButtonActions.readText(textAreaT1, musicPlayer);
    }//GEN-LAST:event_readButtonT1MouseClicked

    private void nextButtonT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonT2MouseClicked
        // TODO add your handling code here:
        JRadioButton[] radioButtons = {BRadioButtonQ1T2, ARadioButtonQ2T2, ARadioButtonQ3T2, ARadioButtonQ4T2};
        String[] correctAnswers = {BRadioButtonQ1T2.getText(), ARadioButtonQ2T2.getText(), ARadioButtonQ3T2.getText(), ARadioButtonQ4T2.getText()};

        ButtonActions.checkAnswerAndNextMultipleChoice(jTabbedPane1, radioButtons, correctAnswers);
    }//GEN-LAST:event_nextButtonT2MouseClicked

    private void DRadioButtonQ4T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRadioButtonQ4T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DRadioButtonQ4T1ActionPerformed

    private void CRadioButtonQ4T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRadioButtonQ4T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRadioButtonQ4T1ActionPerformed

    private void readButtonT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readButtonT2MouseClicked
        // TODO add your handling code here:
        ButtonActions.readText(textAreaT2, musicPlayer);
    }//GEN-LAST:event_readButtonT2MouseClicked

    private void readButtonT3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readButtonT3MouseClicked
        // TODO add your handling code here:
        ButtonActions.readText(textAreaT3, musicPlayer);
    }//GEN-LAST:event_readButtonT3MouseClicked

    private void nextButtonT3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonT3MouseClicked
        // TODO add your handling code here:
        JRadioButton[] radioButtons = {ARadioButtonQ1T3, ARadioButtonQ2T3, BRadioButtonQ3T3, DRadioButtonQ4T3};
        String[] correctAnswers = {ARadioButtonQ1T3.getText(), ARadioButtonQ2T3.getText(), BRadioButtonQ3T3.getText(), DRadioButtonQ4T3.getText()};

        ButtonActions.checkAnswerAndNextMultipleChoice(jTabbedPane1, radioButtons, correctAnswers);
    }//GEN-LAST:event_nextButtonT3MouseClicked

    private void readButtonT4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readButtonT4MouseClicked
        // TODO add your handling code here:
        ButtonActions.readText(textAreaT4, musicPlayer);
    }//GEN-LAST:event_readButtonT4MouseClicked

    private void nextButtonT4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonT4MouseClicked
        // TODO add your handling code here:
        JRadioButton[] radioButtons = {BRadioButtonQ1T4, ARadioButtonQ2T4, ARadioButtonQ3T4, ARadioButtonQ4T4};
        String[] correctAnswers = {BRadioButtonQ1T4.getText(), ARadioButtonQ2T4.getText(), ARadioButtonQ3T4.getText(), ARadioButtonQ4T4.getText()};

        ButtonActions.checkAnswerAndNextMultipleChoice(jTabbedPane1, radioButtons, correctAnswers);
    }//GEN-LAST:event_nextButtonT4MouseClicked

    private void readButtonT5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readButtonT5MouseClicked
        // TODO add your handling code here:
        ButtonActions.readText(textAreaT5, musicPlayer);
    }//GEN-LAST:event_readButtonT5MouseClicked

    private void exitButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton5MouseClicked
        // TODO add your handling code here:
        ReadNLearn readNLearn = new ReadNLearn();
        readNLearn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButton5MouseClicked

    private void readButtonT2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ButtonActions.readText(textAreaT2, musicPlayer);
    }

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
            java.util.logging.Logger.getLogger(StoryLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoryLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoryLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoryLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoryLearning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ARadioButtonQ1T1;
    private javax.swing.JRadioButton ARadioButtonQ1T2;
    private javax.swing.JRadioButton ARadioButtonQ1T3;
    private javax.swing.JRadioButton ARadioButtonQ1T4;
    private javax.swing.JRadioButton ARadioButtonQ1T5;
    private javax.swing.JRadioButton ARadioButtonQ2T1;
    private javax.swing.JRadioButton ARadioButtonQ2T2;
    private javax.swing.JRadioButton ARadioButtonQ2T3;
    private javax.swing.JRadioButton ARadioButtonQ2T4;
    private javax.swing.JRadioButton ARadioButtonQ2T5;
    private javax.swing.JRadioButton ARadioButtonQ3T1;
    private javax.swing.JRadioButton ARadioButtonQ3T2;
    private javax.swing.JRadioButton ARadioButtonQ3T3;
    private javax.swing.JRadioButton ARadioButtonQ3T4;
    private javax.swing.JRadioButton ARadioButtonQ3T5;
    private javax.swing.JRadioButton ARadioButtonQ4T1;
    private javax.swing.JRadioButton ARadioButtonQ4T2;
    private javax.swing.JRadioButton ARadioButtonQ4T3;
    private javax.swing.JRadioButton ARadioButtonQ4T4;
    private javax.swing.JRadioButton ARadioButtonQ4T5;
    private javax.swing.JRadioButton BRadioButtonQ1T1;
    private javax.swing.JRadioButton BRadioButtonQ1T2;
    private javax.swing.JRadioButton BRadioButtonQ1T3;
    private javax.swing.JRadioButton BRadioButtonQ1T4;
    private javax.swing.JRadioButton BRadioButtonQ1T5;
    private javax.swing.JRadioButton BRadioButtonQ2T1;
    private javax.swing.JRadioButton BRadioButtonQ2T2;
    private javax.swing.JRadioButton BRadioButtonQ2T3;
    private javax.swing.JRadioButton BRadioButtonQ2T4;
    private javax.swing.JRadioButton BRadioButtonQ2T5;
    private javax.swing.JRadioButton BRadioButtonQ3T1;
    private javax.swing.JRadioButton BRadioButtonQ3T2;
    private javax.swing.JRadioButton BRadioButtonQ3T3;
    private javax.swing.JRadioButton BRadioButtonQ3T4;
    private javax.swing.JRadioButton BRadioButtonQ3T5;
    private javax.swing.JRadioButton BRadioButtonQ4T1;
    private javax.swing.JRadioButton BRadioButtonQ4T2;
    private javax.swing.JRadioButton BRadioButtonQ4T3;
    private javax.swing.JRadioButton BRadioButtonQ4T4;
    private javax.swing.JRadioButton BRadioButtonQ4T5;
    private javax.swing.JRadioButton CRadioButtonQ1T1;
    private javax.swing.JRadioButton CRadioButtonQ1T2;
    private javax.swing.JRadioButton CRadioButtonQ1T3;
    private javax.swing.JRadioButton CRadioButtonQ1T4;
    private javax.swing.JRadioButton CRadioButtonQ1T5;
    private javax.swing.JRadioButton CRadioButtonQ2T1;
    private javax.swing.JRadioButton CRadioButtonQ2T2;
    private javax.swing.JRadioButton CRadioButtonQ2T3;
    private javax.swing.JRadioButton CRadioButtonQ2T4;
    private javax.swing.JRadioButton CRadioButtonQ2T5;
    private javax.swing.JRadioButton CRadioButtonQ3T1;
    private javax.swing.JRadioButton CRadioButtonQ3T2;
    private javax.swing.JRadioButton CRadioButtonQ3T3;
    private javax.swing.JRadioButton CRadioButtonQ3T4;
    private javax.swing.JRadioButton CRadioButtonQ3T5;
    private javax.swing.JRadioButton CRadioButtonQ4T1;
    private javax.swing.JRadioButton CRadioButtonQ4T2;
    private javax.swing.JRadioButton CRadioButtonQ4T3;
    private javax.swing.JRadioButton CRadioButtonQ4T4;
    private javax.swing.JRadioButton CRadioButtonQ4T5;
    private javax.swing.JRadioButton DButtonQ2T5;
    private javax.swing.JRadioButton DRadioButtonQ1T1;
    private javax.swing.JRadioButton DRadioButtonQ1T2;
    private javax.swing.JRadioButton DRadioButtonQ1T3;
    private javax.swing.JRadioButton DRadioButtonQ1T4;
    private javax.swing.JRadioButton DRadioButtonQ1T5;
    private javax.swing.JRadioButton DRadioButtonQ2T1;
    private javax.swing.JRadioButton DRadioButtonQ2T2;
    private javax.swing.JRadioButton DRadioButtonQ2T3;
    private javax.swing.JRadioButton DRadioButtonQ2T4;
    private javax.swing.JRadioButton DRadioButtonQ3T1;
    private javax.swing.JRadioButton DRadioButtonQ3T2;
    private javax.swing.JRadioButton DRadioButtonQ3T3;
    private javax.swing.JRadioButton DRadioButtonQ3T4;
    private javax.swing.JRadioButton DRadioButtonQ3T5;
    private javax.swing.JRadioButton DRadioButtonQ4T1;
    private javax.swing.JRadioButton DRadioButtonQ4T2;
    private javax.swing.JRadioButton DRadioButtonQ4T3;
    private javax.swing.JRadioButton DRadioButtonQ4T4;
    private javax.swing.JRadioButton DRadioButtonQ4T5;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel background3;
    private javax.swing.JLabel background4;
    private javax.swing.JLabel exitButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelT1;
    private javax.swing.JPanel jPanelT2;
    private javax.swing.JPanel jPanelT3;
    private javax.swing.JPanel jPanelT4;
    private javax.swing.JPanel jPanelT5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel nextButtonT1;
    private javax.swing.JLabel nextButtonT2;
    private javax.swing.JLabel nextButtonT3;
    private javax.swing.JLabel nextButtonT4;
    private javax.swing.JLabel q1Label;
    private javax.swing.JLabel q1Label1;
    private javax.swing.JLabel q1Label2;
    private javax.swing.JLabel q1Label3;
    private javax.swing.JLabel q1Label4;
    private javax.swing.JLabel q2Label;
    private javax.swing.JLabel q2Label1;
    private javax.swing.JLabel q2Label2;
    private javax.swing.JLabel q2Label3;
    private javax.swing.JLabel q2Label4;
    private javax.swing.JLabel q3label;
    private javax.swing.JLabel q3label1;
    private javax.swing.JLabel q3label2;
    private javax.swing.JLabel q3label3;
    private javax.swing.JLabel q3label4;
    private javax.swing.JLabel q4Label;
    private javax.swing.JLabel q4Label1;
    private javax.swing.JLabel q4Label2;
    private javax.swing.JLabel q4Label3;
    private javax.swing.JLabel q4Label4;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel questionLabel1;
    private javax.swing.JLabel questionLabel2;
    private javax.swing.JLabel questionLabel3;
    private javax.swing.JLabel questionLabel4;
    private javax.swing.JLabel readButtonT1;
    private javax.swing.JLabel readButtonT2;
    private javax.swing.JLabel readButtonT3;
    private javax.swing.JLabel readButtonT4;
    private javax.swing.JLabel readButtonT5;
    private javax.swing.JLabel returnButton0;
    private javax.swing.JTextArea textAreaT1;
    private javax.swing.JTextArea textAreaT2;
    private javax.swing.JTextArea textAreaT3;
    private javax.swing.JTextArea textAreaT4;
    private javax.swing.JTextArea textAreaT5;
    // End of variables declaration//GEN-END:variables
}