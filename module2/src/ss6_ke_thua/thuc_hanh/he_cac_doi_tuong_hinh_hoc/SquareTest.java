package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.5);
        System.out.println(square);
        square = new Square(4.0, "black", false);
        System.out.println(square);
    }
}
