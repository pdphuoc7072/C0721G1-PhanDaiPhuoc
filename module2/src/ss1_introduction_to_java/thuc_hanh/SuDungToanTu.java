package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng: ");
        float width = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập chiều cao: ");
        float height = Float.parseFloat(scanner.nextLine());
        float area = width * height;
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }
}
