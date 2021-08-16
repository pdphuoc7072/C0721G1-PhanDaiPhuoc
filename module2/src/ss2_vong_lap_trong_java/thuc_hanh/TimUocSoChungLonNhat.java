package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập số b: ");
        int b = Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.print("Không có ước chung lớn nhất");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.print("Ước số chung lớn nhất của a và b là: " + a);
        }
    }
}
