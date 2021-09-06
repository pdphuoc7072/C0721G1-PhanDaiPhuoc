package bai_jame_mo_rong_6_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Menu: ");
            System.out.println("\t1. Thêm");
            System.out.println("\t2. Hiển thị");
            System.out.println("\t0. Exit");
            System.out.print("Hãy chọn từ menu: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    StudentManager.add();
                    break;
                case 2:
                    StudentManager.display();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("Lỗi. Hãy nhập lại.\n");
            }
        } while (choice != 0);
    }
}
