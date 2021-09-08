package ss15_xu_ly_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideAOfTriangle;
        while (true) {
            try {
                System.out.print("Hãy nhập cạnh a của tam giác: ");
                sideAOfTriangle = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        double sideBOfTriangle;
        while (true) {
            try {
                System.out.print("Hãy nhập cạnh b của tam giác: ");
                sideBOfTriangle = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        double sideCOfTriangle;
        while (true) {
            try {
                System.out.print("Hãy nhập cạnh c của tam giác: ");
                sideCOfTriangle = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            new Triangle(sideAOfTriangle, sideBOfTriangle, sideCOfTriangle);
            System.out.println("Đây là 3 cạnh của 1 tam giác");
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}
