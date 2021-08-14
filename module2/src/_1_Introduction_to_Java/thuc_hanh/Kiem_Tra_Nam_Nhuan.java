package _1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class Kiem_Tra_Nam_Nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Hãy nhập vào 1 năm: ");
        year = scanner.nextInt();
        boolean isLeapYear;
        isLeapYear = (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);
        if (isLeapYear) {
            System.out.printf("%d là năm nhuận", year);
        } else {
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
}
