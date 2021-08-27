package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Arrays;
import java.util.Scanner;

public class MyGenericStackTest {
    private static void stackOfIntegers () {
        Scanner scanner = new Scanner(System.in);
        MyGenericStack<Integer> myStackIntegers = new MyGenericStack();
        System.out.print("Hãy nhập size của mảng: ");
        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        int[] arrayOfIntegers = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Hãy nhập phần tử có index = " + i + " : ");
            arrayOfIntegers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng trước khi đưa vào stack: " + Arrays.toString(arrayOfIntegers) + "\n");
        for (int i = 0; i < sizeOfArray; i++) {
            myStackIntegers.push(arrayOfIntegers[i]);
        }
        for (int i = 0 ; i < sizeOfArray; i++) {
            arrayOfIntegers[i] = myStackIntegers.pop();
        }
        System.out.print("Mảng sau khi lấy ra từ stack: " + Arrays.toString(arrayOfIntegers));
    }
    private static void stackOfStrings () {
        Scanner scanner = new Scanner(System.in);
        MyGenericStack<String> myStackStrings = new MyGenericStack();
        System.out.print("Hãy nhập 1 câu: ");
        String inputString = scanner.nextLine();
        String[] inputStringOfArray = inputString.split(" ");
        StringBuilder outputString = new StringBuilder();
        for (String element : inputStringOfArray) {
            myStackStrings.push(element);
        }
        while (!myStackStrings.isEmpty()) {
            outputString.append(myStackStrings.pop()).append(" ");
        }
        System.out.println("Sau khi lấy ra từ stack, câu nhập vào ban đầu sẽ là: " + outputString);

    }

    public static void main(String[] args) {
        stackOfIntegers();
        System.out.println();
        stackOfStrings();
    }
}
