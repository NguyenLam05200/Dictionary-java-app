/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author holohoi
 */
public class Body extends javax.swing.JFrame {

    private static void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private static void editBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private static void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private static void randomBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private static JButton historyBtn() {
        JButton historyBtn = new javax.swing.JButton();
        historyBtn.setBackground(new java.awt.Color(255, 243, 210));
        historyBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        historyBtn.setForeground(new java.awt.Color(0, 0, 0));
        historyBtn.setText("History");
        historyBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });
        return historyBtn;
    }

    static JButton editBtn() {
        JButton editBtn = new javax.swing.JButton();
        editBtn.setBackground(new java.awt.Color(236, 224, 255));
        editBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setText("Edit this word");
        editBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        return editBtn;
    }

    static JButton deleteBtn() {
        JButton deleteBtn = new javax.swing.JButton();
        deleteBtn.setBackground(new java.awt.Color(0, 255, 194));
        deleteBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn.setText("Delete this word");
        deleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        return deleteBtn;
    }

    static JButton randomBtn() {
        JButton randomBtn = new javax.swing.JButton();
        randomBtn.setBackground(new java.awt.Color(230, 249, 115));
        randomBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        randomBtn.setForeground(new java.awt.Color(0, 0, 0));
        randomBtn.setText("Random a slang word");
        randomBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        randomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomBtnActionPerformed(evt);
            }
        });
        return randomBtn;
    }

    static JPanel actionPanel() {
        JPanel actionPanel = new JPanel();
        actionPanel.setBackground(new java.awt.Color(170, 189, 172));
        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);

        JPanel jPanel8 = new javax.swing.JPanel();
        jPanel8.setBackground(new java.awt.Color(118, 65, 65));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);

        JButton historyBtn = historyBtn();
        JButton editBtn = editBtn();
        JButton deleteBtn = deleteBtn();
        JButton randomBtn = randomBtn();

        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(randomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(randomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        actionPanelLayout.setHorizontalGroup(
                actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        actionPanelLayout.setVerticalGroup(
                actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                                .addContainerGap(41, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        return actionPanel;
    }

    static JScrollPane inputScrollPane() {
        JScrollPane inputScrollPane = new javax.swing.JScrollPane();
        javax.swing.JTextArea inputTextAreal = new javax.swing.JTextArea();
        inputTextAreal.setBackground(new java.awt.Color(255, 255, 255));
        inputTextAreal.setColumns(20);
        inputTextAreal.setRows(5);
        Font font = inputTextAreal.getFont();
        float size = font.getSize() + 5.0f;
        inputTextAreal.setFont(font.deriveFont(size));
        inputScrollPane.setViewportView(inputTextAreal);
        inputScrollPane.setViewportView(inputTextAreal);

        return inputScrollPane;
    }

    static JLabel searchByLabel() {
        JLabel searchByLabel = new javax.swing.JLabel();
        searchByLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        searchByLabel.setForeground(new java.awt.Color(0, 0, 0));
        searchByLabel.setText("Search by");
        return searchByLabel;
    }

    private static void searchByComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    static JComboBox<String> searchByComboBox() {
        JComboBox<String> searchByComboBox = new javax.swing.JComboBox<>();
        searchByComboBox.setBackground(new java.awt.Color(255, 204, 204));
        searchByComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        searchByComboBox.setForeground(new java.awt.Color(0, 0, 0));
        searchByComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Slang word", "Definition"}));
        searchByComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByComboBoxActionPerformed(evt);
            }
        });
        return searchByComboBox;
    }

    static JPanel inputHeaderPanel() {
        JPanel inputHeaderPanel = new javax.swing.JPanel();

        inputHeaderPanel.setBackground(new java.awt.Color(255, 155, 113));
        inputHeaderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        inputHeaderPanel.setForeground(new java.awt.Color(255, 155, 113));

        javax.swing.GroupLayout inputHeaderPanelLayout = new javax.swing.GroupLayout(inputHeaderPanel);
        inputHeaderPanel.setLayout(inputHeaderPanelLayout);

        JLabel searchByLabel = searchByLabel();
        JComboBox<String> searchByComboBox = searchByComboBox();

        inputHeaderPanelLayout.setHorizontalGroup(
                inputHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(inputHeaderPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(searchByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        inputHeaderPanelLayout.setVerticalGroup(
                inputHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputHeaderPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(inputHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchByLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchByComboBox))
                                .addContainerGap())
        );
        return inputHeaderPanel;
    }

    static JPanel inputPanel() {
        JPanel inputPanel = new javax.swing.JPanel();
        inputPanel.setBackground(new java.awt.Color(170, 189, 172));
        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        JScrollPane inputScrollPane = inputScrollPane();
        JPanel inputHeaderPanel = inputHeaderPanel();
        inputPanelLayout.setHorizontalGroup(
                inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputScrollPane)
                                        .addComponent(inputHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
                inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(inputPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inputHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addContainerGap())
        );
        return inputPanel;
    }

    static JScrollPane outputScrollPane() {
        JScrollPane outputScrollPane = new javax.swing.JScrollPane();
        outputScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        JTextArea jTextArea2 = new javax.swing.JTextArea();
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        Font fontjTextArea2 = jTextArea2.getFont();
        float sizejTextArea2 = fontjTextArea2.getSize() + 5.0f;
        jTextArea2.setFont(fontjTextArea2.deriveFont(sizejTextArea2));
        outputScrollPane.setViewportView(jTextArea2);

        return outputScrollPane;
    }

    static JPanel outputHeaderPanel() {
        JPanel outputHeaderPanel = new javax.swing.JPanel();

        outputHeaderPanel.setBackground(new java.awt.Color(255, 155, 113));
        outputHeaderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        outputHeaderPanel.setForeground(new java.awt.Color(255, 155, 113));
        JLabel jLabel7 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Result");

        javax.swing.GroupLayout outputHeaderPanelLayout = new javax.swing.GroupLayout(outputHeaderPanel);
        outputHeaderPanel.setLayout(outputHeaderPanelLayout);
        outputHeaderPanelLayout.setHorizontalGroup(
                outputHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        outputHeaderPanelLayout.setVerticalGroup(
                outputHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outputHeaderPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                .addContainerGap())
        );
        return outputHeaderPanel;
    }

    static JPanel outputPanel() {
        JPanel outputPanel = new javax.swing.JPanel();

        outputPanel.setBackground(new java.awt.Color(170, 189, 172));
        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        JScrollPane outputScrollPane = outputScrollPane();
        JPanel outputHeaderPanel = outputHeaderPanel();
        outputPanelLayout.setHorizontalGroup(
                outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outputPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(outputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                                        .addComponent(outputHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
                outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(outputPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(outputHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(outputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addContainerGap())
        );
        return outputPanel;
    }

    static JPanel searchPanel() {
        JPanel searchPanel = new javax.swing.JPanel();
        searchPanel.setBackground(new java.awt.Color(153, 255, 153));

        searchPanel.add(inputPanel());
        searchPanel.add(outputPanel());

        return searchPanel;
    }

    public static JPanel SearchBody() {
        JPanel SearchBody = new JPanel();
        SearchBody.setLayout(new java.awt.BorderLayout());
        JPanel actionPanel = actionPanel();
        JPanel searchPanel = searchPanel();

        SearchBody.add(actionPanel, java.awt.BorderLayout.PAGE_END);
        SearchBody.add(searchPanel, java.awt.BorderLayout.CENTER);

        return SearchBody;
    }
}
