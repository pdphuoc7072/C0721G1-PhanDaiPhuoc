package utils;

import models.Booking;
import models.Contract;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteFileOfContract {
    private static final String COMMA_DELIMITER = ",";
    public static Set<Contract> readContractFromFile (String filePath) {
        Set<Contract> contractList = new TreeSet<>();
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
                Contract contract = new Contract(result[0], result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]), result[4]);
                contractList.add(contract);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contractList;
    }
    public static void writeContractToFile (String filePath, Set<Contract> contractList, boolean flag) {
        try {
            FileWriter fw = new FileWriter(filePath, flag);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Contract contract : contractList) {
                bw.append(contract.getNumberOfContract());
                bw.append(COMMA_DELIMITER);
                bw.append(contract.getIdOfBooking());
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(contract.getPreDeposit()));
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(contract.getTotalPayment()));
                bw.append(COMMA_DELIMITER);
                bw.append(contract.getIdOfCustomer());
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
