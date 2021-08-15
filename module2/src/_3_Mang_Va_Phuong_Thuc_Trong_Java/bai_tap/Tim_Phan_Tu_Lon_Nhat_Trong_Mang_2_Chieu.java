package _3_Mang_Va_Phuong_Thuc_Trong_Java.bai_tap;

import java.util.Scanner;

public class Tim_Phan_Tu_Lon_Nhat_Trong_Mang_2_Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số hàng của ma trận matrix: ");
        int row = scanner.nextInt();
        System.out.println("Hãy nhập số cột của ma trận matrix: ");
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
        int max = matrix[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.print("Số lớn nhất trong ma trận là " + max + " ở vị trí " + x + ", " + y);
    }
}
