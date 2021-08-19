package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập cạnh thứ 1 của tam giác: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Hãy nhập cạnh thứ 2 của tam giác: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Hãy nhập cạnh thứ 3 của tam giác: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            System.out.print("Hãy nhập màu sắc của tam giác: ");
            String color = scanner.nextLine();
            Triangle triangle = new Triangle(color, side1, side2, side3);
            System.out.println(triangle.toString());
        } else {
            System.out.println("Đây không phải là 3 cạnh của 1 tam giác");
        }
    }
}
