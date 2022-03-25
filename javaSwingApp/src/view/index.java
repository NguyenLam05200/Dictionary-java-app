/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author holohoi
 */
public class index {

    private JPanel Header;
    private JPanel Navside;
    private JPanel Body;

    public Frame f;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().f.setVisible(true);
            }
        });
    }

    public index() {
        initComponents();

    }

    private void initComponents() {
        Header = headerPanel.Header();
        Navside = navsidePanel.Navside();
        Body = bodyPanel.SearchBody();
        f = new JFrame("Slang word");

//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(Header, java.awt.BorderLayout.PAGE_START);
        f.add(Navside, java.awt.BorderLayout.LINE_START);
        f.add(Body, java.awt.BorderLayout.CENTER);
        f.pack();
    }

}
