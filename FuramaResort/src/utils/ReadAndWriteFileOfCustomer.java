package utils;

import models.AddressOfCustomer;
import models.Customer;
import models.CustomerType;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteFileOfCustomer {
    private static final String COMMA_DELIMITER = ",";
    public static List<Customer>  readCustomerFromFile (String filePath) {
        List<Customer> customerList = new LinkedList<>();
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
                Customer customer = new Customer(result[0], result[1], result[2], result[3], result[4], result[5], result[6],
                        new CustomerType(result[7]), new AddressOfCustomer(result[8], result[9], result[10], result[11], result[12]));
                customerList.add(customer);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
    public static void writeCustomerToFile (String filePath, List<Customer> customerList, boolean flag) {
        try {
            FileWriter fw = new FileWriter(filePath, flag);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Customer customer : customerList) {
                bw.append(customer.getFullName());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getBirthday());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getGender());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getIdCardNumber());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getPhoneNumber());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getEmail());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getIdOfCustomer());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getCustomerType().getCustomerType());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getAddressOfCustomer().getHouseNumber());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getAddressOfCustomer().getStreet());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getAddressOfCustomer().getWard());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getAddressOfCustomer().getDistrict());
                bw.append(COMMA_DELIMITER);
                bw.append(customer.getAddressOfCustomer().getProvince());
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
