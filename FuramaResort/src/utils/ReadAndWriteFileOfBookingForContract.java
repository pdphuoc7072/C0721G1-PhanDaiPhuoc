package utils;

import models.Booking;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class ReadAndWriteFileOfBookingForContract {
    private static final String COMMA_DELIMITER = ",";
    public static Queue<Booking> readBookingForContractFromFile (String filePath) {
        Queue<Booking> bookingForContractList = new LinkedList<>();
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
                Booking booking = new Booking(result[0], result[1], result[2], result[3], result[4], result[5]);
                bookingForContractList.add(booking);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingForContractList;
    }
    public static void writeBookingForContractToFile (String filePath, Queue<Booking> bookingForContractList, boolean flag) {
        try {
            FileWriter fw = new FileWriter(filePath, flag);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Booking booking : bookingForContractList) {
                bw.append(booking.getIdOfBooking());
                bw.append(COMMA_DELIMITER);
                bw.append(booking.getStartDate());
                bw.append(COMMA_DELIMITER);
                bw.append(booking.getEndDate());
                bw.append(COMMA_DELIMITER);
                bw.append(booking.getIdOfCustomer());
                bw.append(COMMA_DELIMITER);
                bw.append(booking.getNameOfService());
                bw.append(COMMA_DELIMITER);
                bw.append(booking.getIdOfService());
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
