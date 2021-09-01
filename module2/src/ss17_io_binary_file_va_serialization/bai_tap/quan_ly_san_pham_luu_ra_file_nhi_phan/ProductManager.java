package ss17_io_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static String filePath = "D:/C0721G1_Phan_Dai_Phuoc/module2/src/ss17_io_binary_file_va_serialization/bai_tap/quan_ly_san_pham_luu_ra_file_nhi_phan/list_product.csv";
    static Scanner scanner = new Scanner(System.in);

    public static void addList() {
        List<Product> listProduct = ReadAndWriteFile.readFromFile(filePath);
        boolean check = true;
        System.out.print("Hãy nhập vào Id của sản phẩm: ");
        int idOfProduct = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdOfProduct() == idOfProduct) {
                check = false;
                System.out.println("Lỗi do Id này đã tồn tại trong danh sách.");
                break;
            }
        }
        if (check) {
            listProduct.clear();
            System.out.print("Hãy nhập vào tên của sản phẩm: ");
            String nameOfProduct = scanner.nextLine();
            System.out.print("Hãy nhập vào hãng sản xuất của sản phẩm: ");
            String manufacturerOfProductOfProduct = scanner.nextLine();
            System.out.print("Hãy nhập vào giá của sản phẩm (USD): ");
            double priceOfProduct = Double.parseDouble(scanner.nextLine());
            System.out.print("Hãy nhập vào các mô tả khác của sản phẩm: ");
            String otherDescriptionOfProduct = scanner.nextLine();
            listProduct.add(new Product(idOfProduct, nameOfProduct, manufacturerOfProductOfProduct, priceOfProduct, otherDescriptionOfProduct));
            Collections.sort(listProduct);
            ReadAndWriteFile.writeToFile(filePath, listProduct, true);
        }
    }

    public static void displayList () {
        List<Product> listProduct = ReadAndWriteFile.readFromFile(filePath);
        Collections.sort(listProduct);
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }
    public static void editProduct () {
        List<Product> listProduct = ReadAndWriteFile.readFromFile(filePath);
        System.out.print("Hãy nhập Id của sản phẩm mà bạn cần sửa: ");
        boolean check = false;
        int idOfProductForEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdOfProduct() == idOfProductForEdit) {
                check = true;
                System.out.println("Bạn cần sửa gì?");
                System.out.println("1. Sửa tên của sản phẩm");
                System.out.println("2. Sửa hãng sản xuất của sản phẩm");
                System.out.println("3. Sửa giá của sản phẩm");
                System.out.println("4. Sửa các mô tả khác của sản phẩm");
                System.out.println("0. Quay lại menu chính");
                System.out.print("Bạn hãy chọn từ 0 đến 4: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Hãy nhập vào tên mới: ");
                        String newNameOfProduct = scanner.nextLine();
                        listProduct.get(i).setNameOfProduct(newNameOfProduct);
                        ReadAndWriteFile.writeToFile(filePath, listProduct, false);
                        break;
                    case 2:
                        System.out.print("Hãy nhập vào hãng sản xuất mới: ");
                        String newManufacturerOfProduct = scanner.nextLine();
                        listProduct.get(i).setManufacturerOfProduct(newManufacturerOfProduct);
                        ReadAndWriteFile.writeToFile(filePath, listProduct, false);
                        break;
                    case 3:
                        System.out.print("Hãy nhập vào giá mới: ");
                        double newPriceOfProduct = Double.parseDouble(scanner.nextLine());
                        listProduct.get(i).setPriceOfProduct(newPriceOfProduct);
                        ReadAndWriteFile.writeToFile(filePath, listProduct, false);
                        break;
                    case 4:
                        System.out.print("Hãy nhập vào các mô tả mới: ");
                        String newDescriptionOfProduct = scanner.nextLine();
                        listProduct.get(i).setOtherDescription(newDescriptionOfProduct);
                        ReadAndWriteFile.writeToFile(filePath, listProduct, false);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Lỗi do nhập sai.");
                }
                break;
            }
        }
        if (!check) {
            System.out.println("Id mà bạn nhập không tồn tại trong danh sách.");
        }
    }
    public static void deleteProduct () {
        List<Product> listProduct = ReadAndWriteFile.readFromFile(filePath);
        System.out.print("Hãy nhập vào Id của sản phẩm cần xóa: ");
        int idOfProductForDelete = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdOfProduct() == idOfProductForDelete) {
                check = true;
                listProduct.remove(i);
                Collections.sort(listProduct);
                ReadAndWriteFile.writeToFile(filePath, listProduct, false);
                break;
            }
        }
        if (!check) {
            System.out.println("Id mà bạn nhập không tồn tại trong danh sách.");
        }
    }
    public static void sortAscendingForPrice () {
        List<Product> listProduct = ReadAndWriteFile.readFromFile(filePath);
        Collections.sort(listProduct, new SortAscendingForPriceOfProduct());
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }
    public static void sortDescendingForPrice () {
        List<Product> listProduct = ReadAndWriteFile.readFromFile(filePath);
        Collections.sort(listProduct, new SortDescendingForPriceOfProduct());
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }
}
