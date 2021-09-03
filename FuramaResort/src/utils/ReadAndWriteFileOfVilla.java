package utils;

import models.*;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteFileOfVilla {
    private static final String COMMA_DELIMITER = ",";
    public static Map<Villa, Integer> readFromFileOfVilla (String filePath) {
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
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
                villaList.put(new Villa(result[0], result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]), Integer.parseInt(result[4]),
                            new RentalType(result[5]), result[6], Double.parseDouble(result[7]), Integer.parseInt(result[8])), Integer.parseInt(result[9]));
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }
    public static void writeToFileOfVilla (String filePath, Map<Villa, Integer> villaList, boolean flag) {
        try {
            FileWriter fw = new FileWriter(filePath, flag);
            BufferedWriter bw = new BufferedWriter(fw);
            Set<Villa> setVilla = villaList.keySet();
            for (Villa villa : setVilla) {
                bw.append(villa.getIdOfService());
                bw.append(COMMA_DELIMITER);
                bw.append(villa.getNameOfService());
                bw.append(COMMA_DELIMITER);
                bw.append(((String.valueOf(villa.getUsableArea()))));
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(villa.getRentalCost()));
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(villa.getMaxNumberPeople()));
                bw.append(COMMA_DELIMITER);
                bw.append(villa.getRentalTye().getRentalType());
                bw.append(COMMA_DELIMITER);
                bw.append(villa.getRateRoom());
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(villa.getPoolArea()));
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(villa.getNumberFloor()));
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(villaList.get(villa)));
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
