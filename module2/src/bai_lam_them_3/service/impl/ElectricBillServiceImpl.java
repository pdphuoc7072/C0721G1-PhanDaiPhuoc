package bai_lam_them_3.service.impl;

import bai_lam_them_3.model.Customer;
import bai_lam_them_3.model.CustomerVietNam;
import bai_lam_them_3.model.ElectricBill;
import bai_lam_them_3.service.IElectricBillService;
import bai_lam_them_3.util.ReadAndWriteForCustomer;
import bai_lam_them_3.util.ReadAndWriteForElectricBill;
import bai_lam_them_3.util.regex.Regex;
import bai_lam_them_3.util.regex.exception.NotFoundElectricBillException;

import java.util.List;
import java.util.Scanner;

public class ElectricBillServiceImpl implements IElectricBillService {
    final String ELECTRIC_BILL_PATH = "src\\bai_lam_them_3\\data\\hoaDon.csv";
    final String CUSTOMER_PATH = "src\\bai_lam_them_3\\data\\khachHang.csv";
    Regex regex = new Regex();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        List<ElectricBill> electricBillList = ReadAndWriteForElectricBill.readElectricBillList(ELECTRIC_BILL_PATH);
        List<Customer> customerList = ReadAndWriteForCustomer.readCustomerList(CUSTOMER_PATH);

        String idOfBill;
        if (electricBillList.isEmpty()) {
            idOfBill = "MHD-001";
        } else {
            idOfBill = autoIncreaseOfId(electricBillList.get(electricBillList.size() - 1).getIdOfBill());
        }


