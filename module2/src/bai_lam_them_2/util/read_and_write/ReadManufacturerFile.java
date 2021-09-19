package bai_lam_them_2.util.read_and_write;

import bai_lam_them_2.model.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class ReadManufacturerFile {
    public static List<Manufacturer> readManufacturerList (String path) {
        List<Manufacturer> manufacturerList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readStringList(path);
        for (String string : stringList) {
            String[] array = string.split(",");
            Manufacturer manufacturer = new Manufacturer(array[0], array[1], array[2]);
            manufacturerList.add(manufacturer);
        }
        return manufacturerList;
    }
}
