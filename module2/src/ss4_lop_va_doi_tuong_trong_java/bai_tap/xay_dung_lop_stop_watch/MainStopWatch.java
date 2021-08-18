package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stop_watch;

import java.time.LocalTime;

public class MainStopWatch {
    public static int[] selectionSort (int...array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arrayOfRandomNumber = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrayOfRandomNumber[i] = (int) (Math.random()*10000);
        }
        LocalTime start = LocalTime.now();
        arrayOfRandomNumber = selectionSort(arrayOfRandomNumber);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start, end);
        System.out.println("Time is: " + stopWatch.getElapsedTime() + " ms");
        for (int i = 0; i < 100000; i++) {
            System.out.println(arrayOfRandomNumber[i]);
        }
    }
}

