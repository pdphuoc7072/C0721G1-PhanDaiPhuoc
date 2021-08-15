package _4_Lop_Va_Doi_Tuong_Trong_Java.bai_tap;

import java.util.Scanner;

public class Main_QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tìm nghiệm của phương trình bậc 2: ax2 + bx + c = 0\n");
        System.out.print("Hãy nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Hãy nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Hãy nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation (a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.print("Phương trình đã cho vô nghiệm");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("Phương trình đã cho có nghiệm kép là: x = " + quadraticEquation.getRoot1());
        } else {
            System.out.print("Phương trình đã cho có nghiệm là: x1 = " + quadraticEquation.getRoot1() + " và x2 = " + quadraticEquation.getRoot2());
        }
    }
}
