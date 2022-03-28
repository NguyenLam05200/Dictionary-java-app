/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author holohoi
 */
public class dictionary {

    static String slangWordFilePath = "slang.txt";
    public static List<String> slangWord = new ArrayList<>();
    static HashMap<String, List<Integer>> definitionSplit = new HashMap<>();
    static HashMap<String, String> dict = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Hello");

        getData();
//        System.out.println("get definitionSplit from word: " + dict.get("|O|"));
//        System.out.println("get word from definitionSplit: " + dict.get("LOL"));
        List<String> results = searchByDefinition("Laugh Out");
        if (!results.isEmpty()) {
            for (String result : results) {
                System.out.println(result);
            }
        } else {
            System.out.println("No result");
        }

    }

    public static String searchBySlangword(String input) {
        String result = dict.get(input);
        return result;
    }

    public static List<String> searchByDefinition(String input) {
        List<String> result = new ArrayList<>();

        String[] inputs = input.split(" ");
        List<List<Integer>> temp = new ArrayList<>();
        for (String word : inputs) {
            temp.add(definitionSplit.get(word));
        }
        for (Integer index : temp.get(0)) {
            boolean isExistInAllLists = true;
            for (List<Integer> list : temp) {
                if (!list.contains(index)) {
                    isExistInAllLists = false;
                    break;
                }
            }
            if (isExistInAllLists) {
                String res = slangWord.get(index);
                res = res + " :" + dict.get(res);
                result.add(res);
            }

        }

        return result;
    }

    public static void getData() {

        int index = 0;
        try {
            File file = new File(slangWordFilePath);    //creates a new file instance
            FileReader fr = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim().replaceAll(" +", " ");

                String[] lineSplited = line.split("`");
                if (lineSplited.length == 2) {
                    slangWord.add(lineSplited[0]);
                    String[] defs = lineSplited[1].split(" ");
                    for (String item : defs) {
                        if (definitionSplit.containsKey(item)) {
                            List<Integer> indexUpdate = definitionSplit.get(item);
                            indexUpdate.add(index);
                            definitionSplit.put(item, indexUpdate);
                        } else {
                            List<Integer> indexOfSlangword = new ArrayList<>();
                            indexOfSlangword.add(index);
                            definitionSplit.put(item, indexOfSlangword);
                        }

                    }
                    dict.put(lineSplited[0], lineSplited[1]);
                    index++;
                }
            }
            fr.close();    //closes the stream and release the resources
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
