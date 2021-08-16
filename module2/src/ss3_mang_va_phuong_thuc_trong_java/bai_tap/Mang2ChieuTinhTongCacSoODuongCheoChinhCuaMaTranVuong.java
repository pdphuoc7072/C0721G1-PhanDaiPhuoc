package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Mang2ChieuTinhTongCacSoODuongCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số hàng của ma trận vuông: ");
        int row = scanner.nextInt();
        System.out.println("Hãy nhập số cột của ma trận vuông: ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        if (row != col) {
            System.out.println("Đây không phải là ma trận vuông. Hãy nhập lại.");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.println("Hãy nhập phần tử ở vị trí index là: " + i + ", " + j);
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
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][i];
                break;
            }
        }
        System.out.println("Tổng các số ở đường chéo chính của ma trận vuông là: " + sum);
    }
}
