package ss5_access_modifier_static_method_static_property.bai_tap.bai_lam_them_fix_bug.bai_lam_them_fix_bug;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Chọn chức năng\n" +
                    "1.Add\n" +
                    "2.show\n" +
                    "3.Exit");
            System.out.print("Chọn: ");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    StudentManager.add();
                    break;
                case 2:
                    StudentManager.display();
                    break;
                case 3:
                    System.exit(0);

            }
        }
    }
}
