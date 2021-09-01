package ss17_io_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Thêm sản phẩm vào danh sách");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Chỉnh sửa sản phẩm trong danh sách");
            System.out.println("4. Xóa sản phẩm trong danh sách");
            System.out.println("5. Sắp xếp sản phẩm theo giá");
            System.out.println("0. Exit");
            System.out.print("Bạn hãy chon: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductManager.addList();
                    break;
                case 2:
                    ProductManager.displayList();
                    break;
                case 3:
                    ProductManager.editProduct();
                    break;
                case 4:
                    ProductManager.deleteProduct();
                    break;
                case 5:
                    System.out.println("1. Sắp xếp theo giá tăng dần");
                    System.out.println("2. Sắp xếp theo giá giảm dần");
                    System.out.print("Hãy chọn 1 hoặc 2: ");
                    int choice5 = Integer.parseInt(scanner.nextLine());
                    switch (choice5) {
                        case 1:
                            ProductManager.sortAscendingForPrice();
                            break;
                        case 2:
                            ProductManager.sortDescendingForPrice();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Lỗi.");
                    }
                    break;
                case 0:
                    System.exit(0);
            }

        } while (choice != 0);

    }
}
