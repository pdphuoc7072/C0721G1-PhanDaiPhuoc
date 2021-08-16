package _1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng: ");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều cao: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }
}
