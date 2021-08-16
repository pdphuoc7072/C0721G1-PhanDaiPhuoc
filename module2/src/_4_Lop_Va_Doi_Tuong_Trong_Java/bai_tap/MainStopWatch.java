package _4_Lop_Va_Doi_Tuong_Trong_Java.bai_tap;

import java.time.LocalTime;

public class MainStopWatch {
    public static int[] selectionSort (int...a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random()*10000);
        }
        LocalTime start = LocalTime.now();
        array = selectionSort(array);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start, end);
        System.out.println("Time is: " + stopWatch.getElapsedTime() + " ms");
    }
}
