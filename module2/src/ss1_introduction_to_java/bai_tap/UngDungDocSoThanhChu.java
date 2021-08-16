package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static String doc1ChuSo (int number) {
        String str = "";
        switch (number) {
            case 0:
                str = "";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str= "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
        }
        return str;
    }
    public static String doc2ChuSo (int number) {
        int num = number / 10;
        int num1 = number % 10;
        String str = "";
        switch (num) {
            case 1:
                switch (num1) {
                    case 0:
                        str = "ten";
                        break;
                    case 1:
                        str = "eleven";
                        break;
                    case 2:
                        str = "twelve";
                        break;
                    case 3:
                        str = "thirteen";
                        break;
                    case 4:
                        str = "fourteen";
                        break;
                    case 5:
                        str = "fifteen";
                        break;
                    case 8:
                        str = "eighteen";
                        break;
                    default:
                        str = doc1ChuSo(num1) + "teen";
                        break;
                }
                break;
            case 2:
                str = "twenty " + doc1ChuSo(num1);
                break;
            case 3:
                str = "thirty " + doc1ChuSo(num1);
                break;
            case 4:
                str = "forty " + doc1ChuSo(num1);

                break;
            case 5:
                str = "fifty " + doc1ChuSo(num1);

                break;
            case 8:
                str = "eighty " + doc1ChuSo(num1);

                break;
            default:
                str = doc1ChuSo(num) + "ty " + doc1ChuSo(num1);

        }
        return str;
    }
    public static String doc3ChuSo (int number) {
        int num = number / 100;
        int num1 = number % 100;
        String str = "";
        if (num1 == 0 && num > 0) {
            str = doc1ChuSo(num) + " hundred";
        } else if (num1 >= 0 && num1 <= 9 && num > 0){
            str = doc1ChuSo(num) + " hundred and " + doc1ChuSo(num1);
        } else {
            str = doc1ChuSo(num) + " hundred and " + doc2ChuSo(num1);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập 1 số nguyên không âm: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        if (inputNumber < 0) {
            System.out.println("Bạn đã nhập sai. Hãy nhập lại số nguyên không âm.");
        } else if (inputNumber == 0){
            System.out.println("Sau khi chuyển đổi, số nhập vào sẽ được đọc là: zero");
        } else if (inputNumber > 0 && inputNumber <= 9) {
            System.out.println("Sau khi chuyển đổi, số nhập vào sẽ được đọc là: " + doc1ChuSo(inputNumber));
        } else if (inputNumber >= 10 && inputNumber < 100) {
            System.out.println("Sau khi chuyển đổi, số nhập vào sẽ được đọc là: " + doc2ChuSo(inputNumber));
        } else if (inputNumber >= 100 && inputNumber < 1000) {
            System.out.println("Sau khi chuyển đổi, số nhập vào sẽ được đọc là: " + doc3ChuSo(inputNumber));
        } else {
            System.out.println("Xin lỗi vượt quá khả năng nên không thể đọc được");
        }
    }
}
