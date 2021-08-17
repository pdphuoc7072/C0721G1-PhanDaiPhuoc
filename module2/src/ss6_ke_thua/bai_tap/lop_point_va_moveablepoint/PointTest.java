package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));

        point = new Point(1.4f, 2.5f);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));

        point.setXY(3.1f, 5.6f);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
