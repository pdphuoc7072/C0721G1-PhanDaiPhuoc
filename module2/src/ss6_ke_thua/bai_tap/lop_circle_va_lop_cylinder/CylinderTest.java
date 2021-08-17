package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);
        cylinder = new Cylinder(5.5, 3.3, "red");
        System.out.println(cylinder);
    }
}
