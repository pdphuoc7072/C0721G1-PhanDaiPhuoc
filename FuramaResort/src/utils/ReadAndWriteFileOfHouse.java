package utils;

import models.*;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteFileOfHouse {
    private static final String COMMA_DELIMITER = ",";
    public static Map<House, Integer> readFromFileOfHouse (String filePath) {
        Map<House, Integer> houseList = new LinkedHashMap<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] result;
            while ((line = br.readLine()) != null) {
                result = line.split(COMMA_DELIMITER);
                houseList.put(new House(result[0], result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]), Integer.parseInt(result[4]),
                            new RentalType(result[5]), result[6], Integer.parseInt(result[7])), Integer.parseInt(result[8]));
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }
    public static void writeToFileOfHouse (String filePath, Map<House, Integer> houseList, boolean flag) {
        try {
            FileWriter fw = new FileWriter(filePath, flag);
            BufferedWriter bw = new BufferedWriter(fw);
            Set<House> setHouse = houseList.keySet();
            for (House house : setHouse) {
                bw.append(house.getIdOfService());
                bw.append(COMMA_DELIMITER);
                bw.append(house.getNameOfService());
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(house.getUsableArea()));
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(house.getRentalCost()));
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(house.getMaxNumberPeople()));
                bw.append(COMMA_DELIMITER);
                bw.append(house.getRentalTye().getRentalType());
                bw.append(COMMA_DELIMITER);
                bw.append(house.getRateRoom());
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(house.getNumberFloor()));
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(houseList.get(house)));
                bw.newLine();
            }
            bw.flush();
            fw.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
