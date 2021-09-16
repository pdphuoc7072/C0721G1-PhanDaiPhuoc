package bai_lam_them_2.util;

import bai_lam_them_2.model.Bike;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteForBike {
    public static void writeBikeList (List<Bike> bikeList, String path, boolean check) {
        List<String> stringList = new ArrayList<>();
        for (Bike bike : bikeList) {
            stringList.add(bike.getStringToCSV());
        }
        ReadAndWrite.writeStringList(stringList, path, check);
    }
    public static List<Bike> readBikeList (String path) {
        List<Bike> bikeList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readStringList(path);
        for (String string : stringList) {
            String[] array = string.split(",");
            Bike bike = new Bike(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
            bikeList.add(bike);
        }
        return bikeList;
    }
}
