package bai_lam_them_2.util;

import bai_lam_them_2.model.Manufacturer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadManufacturerFile {
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
    public static List<Manufacturer> readManufacturerList (String path) {
        List<Manufacturer> manufacturerList = new ArrayList<>();
        List<String> stringList = readStringList(path);
        for (String string : stringList) {
            String[] array = string.split(",");
            Manufacturer manufacturer = new Manufacturer(array[0], array[1], array[2]);
            manufacturerList.add(manufacturer);
        }
        return manufacturerList;
    }
}
