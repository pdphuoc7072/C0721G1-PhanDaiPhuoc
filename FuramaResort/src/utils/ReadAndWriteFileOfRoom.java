package utils;

import models.FreeServiceIncluded;
import models.House;
import models.RentalType;
import models.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteFileOfRoom {
    private static final String COMMA_DELIMITER = ",";
    public static Map<Room, Integer> readFromFileOfRoom (String filePath) {
        Map<Room, Integer> roomList = new LinkedHashMap<>();
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
                roomList.put(new Room(result[0], result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]), Integer.parseInt(result[4]),
                        new RentalType(result[5]), new FreeServiceIncluded(result[6])), Integer.parseInt(result[7]));
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }
    public static void writeToFileOfRoom (String filePath, Map<Room, Integer> roomList, boolean flag) {
        try {
            FileWriter fw = new FileWriter(filePath, flag);
            BufferedWriter bw = new BufferedWriter(fw);
            Set<Room> setRoom = roomList.keySet();
            for (Room room : setRoom) {
                bw.append(room.getIdOfService());
                bw.append(COMMA_DELIMITER);
                bw.append(room.getNameOfService());
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(room.getUsableArea()));
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(room.getRentalCost()));
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(room.getMaxNumberPeople()));
                bw.append(COMMA_DELIMITER);
                bw.append(room.getRentalTye().getRentalType());
                bw.append(COMMA_DELIMITER);
                bw.append(room.getFreeServiceIncluded().getNameOfFreeService());
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(roomList.get(room)));
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
