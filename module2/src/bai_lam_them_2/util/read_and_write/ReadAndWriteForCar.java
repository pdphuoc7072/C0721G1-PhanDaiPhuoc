package bai_lam_them_2.util.read_and_write;

import bai_lam_them_2.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteForCar {
    public static void writeCarList (List<Car> carList, String path, boolean check) {
        List<String> stringList = new ArrayList<>();
        for (Car car : carList) {
            stringList.add(car.getStringToCSV());
        }
        ReadAndWrite.writeStringList(stringList, path, check);
    }
    public static List<Car> readCarList (String path) {
        List<Car> carList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readStringList(path);
        for (String string : stringList) {
            String[] array = string.split(",");
            Car car = new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
            carList.add(car);
        }
        return carList;
    }
}
