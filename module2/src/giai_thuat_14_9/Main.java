package giai_thuat_14_9;

public class Main {
    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        int m = 5;
        int n = 9;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == j || j == m - 1 || j == n - i - 1) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }
            System.out.println();
        }
    }
}
