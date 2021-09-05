package utils;

import models.Booking;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteFileOfBooking {
    private static final String COMMA_DELIMITER = ",";
    public static Set<Booking> readBookingFromFile (String filePath) {
        Set<Booking> bookingList = new TreeSet<>();
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
                bookingList.add(booking);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingList;
    }
    public static void writeBookingToFile (String filePath, Set<Booking> bookingList, boolean flag) {
        try {
            FileWriter fw = new FileWriter(filePath, flag);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Booking booking : bookingList) {
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
