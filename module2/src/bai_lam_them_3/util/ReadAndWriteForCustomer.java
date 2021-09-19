package bai_lam_them_3.util;

import bai_lam_them_3.model.Customer;
import bai_lam_them_3.model.CustomerForeigner;
import bai_lam_them_3.model.CustomerVietNam;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteForCustomer {
    public static void writeCustomerList (List<Customer> customerList, String path, boolean check) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getStringToCSV());
        }
        ReadAndWrite.writeStringList(stringList, path, check);
    }
//    public static List<CustomerVietNam> readCustomerVietNamList (String path) {
//        List<CustomerVietNam> customerVietNamList = new ArrayList<>();
//        List<String> stringList = ReadAndWrite.readStringList(path);
//        for (String string : stringList) {
//            String[] array = string.split(",");
//            if (array.length == 4) {
//                CustomerVietNam customerVietNam = new CustomerVietNam(array[0], array[1], array[2], Integer.parseInt(array[3]));
//                customerVietNamList.add(customerVietNam);
//            }
//        }
//        return customerVietNamList;
//    }
//    public static void writeCustomerForeignerList (List<CustomerForeigner> customerForeignerList, String path, boolean check) {
//        List<String> stringList = new ArrayList<>();
//        for (CustomerForeigner customerForeigner : customerForeignerList) {
//            stringList.add(customerForeigner.getStringToCSV());
//        }
//        ReadAndWrite.writeStringList(stringList, path, check);
//    }
    public static List<Customer> readCustomerList (String path) {
        List<Customer> customerList = new ArrayList<>();

        List<String> stringList = ReadAndWrite.readStringList(path);

        for (String string : stringList) {
            String[] array = string.split(",");
            if (array.length == 3) {

                CustomerForeigner customerForeigner = new CustomerForeigner(array[0], array[1], array[2]);
                customerList.add(customerForeigner);
            } else if (array.length == 4) {

                CustomerVietNam customerVietNam = new CustomerVietNam(array[0], array[1], array[2], Integer.parseInt(array[3]));
                customerList.add(customerVietNam);
            }
        }
        return customerList;

    }
}
