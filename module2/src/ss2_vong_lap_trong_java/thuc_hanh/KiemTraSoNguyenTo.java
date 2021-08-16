package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào 1 số: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        if (inputNumber < 2) {
            System.out.print("Số này không phải là số nguyên tố.");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(inputNumber)) {
                if (inputNumber % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print("Số này là số nguyên tố.");
            } else {
                System.out.println("Số này không phải là số nguyên tố.");
            }
        }
    }
}
