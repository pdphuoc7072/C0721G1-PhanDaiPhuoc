package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        point2D = new Point2D(1.5f, 2.5f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        point2D.setXY(0.5f, 1.3f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
