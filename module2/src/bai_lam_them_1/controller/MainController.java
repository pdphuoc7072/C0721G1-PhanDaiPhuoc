package bai_lam_them_1.controller;

import bai_lam_them_1.service.impl.ContactServiceImpl;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        ContactServiceImpl contactService = new ContactServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        while (true) {
            try {
                do {
                    System.out.println("Menu");
                    System.out.println("1. Thêm danh bạ");
                    System.out.println("2. Hiển thị danh bạ");
                    System.out.println("3. Sửa danh bạ");
                    System.out.println("4. Xóa danh bạ");
                    System.out.println("5. Tìm theo tên");
                    System.out.println("6. Tìm theo số điện thoại");
                    System.out.println("0. Exit");
                    System.out.print("Hãy chọn chức năng: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            contactService.add();
                            break;
                        case 2:
                            contactService.display();
                            break;
                        case 3:
                            contactService.edit();
                            break;
                        case 4:
                            contactService.delete();
                            break;
                        case 5:
                            contactService.searchByName();
                            break;
                        case 6:
                            contactService.searchByNumberPhone();
                            break;
                        case 0:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Lỗi. Hãy nhập lại");
                            break;
                    }
                } while (choose != 0);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
