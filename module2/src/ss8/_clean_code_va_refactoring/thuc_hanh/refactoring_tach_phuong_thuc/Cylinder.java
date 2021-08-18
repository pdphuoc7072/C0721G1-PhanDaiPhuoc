package ss8._clean_code_va_refactoring.thuc_hanh.refactoring_tach_phuong_thuc;

import java.util.Scanner;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập bán kính hình tròn của hình trụ: ");
        int radiusOfCircleOfCylinder = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập chiều cao của hình trụ: ");
        int heightOfCylinder = Integer.parseInt(scanner.nextLine());
        System.out.println("Thể tích của hình trụ là: " + getVolume(radiusOfCircleOfCylinder, heightOfCylinder));
    }
}
