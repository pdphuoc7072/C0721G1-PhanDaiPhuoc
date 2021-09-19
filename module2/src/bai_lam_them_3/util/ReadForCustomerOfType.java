package bai_lam_them_3.util;

import bai_lam_them_3.model.CustomerOfType;

import java.util.ArrayList;
import java.util.List;

public class ReadForCustomerOfType {
    public static List<CustomerOfType> readForCustomerOfTypeList (String path) {
        List<CustomerOfType> customerOfTypeList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readStringList(path);
        for (String string : stringList) {
            String[] array = string.split(",");
            CustomerOfType customerOfType = new CustomerOfType(array[0], array[1]);
            customerOfTypeList.add(customerOfType);
        }
        return customerOfTypeList;
    }
}
