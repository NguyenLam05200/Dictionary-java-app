/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author holohoi
 */
public class navsidePanel extends javax.swing.JFrame {

// Nav link search
    JPanel Body = bodyPanel.SearchBody();

    private static void Navlink_searchMouseClicked(java.awt.event.MouseEvent evt) {
//        f.add(Body, java.awt.BorderLayout.CENTER);
    }

    static JPanel Navlink_search() {
        JPanel Navlink_search = new javax.swing.JPanel();
        Navlink_search.setBackground(new java.awt.Color(58, 39, 112));
        Navlink_search.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), null), null));
        Navlink_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navlink_searchMouseClicked(evt);
            }
        });

        JLabel jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Search");

        javax.swing.GroupLayout Navlink_searchLayout = new javax.swing.GroupLayout(Navlink_search);
        Navlink_search.setLayout(Navlink_searchLayout);
        Navlink_searchLayout.setHorizontalGroup(
                Navlink_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Navlink_searchLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Navlink_searchLayout.setVerticalGroup(
                Navlink_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Navlink_searchLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        return Navlink_search;
    }

// Nav link Add a new word
    static JPanel Navlink_addNewWord() {
        JPanel Navlink_addNewWord = new javax.swing.JPanel();
        Navlink_addNewWord.setBackground(new java.awt.Color(58, 39, 112));
        Navlink_addNewWord.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), null), null));
//        Navlink_addNewWord.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                Navlink_addNewWordMouseClicked(evt);
//            }
//        });
        JLabel jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Add a new word");

        javax.swing.GroupLayout Navlink_addNewWordLayout = new javax.swing.GroupLayout(Navlink_addNewWord);
        Navlink_addNewWord.setLayout(Navlink_addNewWordLayout);
        Navlink_addNewWordLayout.setHorizontalGroup(
                Navlink_addNewWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Navlink_addNewWordLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Navlink_addNewWordLayout.setVerticalGroup(
                Navlink_addNewWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Navlink_addNewWordLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        return Navlink_addNewWord;
    }

// Nav link Quiz by word
    static JPanel Navlink_quizByWord() {
        JPanel Navlink_quizByWord = new javax.swing.JPanel();

        Navlink_quizByWord.setBackground(new java.awt.Color(58, 39, 112));
        Navlink_quizByWord.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), null), null));
        javax.swing.GroupLayout Navlink_quizByWordLayout = new javax.swing.GroupLayout(Navlink_quizByWord);
        Navlink_quizByWord.setLayout(Navlink_quizByWordLayout);

        JLabel jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Quiz by word");

        Navlink_quizByWordLayout.setHorizontalGroup(
                Navlink_quizByWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Navlink_quizByWordLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Navlink_quizByWordLayout.setVerticalGroup(
                Navlink_quizByWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Navlink_quizByWordLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        return Navlink_quizByWord;
    }

// Nav link Quiz by definition
    static JPanel Navlink_quizByDefinition() {
        JPanel Navlink_quizByDefinition = new javax.swing.JPanel();
        Navlink_quizByDefinition.setBackground(new java.awt.Color(58, 39, 112));
        Navlink_quizByDefinition.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), null), null));
        JLabel jLabel5 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Quiz by definition");

        javax.swing.GroupLayout Navlink_quizByDefinitionLayout = new javax.swing.GroupLayout(Navlink_quizByDefinition);
        Navlink_quizByDefinition.setLayout(Navlink_quizByDefinitionLayout);
        Navlink_quizByDefinitionLayout.setHorizontalGroup(
                Navlink_quizByDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Navlink_quizByDefinitionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        Navlink_quizByDefinitionLayout.setVerticalGroup(
                Navlink_quizByDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Navlink_quizByDefinitionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        return Navlink_quizByDefinition;
    }

    static JPanel Navside() {
        JPanel Navside = new javax.swing.JPanel();
        Navside.setBackground(new java.awt.Color(96, 73, 73));
        Navside.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, null));
        javax.swing.GroupLayout NavsideLayout = new javax.swing.GroupLayout(Navside);
        Navside.setLayout(NavsideLayout);

        JPanel Navlink_quizByWord = Navlink_quizByWord();
        JPanel Navlink_search = Navlink_search();
        JPanel Navlink_addNewWord = Navlink_addNewWord();
        JPanel Navlink_quizByDefinition = Navlink_quizByDefinition();

        NavsideLayout.setHorizontalGroup(
                NavsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(NavsideLayout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addGroup(NavsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Navlink_quizByWord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Navlink_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Navlink_addNewWord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Navlink_quizByDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        NavsideLayout.setVerticalGroup(
                NavsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(NavsideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Navlink_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Navlink_addNewWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Navlink_quizByWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Navlink_quizByDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(226, Short.MAX_VALUE))
        );
        return Navside;
    }
}