        String idOfCustomer;
        while (true) {
            try {
                for (int i = 0; i < customerList.size(); i++) {
                    System.out.println((i + 1) + ". " + customerList.get(i));
                }
                System.out.print("Hãy chọn số: ");
                int chooseOfIdOfCustomer = Integer.parseInt(scanner.nextLine());
                if (chooseOfIdOfCustomer > customerList.size()) {
                    throw new Exception("Lỗi. Hãy nhập lại.");
                }
                idOfCustomer = customerList.get(chooseOfIdOfCustomer - 1).getIdOfCustomer();
                System.out.println("Bạn đã chọn: " + idOfCustomer);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        String invoiceDate;
        boolean isValidOfInvoiceDate;
        do {
            System.out.print("Hãy nhập ngày tháng năm xuất hóa đơn: ");
            invoiceDate = scanner.nextLine();
            isValidOfInvoiceDate = regex.validateOfInvoiceDate(invoiceDate);
            if (!isValidOfInvoiceDate) {
                System.out.println("Lỗi. Ngày tháng năm xuất hóa đơn phải đúng định dạng. Hãy nhập lại.");
            }
        } while (!isValidOfInvoiceDate);

        int numberOfKW;
        while (true) {
            try {
                System.out.print("Hãy nhập số KW tiêu thụ: ");
                numberOfKW = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        double unitPrice;
        while (true) {
            try {
                System.out.print("Hãy nhập đơn giá: ");
                unitPrice = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        double amount = 0.0;
        if (idOfCustomer.contains("KHVN")) {
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getIdOfCustomer().equals(idOfCustomer)) {
                    if (numberOfKW <= ((CustomerVietNam) customerList.get(i)).getConsumption()) {
                        amount = numberOfKW * unitPrice;
                    } else {
                        amount = (unitPrice * ((CustomerVietNam) customerList.get(i)).getConsumption()) +
                                ((numberOfKW - ((CustomerVietNam) customerList.get(i)).getConsumption()) * 2.5);
                    }
                }
            }
        }
        if (idOfCustomer.contains("KHNN")) {
            amount = numberOfKW * unitPrice;
        }

        ElectricBill electricBill = new ElectricBill(idOfBill, idOfCustomer, invoiceDate, numberOfKW, unitPrice, amount);
        electricBillList.add(electricBill);
        ReadAndWriteForElectricBill.writeElectricBillList(electricBillList, ELECTRIC_BILL_PATH, false);
    }

    @Override
    public void display() {
        Scanner scanner = new Scanner(System.in);
        List<ElectricBill> electricBillList = ReadAndWriteForElectricBill.readElectricBillList(ELECTRIC_BILL_PATH);
        List<Customer> customerList = ReadAndWriteForCustomer.readCustomerList(CUSTOMER_PATH);
        System.out.println("Thông tin hóa đơn: ");
        for (ElectricBill electricBill : electricBillList) {
            System.out.println(electricBill.toString());
        }
        while (true) {
            try {
                System.out.println("1. Xem thông tin chi tiết của hóa đơn");
                System.out.println("2. Trở lại menu chính");
                System.out.print("Hãy chọn số: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.print("Hãy nhập mã hóa đơn của hóa đơn cần xem chi tiết: ");
                        String idOfBill = scanner.nextLine();
                        for (int i = 0; i < electricBillList.size(); i++) {
                            if (electricBillList.get(i).getIdOfBill().equals(idOfBill)) {
                                for (int j = 0; j < customerList.size(); j++) {
                                    if (customerList.get(j).getIdOfCustomer().equals(electricBillList.get(i).getIdOfCustomer())) {
                                        System.out.println("Thông tin hóa đơn: ");
                                        System.out.println(electricBillList.get(i));
                                        System.out.println("Thông tin khách hàng: ");
                                        System.out.println(customerList.get(j));
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
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

    public void edit() {
        List<ElectricBill> electricBillList = ReadAndWriteForElectricBill.readElectricBillList(ELECTRIC_BILL_PATH);
        List<Customer> customerList = ReadAndWriteForCustomer.readCustomerList(CUSTOMER_PATH);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thông tin hóa đơn: ");
        for (ElectricBill electricBill : electricBillList) {
            System.out.println(electricBill.toString());
        }
        boolean check = false;
        while (true) {
            try {
                System.out.print("Hãy nhập mã hóa đơn của hóa đơn cần chỉnh sửa: ");
                String idOfBill = scanner.nextLine();

                for (int i = 0; i < electricBillList.size(); i++) {
                    if (electricBillList.get(i).getIdOfBill().equals(idOfBill)) {
                        check = true;
                        while (true) {
                            try {
                                System.out.println("1. Sửa ngày xuất hóa đơn");
                                System.out.println("2. Sửa số lượng KW tiêu thụ");
                                System.out.println("3. Sửa đơn giá");
                                System.out.println("4. Quay lại menu chính");
                                System.out.print("Hãy chọn số: ");
                                int choose = Integer.parseInt(scanner.nextLine());
                                switch (choose) {
                                    case 1:
                                        System.out.print("Hãy nhập ngày xuất hóa đơn mới: ");
                                        String newInvoiceDate = scanner.nextLine();
                                        electricBillList.get(i).setInvoiceDate(newInvoiceDate);
                                        ReadAndWriteForElectricBill.writeElectricBillList(electricBillList, ELECTRIC_BILL_PATH, false);
                                        break;
                                    case 2:
                                        System.out.print("Hãy nhập số lượng KW tiêu thụ mới: ");
                                        int newNumberOfKW = Integer.parseInt(scanner.nextLine());
                                        electricBillList.get(i).setNumberOfKW(newNumberOfKW);
                                        double newAmount = 0.0;
                                        if (electricBillList.get(i).getIdOfCustomer().contains("KHVN")) {
                                            for (int j = 0; j < customerList.size(); j++) {
                                                if (customerList.get(j).getIdOfCustomer().equals(electricBillList.get(i).getIdOfCustomer())) {
                                                    if (newNumberOfKW <= ((CustomerVietNam) customerList.get(j)).getConsumption()) {
                                                        newAmount = newNumberOfKW * electricBillList.get(i).getUnitPrice();
                                                    } else {
                                                        newAmount = (electricBillList.get(i).getUnitPrice() * ((CustomerVietNam) customerList.get(j)).getConsumption())
                                                                + ((newNumberOfKW - ((CustomerVietNam) customerList.get(j)).getConsumption()) * 2.5);
                                                    }
                                                }
                                            }
                                        }
                                        if (electricBillList.get(i).getIdOfCustomer().contains("KHNN")) {
                                            newAmount = newNumberOfKW * electricBillList.get(i).getUnitPrice();
                                        }
                                        electricBillList.get(i).setAmount(newAmount);
                                        ReadAndWriteForElectricBill.writeElectricBillList(electricBillList, ELECTRIC_BILL_PATH, false);
                                        break;
                                    case 3:
                                        System.out.print("Hãy nhập đơn giá mới: ");
                                        double newUnitPrice = Double.parseDouble(scanner.nextLine());
                                        electricBillList.get(i).setUnitPrice(newUnitPrice);
                                        double newAmount1 = 0.0;
                                        if (electricBillList.get(i).getIdOfCustomer().contains("KHVN")) {
                                            for (int j = 0; j < customerList.size(); j++) {
                                                if (customerList.get(j).getIdOfCustomer().equals(electricBillList.get(i).getIdOfCustomer())) {
                                                    if (electricBillList.get(i).getNumberOfKW() <= ((CustomerVietNam) customerList.get(j)).getConsumption()) {
                                                        newAmount1 = electricBillList.get(i).getNumberOfKW() * newUnitPrice;
                                                    } else {
                                                        newAmount1 = (newUnitPrice * ((CustomerVietNam) customerList.get(j)).getConsumption())
                                                                + ((electricBillList.get(i).getNumberOfKW() - ((CustomerVietNam) customerList.get(j)).getConsumption()) * 2.5);
                                                    }
                                                }
                                            }
                                        }
                                        if (electricBillList.get(i).getIdOfCustomer().contains("KHNN")) {
                                            newAmount1 = electricBillList.get(i).getNumberOfKW() * newUnitPrice;
                                        }
                                        electricBillList.get(i).setAmount(newAmount1);
                                        ReadAndWriteForElectricBill.writeElectricBillList(electricBillList, ELECTRIC_BILL_PATH, false);
                                        break;
                                    case 4:
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
                }
                if (!check) {
                    throw new NotFoundElectricBillException("Mã hóa đơn không tồn tại. Hãy nhập lại.");
                }
                break;
            } catch (NotFoundElectricBillException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String autoIncreaseOfId(String string) {
        String[] array = string.split("-");
        int temp = Integer.parseInt(array[1]) + 1;
        if (temp < 10) {
            return "MHD-00" + temp;
        } else if (temp < 100) {
            return "MHD-0" + temp;
        } else {
            return "MHD-" + temp;
        }
    }
}
