package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 23000;
        System.out.print("Hãy nhập số tiền USD: ");
        int usd = Integer.parseInt(scanner.nextLine());
        int vnd = usd * rate;
        System.out.print("Số tiền VND là: " + vnd + " VND");
    }
}
