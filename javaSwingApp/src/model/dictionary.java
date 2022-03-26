/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author holohoi
 */
public class dictionary {

    static String slangWordFilePath = "slang.txt";

    public static void main(String[] args) {
        System.out.println("Hello");

        HashMap<String, String> dict = dict();
        System.out.println("get definition from word: " + dict.get("|O|"));
        System.out.println("get word from definition: " + dict.get("LOL"));

    }

    public static HashMap<String, String> dict() {
        HashMap<String, String> dict = new HashMap<>();

        try {
            File file = new File(slangWordFilePath);    //creates a new file instance
            FileReader fr = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim().replaceAll(" +", " ");

                String[] lineSplited = line.split("`");
                if (lineSplited.length == 2) {
                    dict.put(lineSplited[0], lineSplited[1]);
                }
            }
            fr.close();    //closes the stream and release the resources
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dict;
    }

}
