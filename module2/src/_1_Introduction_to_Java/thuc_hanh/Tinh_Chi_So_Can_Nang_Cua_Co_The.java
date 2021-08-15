package _1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class Tinh_Chi_So_Can_Nang_Cua_Co_The {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        System.out.println("Bạn nặng bao nhiêu (kg)?");
        weight = scanner.nextDouble();
        System.out.println("Bạn cao bao nhiêu (m)?");
        height = scanner.nextDouble();
        bmi = weight / (Math.pow(height, 2));
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}