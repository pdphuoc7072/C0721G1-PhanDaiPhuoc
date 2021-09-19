package bai_lam_them_3.service.impl;

import bai_lam_them_3.model.Customer;
import bai_lam_them_3.model.CustomerForeigner;
import bai_lam_them_3.model.CustomerOfType;
import bai_lam_them_3.model.CustomerVietNam;
import bai_lam_them_3.service.ICustomerService;
import bai_lam_them_3.service.IService;
import bai_lam_them_3.util.ReadAndWriteForCustomer;
import bai_lam_them_3.util.ReadForCustomerOfType;
import bai_lam_them_3.util.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {

    final String CUSTOMER_TYPE_PATH = "src\\bai_lam_them_3\\data\\loaiKhach.csv";
    final String CUSTOMER_PATH = "src\\bai_lam_them_3\\data\\khachHang.csv";
    Regex regex = new Regex();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customerList = ReadAndWriteForCustomer.readCustomerList(CUSTOMER_PATH);

        while (true) {
            try {
                System.out.println("1. Thêm khách hàng Việt Nam");
                System.out.println("2. Thêm khách hàng nước ngoài");
                System.out.print("Bạn muốn chọn gì: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        String idOfCustomerVietNam;
                        boolean isValidOfIdOfCustomerVietNam;
                        do {
                            System.out.print("Hãy nhập mã khách hàng: ");
                            idOfCustomerVietNam = scanner.nextLine();
                            isValidOfIdOfCustomerVietNam = regex.validateOfIDCustomerVietNam(idOfCustomerVietNam);
                            if (!isValidOfIdOfCustomerVietNam) {
                                System.out.println("Lỗi. ID phải đúng định dạng. Hãy nhập lại.");
                            }
                        } while (!isValidOfIdOfCustomerVietNam);

                        System.out.print("Hãy nhập họ tên: ");
                        String fullNameOfCustomerVietNam = scanner.nextLine();

                        String customerOfType;
                        while (true) {
                            try {
                                List<CustomerOfType> customerOfTypeList = ReadForCustomerOfType.readForCustomerOfTypeList(CUSTOMER_TYPE_PATH);
                                for (int i = 0; i < customerOfTypeList.size(); i++) {
                                    System.out.println((i + 1) + ". " + customerOfTypeList.get(i).toString());
                                }
                                System.out.print("Bạn muốn chọn gì: ");
                                int chooseForCustomerOfType = Integer.parseInt(scanner.nextLine());
                                if (chooseForCustomerOfType > customerOfTypeList.size() || chooseForCustomerOfType <= 0) {
                                    throw new Exception("Lỗi. Hãy nhập lại.");
                                }
                                customerOfType = customerOfTypeList.get(chooseForCustomerOfType - 1).getCustomerOfType();
                                System.out.println("Bạn đã chọn: " + customerOfType);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        int consumption;
                        while (true) {
                            try {
                                System.out.print("Hãy nhập định mức tiêu thụ: ");
                                consumption = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        CustomerVietNam customerVietNam = new CustomerVietNam(idOfCustomerVietNam, fullNameOfCustomerVietNam, customerOfType, consumption);
                        customerList.add(customerVietNam);
                        ReadAndWriteForCustomer.writeCustomerList(customerList, CUSTOMER_PATH, false);
                        break;
                    case 2:
                        String idOfCustomerForeigner;
                        boolean isValidOfIdOfCustomerForeigner;
                        do {
                            System.out.print("Hãy nhập mã khách hàng: ");
                            idOfCustomerForeigner = scanner.nextLine();
                            isValidOfIdOfCustomerForeigner = regex.validateOfIDCustomerForeigner(idOfCustomerForeigner);
                            if (!isValidOfIdOfCustomerForeigner) {
                                System.out.println("Lỗi. ID phải đúng định dạng. Hãy nhập lại.");
                            }
                        } while (!isValidOfIdOfCustomerForeigner);

                        System.out.print("Hãy nhập họ tên: ");
                        String fullNameOfCustomerForeigner = scanner.nextLine();
                        System.out.print("Hãy nhập quốc tịch: ");
                        String nationality = scanner.nextLine();
                        CustomerForeigner customerForeigner = new CustomerForeigner(idOfCustomerForeigner, fullNameOfCustomerForeigner, nationality);
                        customerList.add(customerForeigner);
                        ReadAndWriteForCustomer.writeCustomerList(customerList, CUSTOMER_PATH, false);
                        break;
                    default:
                        throw new Exception("Lỗi. Hãy nhập lại.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void display() {
        List<Customer> customerList = ReadAndWriteForCustomer.readCustomerList(CUSTOMER_PATH);
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }
    public void searchByName () {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customerList = ReadAndWriteForCustomer.readCustomerList(CUSTOMER_PATH);
        System.out.print("Hãy nhập vào họ tên cần tìm kiếm: ");
        String fullNameForSearch = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getFullName().contains(fullNameForSearch)) {
                flag = true;
                System.out.println(customerList.get(i).toString());
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy họ tên cần tìm trong danh sách");
        }
    }
}
