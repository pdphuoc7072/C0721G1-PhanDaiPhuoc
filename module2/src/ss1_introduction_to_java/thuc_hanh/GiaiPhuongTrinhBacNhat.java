package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("b = ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("c = ");
        double c = Double.parseDouble(scanner.nextLine());
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Phương trình có nghiệm là: x = " + answer);
        } else {
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
