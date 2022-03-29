/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author holohoi
 */
public class history {

    static String historyFilePath = "history.txt";

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

    public static String getData() {
        StringBuffer sb = new StringBuffer();    //constructs a string buffer with no characters
        try {
            File file = new File(historyFilePath);    //creates a new file instance
            FileReader fr = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream

            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);      //appends line to string buffer
                sb.append("\n");     //line feed
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
