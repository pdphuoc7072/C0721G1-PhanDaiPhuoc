package bai_lam_them_2.util.read_and_write;

import bai_lam_them_2.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteForTruck {
    public static void writeTruckList (List<Truck> truckList, String path, boolean check) {
        List<String> stringList = new ArrayList<>();
        for (Truck truck : truckList) {
            stringList.add(truck.getStringToCSV());
        }
        ReadAndWrite.writeStringList(stringList, path, check);
    }
    public static List<Truck> readTruckList (String path) {
        List<Truck> truckList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readStringList(path);
        for (String string : stringList) {
            String[] array = string.split(",");
            Truck truck = new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4]));
            truckList.add(truck);
        }
        return truckList;
    }
}
