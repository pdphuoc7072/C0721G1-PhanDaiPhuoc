package ss17_io_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static final String COMMA_DELIMITER = ",";

    public static void writeToFile (String filePath, List<Product> listProduct, boolean check) {
        try {
            FileWriter fw = new FileWriter(filePath, check);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product product : listProduct) {
                bw.append(String.valueOf(product.getIdOfProduct()));
                bw.append(COMMA_DELIMITER);
                bw.append(product.getNameOfProduct());
                bw.append(COMMA_DELIMITER);
                bw.append(product.getManufacturerOfProduct());
                bw.append(COMMA_DELIMITER);
                bw.append(String.valueOf(product.getPriceOfProduct()));
                bw.append(COMMA_DELIMITER);
                bw.append(product.getOtherDescription());
                bw.newLine();
            }
            bw.flush();
            fw.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readFromFile (String filePath) {
        List<Product> listProduct = new ArrayList<>();
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
                Product product = new Product((Integer.parseInt(result[0])), result[1], result[2], Double.parseDouble(result[3]), result[4]);
                listProduct.add(product);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listProduct;
    }
}
