package bai_lam_them_2.controller;

import bai_lam_them_2.service.impl.TransportationServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransportationServiceImpl transportationService = new TransportationServiceImpl();
        int choose = -1;
        while (true) {
            try {
                do {
                    System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
                    System.out.println("\tChọn chức năng:");
                    System.out.println("\t1. Thêm mới phương tiện");
                    System.out.println("\t2. Hiển thị phương tiện");
                    System.out.println("\t3. Xóa phương tiện");
                    System.out.println("\t4. Thoát");
                    System.out.print("Hãy chọn chức năng: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            transportationService.add();
                            break;
                        case 2:
                            transportationService.display();
                            break;
                        case 3:
                            transportationService.delete();
                            break;
                        case 4:
                            System.exit(4);
                            break;
                        default:
                            throw new Exception("Lỗi. Hãy nhập lại.");
                    }
                } while (choose != 4);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
