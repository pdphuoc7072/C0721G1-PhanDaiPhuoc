package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTeMoRong {
    public static double convertVndToUsd (double vnd) {
        double usd = vnd / 23000;
        return usd;
    }
    public static double convertUsdToVnd (double usd) {
        double vnd = usd * 23000;
        return vnd;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd;
        double usd;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Chuyển đổi VND => USD");
            System.out.println("2. Chuyển dổi USD =>VND");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: {
                    System.out.println("Enter VND: ");
                    vnd = Double.parseDouble(scanner.nextLine());
                    System.out.println("VND => USD: " + convertVndToUsd(vnd));
                    break;
                }
                case 2:{
                    System.out.println("Enter USD: ");
                    usd = Double.parseDouble(scanner.nextLine());
                    System.out.println("USD => VND: " + convertUsdToVnd(usd));
                    break;
                }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập sai rồi. Hãy nhập lại 0, 1, hoặc 2");
            }
        } while (choice != 0);
    }
}
