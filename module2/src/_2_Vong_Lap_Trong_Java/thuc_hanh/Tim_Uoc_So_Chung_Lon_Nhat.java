package _2_Vong_Lap_Trong_Java.thuc_hanh;

import java.util.Scanner;

public class Tim_Uoc_So_Chung_Lon_Nhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số a: ");
        a = scanner.nextInt();
        System.out.print("Hãy nhập số b: ");
        b = scanner.nextInt();
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
