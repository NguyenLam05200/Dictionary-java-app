/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author holohoi
 */
public class history {

    static String historyFilePath = "history.txt";

    public static void main(String args[]) {

    }

    public static void SaveHistory(String inputSearch) {
        try {
            FileWriter fstream = new FileWriter(historyFilePath, true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(inputSearch + "\n");
            out.close();
        } catch (Exception e) {
            System.err.println("Error while writing to file: "
                    + e.getMessage());
        }
    }
}
