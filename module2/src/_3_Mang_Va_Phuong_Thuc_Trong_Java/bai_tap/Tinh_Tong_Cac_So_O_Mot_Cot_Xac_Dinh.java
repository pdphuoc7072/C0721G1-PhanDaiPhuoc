package _3_Mang_Va_Phuong_Thuc_Trong_Java.bai_tap;

import java.util.Scanner;

public class Tinh_Tong_Cac_So_O_Mot_Cot_Xac_Dinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số hàng của ma trận matrix: ");
        int row = scanner.nextInt();
        System.out.print("Hãy nhập số cột của ma trận matrix: ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Hãy nhập phần tử ở index: " + i + ", " + j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận vừa tạo là: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("Bạn muốn tính tổng ở cột số mấy? ");
        int x = scanner.nextInt();
        int sum = 0;
        if (x < 0 || x > col - 1) {
            System.out.print("Xảy ra lỗi. Hãy nhập lại");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][x];
            }
            System.out.print("Tổng các phần tử ở cột " + x + " là: " + sum);
        }
    }
}
