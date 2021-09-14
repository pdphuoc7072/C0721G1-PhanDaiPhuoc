package bai_tap_huong_doi_tuong.bai_4.controller;

import bai_tap_huong_doi_tuong.bai_4.service.CadresManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadresManager cadresManager = new CadresManager();
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        while (true) {
            try {
                do {
                    System.out.println("Menu");
                    System.out.println("1. Thêm cán bộ");
                    System.out.println("2. Hiển thị danh sách cán bộ");
                    System.out.println("3. Đếm số cán bộ nữ trong cơ quan");
                    System.out.println("4. Tính tổng lương của cán bộ trong cơ quan");
                    System.out.println("5. Liệt kê các cán bộ có chuyên môn “Công nghệ thông tin“ hiện có trong danh sách");
                    System.out.println("0. Thoát");
                    System.out.print("Hãy chọn chức năng: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            cadresManager.add();
                            break;
                        case 2:
                            cadresManager.display();
                            break;
                        case 3:
                            cadresManager.countFemale();
                            break;
                        case 4:
                            cadresManager.calculateTotalSalary();
                            break;
                        case 5:
                            cadresManager.displayCadresIsInformationTechnology();
                            break;
                        case 0:
                            System.exit(0);
                        default:
                            System.out.println("Lỗi. Hãy nhập lại.");
                    }
                } while (choose!= 0);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
