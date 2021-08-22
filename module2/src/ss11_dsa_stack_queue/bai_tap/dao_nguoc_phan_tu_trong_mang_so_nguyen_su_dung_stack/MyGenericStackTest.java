package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Arrays;
import java.util.Scanner;

public class MyGenericStackTest {
    private static void stackOfIntegers () {
        Scanner scanner = new Scanner(System.in);
        MyGenericStack<Integer> stackIntegers = new MyGenericStack();
        System.out.print("Hãy nhập size của mảng: ");
        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        int[] arrayIntegers = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Hãy nhập phần tử có index = " + i + " : ");
            arrayIntegers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng trước khi đưa vào stack: " + Arrays.toString(arrayIntegers) + "\n");
        for (int i = 0; i < sizeOfArray; i++) {
            stackIntegers.push(arrayIntegers[i]);
        }
        for (int i = 0 ; i < sizeOfArray; i++) {
            arrayIntegers[i] = stackIntegers.pop();
        }
        System.out.print("Mảng sau khi lấy ra từ stack: " + Arrays.toString(arrayIntegers));
    }
    private static void stackOfStrings () {
        Scanner scanner = new Scanner(System.in);
        MyGenericStack<String> stackStrings = new MyGenericStack();
        System.out.print("Hãy nhập 1 câu: ");
        String inputString = scanner.nextLine();
        String[] inputStringOfArray = inputString.split(" ");
        StringBuilder outputString = new StringBuilder();
        for (String element : inputStringOfArray) {
            stackStrings.push(element);
        }
        while (!stackStrings.isEmpty()) {
            outputString.append(stackStrings.pop()).append(" ");
        }
        System.out.println("Sau khi lấy ra từ stack, câu nhập vào ban đầu sẽ là: " + outputString);

    }

    public static void main(String[] args) {
        stackOfIntegers();
        System.out.println();
        stackOfStrings();
    }
}
