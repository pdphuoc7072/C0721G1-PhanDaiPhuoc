package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tìm nghiệm của phương trình bậc 2: ax2 + bx + c = 0\n");
        System.out.print("Hãy nhập a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Hãy nhập b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Hãy nhập c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.print("Phương trình đã cho vô nghiệm");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("Phương trình đã cho có nghiệm kép là: x = " + quadraticEquation.getRoot1());
        } else {
            System.out.print("Phương trình đã cho có nghiệm là: x1 = " + quadraticEquation.getRoot1() + " và x2 = " + quadraticEquation.getRoot2());
        }
    }
}
