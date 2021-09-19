package bai_lam_them_3.controller;

import bai_lam_them_3.model.Customer;
import bai_lam_them_3.service.impl.CustomerServiceImpl;
import bai_lam_them_3.service.impl.ElectricBillServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        ElectricBillServiceImpl electricBillService = new ElectricBillServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        while (true) {
            try {
                do {
                    System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN");
                    System.out.println("\tChọn chức năng:");
                    System.out.println("\t1. Thêm mới khách hàng");
                    System.out.println("\t2. Hiển thị thông tin khách hàng");
                    System.out.println("\t3. Tìm kiếm khách hàng");
                    System.out.println("\t4. Thêm mới hóa đơn");
                    System.out.println("\t5. Chỉnh sửa hóa đơn");
                    System.out.println("\t6. Hiển thị thông tin chi tiết hóa đơn");
                    System.out.println("\t7. Thoát");
                    System.out.print("Hãy chọn chức năng: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            customerService.add();
                            break;
                        case 2:
                            customerService.display();
                            break;
                        case 3:
                            customerService.searchByName();
                            break;
                        case 4:
                            electricBillService.add();
                            break;
                        case 5:
                            electricBillService.edit();
                            break;
                        case 6:
                            electricBillService.display();
                            break;
                        case 7:
                            System.exit(7);
                            break;
                        default:
                            throw new Exception("Lỗi. Hãy nhập lại.");
                    }
                } while (choose != 7);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
