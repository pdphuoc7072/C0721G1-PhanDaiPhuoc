package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(10.0, 5.0);
        System.out.println(rectangle);
        rectangle = new Rectangle(20.0, 15.0, "yellow", false);
        System.out.println(rectangle);
    }
}
