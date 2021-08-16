package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi: ");
        money = scanner.nextDouble();
        System.out.print("Nhập số tháng gửi: ");
        month = scanner.nextInt();
        System.out.print("Nhập lãi suất: ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.print("Lãi suất trong " + month + " tháng là: " + totalInterest);
    }
}
