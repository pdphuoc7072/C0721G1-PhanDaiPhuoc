package ss15_xu_ly_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập cạnh a của tam giác: ");
        double sideAOfTriangle = Double.parseDouble(scanner.nextLine());
        System.out.print("Hãy nhập cạnh b của tam giác: ");
        double sideBOfTriangle = Double.parseDouble(scanner.nextLine());
        System.out.print("Hãy nhập cạnh c của tam giác: ");
        double sideCOfTriangle = Double.parseDouble(scanner.nextLine());
        try {
            new Triangle(sideAOfTriangle, sideBOfTriangle, sideCOfTriangle);
            System.out.println("Đây là 3 cạnh của 1 tam giác");
        } catch (IllegalTriangleException e) {
            System.err.println(e);
        }
    }
}
