/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author holohoi
 */
public class dictionary {

    static String slangWordFilePath = "slang.txt";
    static String slangWordUpdateFilePath = "slangUpdate.txt";
    static String slangWordDeleteFilePath = "slangDelete.txt";
    static String slangWordAddFilePath = "slangAdd.txt";

    public static List<String> slangWord = new ArrayList<>();
    static HashMap<String, List<Integer>> definitionSplit = new HashMap<>();
    static HashMap<String, String> dict = new HashMap<>();
    static HashMap<String, String> updateWords = new HashMap<>();
    static List<String> deleteWords = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello");

        getData();
//        System.out.println("get definitionSplit from word: " + dict.get("|O|"));
//        System.out.println("get word from definitionSplit: " + dict.get("LOL"));
//        List<String> results = searchByDefinition("Laugh Out");
//        if (!results.isEmpty()) {
//            for (String result : results) {
//                System.out.println(result);
//            }
//        } else {
//            System.out.println("No result");
//        }

    }

    public static boolean Add(String word, String definition) {
        boolean result = true;
        word = word.trim().replaceAll(" +", " ");
        definition = definition.trim().replaceAll(" +", " ");
        try {
            FileWriter fstream = new FileWriter(slangWordAddFilePath, true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(word + "`" + definition + "\n");
            out.close();

            if (deleteWords.contains(word)) {
                deleteWords.remove(word);
                overwriteDeleteFile();
            }
            if (updateWords.containsKey(word)) {
                updateWords.put(word, definition);
                overwriteUpdateFile();
            }
            getData();
        } catch (Exception e) {
            result = false;
            System.err.println("Error while writing to file: "
                    + e.getMessage());
        }
        return result;
    }

    public static int Delete(String word) {
        int result = 1; // delete success

        if (!slangWord.contains(word)) {
            // this word is not exist
            result = 0;
        } else {
            try {
                FileWriter fstream = new FileWriter(slangWordDeleteFilePath, true);
                BufferedWriter out = new BufferedWriter(fstream);
                out.write(word.trim().replaceAll(" +", " ") + "\n");
                out.close();
                getData();
            } catch (Exception e) {
                result = -1; //delete fail
                System.err.println("Error while writing to file: "
                        + e.getMessage());
            }
        }
        return result;
    }

    public static boolean Update(String word, String definition) {
        boolean result = true;
        word = word.trim().replaceAll(" +", " ");
        definition = definition.trim().replaceAll(" +", " ");
        try {
            FileWriter fstream = new FileWriter(slangWordUpdateFilePath, true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(word + "`" + definition + "\n");
            out.close();
        } catch (Exception e) {
            result = false;
            System.err.println("Error while writing to file: "
                    + e.getMessage());
        }
        getData();

        return result;
    }

    public static String searchBySlangword(String input) {
        String result = dict.get(input);
        return result;
    }

    public static String searchByDefinition(String input) {
        String result = "";

        String[] inputs = input.split(" ");
        List<List<Integer>> temp = new ArrayList<>();
        for (String word : inputs) {
            if (definitionSplit.containsKey(word)) {
                temp.add(definitionSplit.get(word));

            }
        }

        if (temp.isEmpty()) {
            result = "";
        } else if (temp.size() == 1) {
            for (Integer index : temp.get(0)) {
                String res = slangWord.get(index);
                res = res + " :" + dict.get(res) + "\n";
                result += res;
            }
        } else {
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
                    res = res + " :" + dict.get(res) + "\n";
                    result += res;
                }
            }
        }

//        System.out.println("-------------" + result);
        return result;
    }

    public static List<String> readDeleteFile() {
        List<String> deletedWords = new ArrayList<>();
        try {
            File file = new File(slangWordDeleteFilePath);    //creates a new file instance
            FileReader fr = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim().replaceAll(" +", " ");
                deletedWords.add(line);
            }
            fr.close();    //closes the stream and release the resources
        } catch (IOException e) {
            e.printStackTrace();
        }
        return deletedWords;
    }

    public static void getData() {
        slangWord.clear();
        definitionSplit.clear();
        dict.clear();
        int index = 0;
        deleteWords = readDeleteFile();

        try {
            File file = new File(slangWordFilePath);    //creates a new file instance
            FileReader fr = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim().replaceAll(" +", " ");

                String[] lineSplited = line.split("`");
                if (lineSplited.length == 2 && !deleteWords.contains(lineSplited[0])) {
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
        readUpdateFile(index);

    }

    static void readUpdateFile(int indexMark) {
        int index = indexMark;
        updateWords.clear();
        try {
            File file = new File(slangWordUpdateFilePath);    //creates a new file instance
            FileReader fr = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim().replaceAll(" +", " ");

                String[] lineSplited = line.split("`");
                updateWords.put(lineSplited[0], lineSplited[1]);

                if (lineSplited.length == 2 && !deleteWords.contains(lineSplited[0])) {
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

    public static boolean isExistWord(String word) {
        return slangWord.contains(word);
    }

    static void overwriteDeleteFile() throws IOException {
        File f = new File(slangWordDeleteFilePath);  //Creation of File Descriptor for output file
        FileWriter fw = new FileWriter(f); //Creation of File Writer object
        for (String wordDeleted : deleteWords) {
            fw.write(wordDeleted + "\n"); //Write Line by Line
        }
        fw.flush();
        fw.close();

    }

    static void overwriteUpdateFile() throws IOException {
        File f = new File(slangWordUpdateFilePath);  //Creation of File Descriptor for output file
        FileWriter fw = new FileWriter(f); //Creation of File Writer object
        Set<Map.Entry<String, String>> set = updateWords.entrySet();

        for (Map.Entry<String, String> me : set) {
            String lineWrite = me.getKey() + "`" + me.getValue() + "\n";
            fw.write(lineWrite);
        }
        fw.flush();
        fw.close();

    }

    public static String[] randomWord() {

        int min = 0;
        int max = slangWord.size();
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        int randomNumber = r.nextInt((max - min) + 1) + min;

        String key = slangWord.get(randomNumber);
        String value = dict.get(key);
        String[] result = {key, value};
        return result;
    }

    public static void ResetToOriginal() {
        try {
            File f = new File(slangWordUpdateFilePath);  //Creation of File Descriptor for output file
            FileWriter fw = new FileWriter(f); //Creation of File Writer object
            fw.write("");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File f = new File(slangWordDeleteFilePath);  //Creation of File Descriptor for output file
            FileWriter fw = new FileWriter(f); //Creation of File Writer object
            fw.write("");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File f = new File(slangWordAddFilePath);  //Creation of File Descriptor for output file
            FileWriter fw = new FileWriter(f); //Creation of File Writer object
            fw.write("");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        getData();
    }
}
