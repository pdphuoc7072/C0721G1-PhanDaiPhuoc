package bai_jame_mo_rong_30_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Menu: \n");
            System.out.print("\t1. Thêm sinh viên\n");
            System.out.print("\t2. Hiển thị sinh viên\n");
            System.out.print("\t3. Hiển thị sinh viên theo sắp xếp tăng dần theo tên\n");
            System.out.print("\t0. Exit\n");
            System.out.print("Hãy chọn từ menu: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    StudentManager.addStudent();
                    break;
                case 2:
                    StudentManager.displayListStudent ();
                    break;
                case 3:
                    StudentManager.sortNameOfStudent();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("Lỗi. Hãy nhập lại.\n");
            }
        } while (choice != 0);
    }
}
