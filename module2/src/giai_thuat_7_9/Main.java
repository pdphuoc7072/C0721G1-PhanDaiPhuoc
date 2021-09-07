package giai_thuat_7_9;

import java.util.Arrays;

public class Main {
    public static String[] find (String[] array) {
        String[] result = new String[array.length];
        int temp = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int countOfNumberElement = 1;
            if (array[i] != null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        countOfNumberElement++;
                        array[j] = null;
                    }
                }
            } else {
                count++;
                continue;
            }
            result[temp] = (array[i] + " : " + countOfNumberElement);
            temp++;
        }
        String[] result1 = new String[result.length-count];
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] != null) {
                result1[i] = result[i];
            }
        }
        return result1;
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abc", "abc", "a"};
        String[] result = find(array);
        System.out.println(Arrays.toString(result));
    }
}
