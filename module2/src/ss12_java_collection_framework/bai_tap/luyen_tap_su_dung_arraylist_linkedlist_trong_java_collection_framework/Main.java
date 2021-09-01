package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Menu: \n");
            System.out.print("\t1. Thêm sản phẩm\n");
            System.out.print("\t2. Xóa sản phẩm\n");
            System.out.print("\t3. Sửa sản phẩm\n");
            System.out.print("\t4. Tìm kiếm sản phẩm\n");
            System.out.print("\t5. Sắp xếp sản phẩm theo giá\n");
            System.out.print("\t6. Hiển thị sản phẩm\n");
            System.out.print("\t0. Exit\n");
            System.out.print("Hãy chọn từ menu: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductManager.addProduct();
                    break;
                case 2:
                    ProductManager.deleteProduct();
                    break;
                case 3:
                    ProductManager.editProduct();
                    break;
                case 4:
                    ProductManager.searchProduct();
                    break;
                case 5:
                    System.out.print("\t1. Sắp xếp theo giá tăng dần\n");
                    System.out.print("\t2. Sắp xếp theo giá giảm dần\n");
                    System.out.print("Hãy chọn 1 hoặc 2: ");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                            ProductManager.sortAscendingForPriceOfProduct();
                            break;
                        case 2:
                            ProductManager.sortDescendingForPriceOfProduct();
                            break;
                    }
                    break;
                case 6:
                    ProductManager.displayProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
