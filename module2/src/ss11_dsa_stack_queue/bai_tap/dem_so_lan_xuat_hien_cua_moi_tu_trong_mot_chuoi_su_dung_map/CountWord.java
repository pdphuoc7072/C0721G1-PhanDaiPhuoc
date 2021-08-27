package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào 1 câu: ");
        String inputString = scanner.nextLine();
        String[] arrayOfInputString = inputString.split(" ");
        Map<String, Integer> myMap = new TreeMap<>();
        for (String string : arrayOfInputString) {
            string = string.toLowerCase();
            int countKey = 1;
            if (myMap.containsKey(string)) {
                countKey++;
                myMap.put(string, countKey);
            } else {
                myMap.put(string, countKey);
            }
        }
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
