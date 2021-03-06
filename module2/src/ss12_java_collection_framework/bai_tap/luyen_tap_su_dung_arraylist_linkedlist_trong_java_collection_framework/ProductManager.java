package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> listProduct = new ArrayList<Product>();

    static {
        listProduct.add(new Product(1, "Iphone 12 Pro", 800));
        listProduct.add(new Product(2, "Samsung Galaxy Z", 1000));
        listProduct.add(new Product(3, "Oppo A71", 400));
        listProduct.add(new Product(4, "Xiaomi Poco", 600));
    }
    public static void addProduct () {
        System.out.print("Hãy nhập id: ");
        int idOfNewProduct = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập tên: ");
        String nameOfNewProduct = scanner.nextLine();
        System.out.print("Hãy nhập giá: ");
        boolean check = true;
        double priceOfNewProduct = Double.parseDouble(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdOfProduct() == idOfNewProduct || idOfNewProduct == 0) {
                System.out.print("Lỗi do id mà bạn đã nhập đã tồn tại trong danh sách, hoặc bằng 0. \n");
                check = false;
                break;
            }
        }
        if (check) {
            listProduct.add(new Product(idOfNewProduct, nameOfNewProduct, priceOfNewProduct));
        }
    }
    public static void displayProduct () {
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }
    public static void editProduct () {
        System.out.print("Hãy nhập id của sản phẩm cần sửa: ");
        int idOfProductToEdit = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdOfProduct() == idOfProductToEdit) {
                check = true;
                System.out.print("\t1. Sửa tên sản phẩm \n");
                System.out.print("\t2. Sửa giá sản phẩm \n");
                System.out.print("Bạn muốn sửa loại gì? ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Hãy nhập tên mới: ");
                        String newNameOfProduct = scanner.nextLine();
                        listProduct.get(i).setNameOfProduct(newNameOfProduct);
                        break;
                    case 2:
                        System.out.print("Hãy nhập giá mới: ");
                        int newPriceOfProduct = Integer.parseInt(scanner.nextLine());
                        listProduct.get(i).setPriceOfProduct(newPriceOfProduct);
                        break;
                    default:
                        System.out.print("Bạn nhập lỗi. Hãy nhập lại");
                }
                break;
            }
        }
        if (!check) {
            System.out.print("Id mà bạn đã nhập không có trong danh sách. \n");
        }
    }
    public static void deleteProduct () {
        System.out.print("Hãy nhập id của sản phẩm cần xóa: ");
        int idOfProductToDelete = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdOfProduct() == idOfProductToDelete) {
                listProduct.remove(i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.print("Id mà bạn đã nhập không có trong danh sách. \n");
        }
    }
    public static void searchProduct () {
        System.out.print("Hãy nhập tên của sản phẩm cần tìm: ");
        String nameOfProductToSearch = scanner.nextLine();
        boolean check = false;
        for (Product product : listProduct) {
            if (product.getNameOfProduct().equals(nameOfProductToSearch)) {
                System.out.println(product.toString());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy trong danh sách tên sản phẩm cần tìm ");
        }
    }
    public static void sortAscendingForPriceOfProduct() {
        Collections.sort(listProduct, new SortAscendingForPriceOfProduct());
        displayProduct();
    }
    public static void sortDescendingForPriceOfProduct() {
        Collections.sort(listProduct, new SortDescendingForPriceOfProduct());
        displayProduct();
    }
}
