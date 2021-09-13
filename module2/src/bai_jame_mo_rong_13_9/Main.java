package bai_jame_mo_rong_13_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Regex regex = new Regex();
        Scanner scanner = new Scanner(System.in);

        String fullName;
        boolean isValidOfFullName;
        do {
            System.out.print("Hãy nhập họ và tên của bạn: ");
            fullName = scanner.nextLine();
            isValidOfFullName = regex.validateOfFullName(fullName);
            if (!isValidOfFullName) {
                System.out.println("Lỗi. Họ và tên phải đúng định dạng.");
            }
        } while (!isValidOfFullName);

        String email;
        boolean isValidOfEmail;
        do {
            System.out.print("Hãy nhập email của bạn: ");
            email = scanner.nextLine();
            isValidOfEmail = regex.validateOfEmail(email);
            if (!isValidOfEmail) {
                System.out.println("Lỗi. Email phải đúng định dạng");
            }
        } while (!isValidOfEmail);

        System.out.println(fullName + " có email là " + email);
    }
}
