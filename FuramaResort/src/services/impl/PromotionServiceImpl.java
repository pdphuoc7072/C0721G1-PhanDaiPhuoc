package services.impl;

import models.Booking;
import models.Customer;
import utils.ReadAndWriteFileOfBooking;
import utils.ReadAndWriteFileOfCustomer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PromotionServiceImpl {
    private static String filePathOfBooking = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\booking.csv";
    static String filePathOfCustomer = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\customer.csv";
    static Scanner scanner = new Scanner(System.in);

    public void displayListCustomerUseService () {
        while (true) {
            try {
                Set<Booking> bookingList = ReadAndWriteFileOfBooking.readBookingFromFile(filePathOfBooking);
                Set<Customer> listCustomerUseService = new TreeSet<>();
                List<Customer> customerList = ReadAndWriteFileOfCustomer.readCustomerFromFile(filePathOfCustomer);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar calendar = Calendar.getInstance();
                System.out.print("Hãy nhập năm: ");
                try {
                    int year = Integer.parseInt(scanner.nextLine());
                    String temp;
                    for (Booking booking : bookingList) {
                        calendar.setTime(sdf.parse(booking.getStartDate()));
                        if (year == calendar.get(Calendar.YEAR)) {
                            temp = booking.getIdOfCustomer();
                            for (int i = 0; i < customerList.size(); i++) {
                                if (temp.equals(customerList.get(i).getIdOfCustomer())) {
                                    listCustomerUseService.add(customerList.get(i));
                                    break;
                                }
                            }
                        }
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                for (Customer customer : listCustomerUseService) {
                    System.out.println(customer.toString());
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void displayListCustomerGetVoucher () {
        while (true) {
            try {
                System.out.print("Hãy nhập vào năm hiện tại: ");
                int yearCurrent = Integer.parseInt(scanner.nextLine());
                System.out.print("Hãy nhập vào tháng hiện tại: ");
                int monthCurrent = Integer.parseInt(scanner.nextLine());
                Set<Booking> bookingList = ReadAndWriteFileOfBooking.readBookingFromFile(filePathOfBooking);
                List<Customer> customerList = ReadAndWriteFileOfCustomer.readCustomerFromFile(filePathOfCustomer);
                Stack<Customer> listCustomerGetVoucher = new Stack<>();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar calendar = Calendar.getInstance();
                String temp;
                try {
                    for (Booking booking : bookingList) {
                        calendar.setTime(sdf.parse(booking.getStartDate()));
                        if ((monthCurrent - 1) == calendar.get(Calendar.MONTH) && yearCurrent == calendar.get(Calendar.YEAR)) {
                            temp = booking.getIdOfCustomer();
                            for (int i = 0; i < customerList.size(); i++) {
                                if (temp.equals(customerList.get(i).getIdOfCustomer())) {
                                    listCustomerGetVoucher.push(customerList.get(i));
                                    break;
                                }
                            }
                        }
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                if (listCustomerGetVoucher.size() == 0) {
                    System.out.println("Tháng " + monthCurrent + " năm " + yearCurrent + " hiện chưa có booking.");
                } else {
                    Stack<String> voucherList = new Stack<>();
                    System.out.println("Tháng " + monthCurrent + " năm " + yearCurrent + " hiện tại có " + listCustomerGetVoucher.size() + " booking, tương ứng với " + listCustomerGetVoucher.size() + " voucher");
                    System.out.print("Hãy nhập số lượng voucher 50%: ");
                    int numberOfVoucher50 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Hãy nhập số lượng voucher 20%: ");
                    int numberOfVoucher20 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Hãy nhập số lượng voucher 10%: ");
                    int numberOfVoucher10 = Integer.parseInt(scanner.nextLine());
                    String string1 = "Voucher 50%";
                    String string2 = "Voucher 20%";
                    String string3 = "Voucher 10%";
                    for (int i = 0; i < numberOfVoucher50; i++) {
                        voucherList.push(string1);
                    }
                    for (int i = 0; i < numberOfVoucher20; i++) {
                        voucherList.push(string2);
                    }
                    for (int i = 0; i < numberOfVoucher10; i++) {
                        voucherList.push(string3);
                    }
                    while (!voucherList.isEmpty()) {
                        System.out.println(listCustomerGetVoucher.peek() + " will get " + voucherList.peek());
                        listCustomerGetVoucher.pop();
                        voucherList.pop();
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
