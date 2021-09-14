package bai_tap_huong_doi_tuong.bai_4.util;

import bai_tap_huong_doi_tuong.bai_4.model.Cadres;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static void writeStringList (List<String> stringList, String path, boolean check) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file, check);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeCadresList (List<Cadres> cadresList, String path, boolean check) {
        List<String> stringList = new ArrayList<>();
        for (Cadres cadres : cadresList) {
            stringList.add(cadres.getString());
        }
        writeStringList(stringList, path, check);
    }
    private static List<String> readStringList (String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Cadres> readCadresList (String path) {
        List<String> stringList = readStringList(path);
        List<Cadres> cadresList = new ArrayList<>();
        for (String string : stringList) {
            String[] array = string.split(",");
            Cadres cadres = new Cadres(array[0], array[1], array[2], array[3], array[4], array[5], array[6],
                                       Double.parseDouble(array[7]), Double.parseDouble(array[8]), Double.parseDouble(array[9]));
            cadresList.add(cadres);
        }
        return cadresList;
    }
}
