package bai_lam_them_3.util;

import bai_lam_them_3.model.ElectricBill;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteForElectricBill {
    public static void writeElectricBillList(List<ElectricBill> electricBillList, String path, boolean check) {
        List<String> stringList = new ArrayList<>();
        for (ElectricBill electricBill : electricBillList) {
            stringList.add(electricBill.getStringToCSV());
        }
        ReadAndWrite.writeStringList(stringList, path, check);
    }

    public static List<ElectricBill> readElectricBillList(String path) {
        List<ElectricBill> electricBillList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readStringList(path);
        for (String string : stringList) {
            String[] array = string.split(",");
            ElectricBill electricBill = new ElectricBill(array[0], array[1], array[2], Integer.parseInt(array[3]), Double.parseDouble(array[4]), Double.parseDouble(array[5]));
            electricBillList.add(electricBill);
        }
        return electricBillList;
    }
}
