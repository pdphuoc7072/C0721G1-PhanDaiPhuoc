package ss13_thuat_toan_tim_kiem.bai_tap_optional.tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> maxList = new LinkedList<>();
        LinkedList<Character> tempList = new LinkedList<>();
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            if (tempList.size() > 1 && inputString.charAt(i) <= tempList.getLast() && tempList.contains(inputString.charAt(i))) {
                tempList.clear();
            }
            tempList.add(inputString.charAt(i));
            if (tempList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(tempList);
            }
        }
        for (Character character : maxList) {
            System.out.print(character);
        }
    }
}
