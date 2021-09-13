package demo_product_manager.util;

import demo_product_manager.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWirteCSV {
    private static void writeListStringToCSV(List<String> stringList, String path, boolean append){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line: stringList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi  ghi file");
        }
    }
    public static void writeListProductToCSV(List<Product> productList, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Product product : productList){
            stringList.add(product.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }
    private static List<String> readCSV(String path){
        File file = new File(path);
        List<String> listString = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                listString.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi đọc  file");
        }
        return listString;
    }
    public static List<Product> getListProductFromCSV(String path){
        List<Product> productList =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Product product = new Product(Integer.parseInt(array[0]),array[1],Double.parseDouble(array[2]));
            productList.add(product);
        }
        return productList;
    }

    // ĐỌC NGHI FILE 1O ĐỐ TƯƠNG
    // CUSTOEMR
}
