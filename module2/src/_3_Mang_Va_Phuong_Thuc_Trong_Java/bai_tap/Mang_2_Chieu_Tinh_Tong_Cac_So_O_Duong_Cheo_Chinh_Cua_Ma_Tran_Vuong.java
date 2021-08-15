package _3_Mang_Va_Phuong_Thuc_Trong_Java.bai_tap;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Mang_2_Chieu_Tinh_Tong_Cac_So_O_Duong_Cheo_Chinh_Cua_Ma_Tran_Vuong {
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
