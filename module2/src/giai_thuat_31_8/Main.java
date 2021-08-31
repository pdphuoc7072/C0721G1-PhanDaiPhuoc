package giai_thuat_31_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] findMax (int[][] matrixOfInteger) {
        int[] result = new int[matrixOfInteger.length];
        for (int i = 0; i < matrixOfInteger.length; i++) {
            int max = matrixOfInteger[i][0];
            for (int j = 1; j < matrixOfInteger[i].length; j++) {
                if (matrixOfInteger[i][j] > max) {
                    max = matrixOfInteger[i][j];
                }
                result[i] = max;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào số hàng của ma trận: ");
        int rowOfMatrix = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập vào số cột của ma trận: ");
        int columnOfMatrix = Integer.parseInt(scanner.nextLine());
        int[][] myMatrix = new int[rowOfMatrix][columnOfMatrix];
        int[] myResult = new int[rowOfMatrix];
        for (int i = 0; i < rowOfMatrix; i++) {
            for (int j = 0; j < columnOfMatrix; j++) {
                System.out.println("Hãy nhập phần tử ở vị trí index = " + i + ", " + j);
                myMatrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng 2 chiều vừa tạo là: ");
        for (int i = 0; i < rowOfMatrix; i++) {
            for (int j = 0; j < columnOfMatrix; j++) {
                System.out.print(myMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        myResult = findMax(myMatrix);
        System.out.println("Mảng cần tìm là: " + Arrays.toString(myResult));
    }
}
