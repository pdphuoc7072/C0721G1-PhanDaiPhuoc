package ss17_io_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static String filePath = "D:/C0721G1_Phan_Dai_Phuoc/module2/src/ss17_io_binary_file_va_serialization/bai_tap/quan_ly_san_pham_luu_ra_file_nhi_phan/list_product.csv";

    public static void addList() {
        Scanner scanner = new Scanner(System.in);
        List<Product> listOfProduct = new ArrayList<>();
        System.out.print("Hãy nhập vào Id của sản phẩm: ");
        int idOfProduct = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập vào tên của sản phẩm: ");
        String nameOfProduct = scanner.nextLine();
        System.out.print("Hãy nhập vào hãng sản xuất của sản phẩm: ");
        String manufacturerOfProductOfProduct = scanner.nextLine();
        System.out.print("Hãy nhập vào giá của sản phẩm (USD): ");
        double priceOfProduct = Double.parseDouble(scanner.nextLine());
        System.out.print("Hãy nhập vào các mô tả khác của sản phẩm: ");
        String otherDescriptionOfProduct = scanner.nextLine();
        listOfProduct.add(new Product(idOfProduct, nameOfProduct, manufacturerOfProductOfProduct, priceOfProduct, otherDescriptionOfProduct));
        ReadAndWriteFile.writeToFile(filePath, listOfProduct);
    }

    public static void displayList () {
        List<Product> listProduct = ReadAndWriteFile.readFromFile(filePath);
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }

    }
}
