package _2_Vong_Lap_Trong_Java.bai_tap;

import java.util.Scanner;

public class Hien_Thi_Cac_So_Nguyen_To_Nho_Hon_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn hiển thị số nguyên tố nhỏ hơn bao nhiêu? ");
        int number = scanner.nextInt();
        int N = 2;
        while (N <= number){
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
            }
            N++;
        }
    }
}
