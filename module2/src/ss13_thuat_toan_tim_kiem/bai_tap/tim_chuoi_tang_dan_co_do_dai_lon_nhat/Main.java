package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a tring: ");
        String inputString = scanner.nextLine();
        LinkedList<Character> maxList = new LinkedList<>();
        LinkedList<Character> tempList = new LinkedList<>();
        for (int i = 0; i < inputString.length(); i++) {
            tempList.add(inputString.charAt(i));
            for (int j = i+ 1; j < inputString.length(); j++) {
                if (inputString.charAt(j) > tempList.getLast()) {
                    tempList.add(inputString.charAt(j));
                }
            }
            if (tempList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(tempList);
            }
            tempList.clear();
        }
        for (Character character : maxList) {
            System.out.print(character);
        }
    }
}
