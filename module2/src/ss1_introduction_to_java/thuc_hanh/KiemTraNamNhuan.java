package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 năm: ");
        int year = Integer.parseInt(scanner.nextLine());
        boolean isLeapYear;
        isLeapYear = (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);
        if (isLeapYear) {
            System.out.printf("%d là năm nhuận", year);
        } else {
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
}
