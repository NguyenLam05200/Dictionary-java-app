/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author holohoi
 */
public class headerPanel extends javax.swing.JFrame {

    static JLabel logoLabel() {
        JLabel logoLabel = new javax.swing.JLabel();
        logoLabel.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(204, 255, 51));
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setText("SLANG WORD");
        return logoLabel;
    }

    static private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    static JButton resetBtn() {
        JButton resetBtn = new javax.swing.JButton();
        resetBtn.setBackground(new java.awt.Color(208, 228, 86));
        resetBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(0, 0, 0));
        resetBtn.setText("Reset to original");
//        resetBtn.setBorder(new RoundBtn(30));
        resetBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102)), null));

        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        return resetBtn;
    }

    static JPanel Header() {
        JPanel Header = new javax.swing.JPanel();
        Header.setBackground(new java.awt.Color(26, 15, 15));
        Header.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102)), null));
        Header.setAlignmentX(5.0F);

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);

        JLabel logoLabel = logoLabel();

        JButton resetBtn = resetBtn();
        HeaderLayout.setHorizontalGroup(
                HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HeaderLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(logoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 434, Short.MAX_VALUE)
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
        );
        HeaderLayout.setVerticalGroup(
                HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                                .addContainerGap(27, Short.MAX_VALUE)
                                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(logoLabel)
                                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
        );
        return Header;
    }
}
