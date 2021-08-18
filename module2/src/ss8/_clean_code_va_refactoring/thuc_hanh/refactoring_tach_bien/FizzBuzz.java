package ss8._clean_code_va_refactoring.thuc_hanh.refactoring_tach_bien;

import java.util.Scanner;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz) {
            return "FizzBuzz";
        }
        if (isFizz) {
            return "Fizz";
        }
        if(isBuzz) {
            return "Buzz";
        }
        return number + "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn cần hiển thị bao nhiêu số: ");
        int numberToDisplay = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberToDisplay; i++) {
            System.out.println(fizzBuzz(i));
        }

    }
}
