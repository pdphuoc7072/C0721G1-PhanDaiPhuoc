package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số hàng của ma trận matrix: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập số cột của ma trận matrix: ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Hãy nhập phần tử ở index: " + i + ", " + j);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
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
        int x = Integer.parseInt(scanner.nextLine());
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
