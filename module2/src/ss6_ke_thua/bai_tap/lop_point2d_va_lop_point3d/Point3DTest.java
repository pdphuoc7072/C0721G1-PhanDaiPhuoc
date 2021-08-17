package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));

        point3D = new Point3D(4.5f, 6.1f, 9.2f);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));

        point3D.setXYZ(2.1f, 4.5f, 6.7f);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
