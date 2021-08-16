package _2_Vong_Lap_Trong_Java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu: ");
            System.out.println("\t1. In hình chữ nhật");
            System.out.println("\t2. In hình tam giác vuông cân");
            System.out.println("\t3. In hình tam giác cân");
            System.out.println("\t4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Hãy nhập chiều dài của hình chữ nhật: ");
                    int width = scanner.nextInt();
                    System.out.print("Hãy nhập chiều rộng của hình chữ nhật: ");
                    int height = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Hãy nhập cạnh a của hình tam giác vuông cân: ");
                    int a = scanner.nextInt();
                    System.out.println("Bạn muốn hình tam giác vuông cân có đỉnh ở đâu: \n" +
                            "1. Ở trên bên trái \n" +
                            "2. Ở trên bên phải \n" +
                            "3. Ở dưới bên trái \n" +
                            "4. Ở dưới bên phải");
                    int choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1:
                            for (int k = a; k > 0; k--) {
                                for (int l = 1; l <= k; l++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int m = 0; m < a; m++) {
                                for (int n = 0; n < a ; n++) {
                                    if (n < m) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int p = 1; p <= a; p++) {
                                for (int q = 1; q <= p; q++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int x = 0; x < a; x++) {
                                for (int y = a - x; y > 0; y--) {
                                    System.out.print(" ");
                                }
                                for (int z = 1; z <= x + 1; z++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("Lỗi");
                    }
                    break;
                case 3:
                    System.out.print("Nhập chiều cao của tam giác cân: ");
                    int h = scanner.nextInt();
                    for (int e = 0; e < h; e++) {
                        for (int f = h - e; f > 0; f--) {
                            System.out.print(" ");
                        }
                        for (int g = 1; g <= e * 2 + 1; g++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
