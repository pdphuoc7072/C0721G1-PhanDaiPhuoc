package ss7_abstract_class_va_interface.bai_tap_them;


import java.util.Arrays;
import java.util.Scanner;

public class FindString {
    public static String[] find (String string) {
        string = string.replaceAll(" ", "");
        String[] arrayOfString = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            arrayOfString[i] = String.valueOf(string.charAt(i));
        }
        int count = 0;
        String[] tempArray = new String[arrayOfString.length];
        for (int i = 0; i < arrayOfString.length - 1; i++) {
            for (int j = i + 1; j < arrayOfString.length; j++) {
                if (arrayOfString[i].equals(arrayOfString[j])) {
                    tempArray[count] = arrayOfString[i];
                    count++;
                    break;
                }
            }
        }
        String[] resultArray = new String[count];
        for (int i = 0; i < count; i++) {
            resultArray[i] = tempArray[i];
        }
        return tempArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println(Arrays.toString(find(inputString)));
    }
}
