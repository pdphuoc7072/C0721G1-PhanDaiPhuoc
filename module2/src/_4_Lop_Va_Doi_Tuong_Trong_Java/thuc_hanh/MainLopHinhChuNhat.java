package _4_Lop_Va_Doi_Tuong_Trong_Java.thuc_hanh;

import java.util.Scanner;

public class MainLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        LopHinhChuNhat rectangle = new LopHinhChuNhat(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
