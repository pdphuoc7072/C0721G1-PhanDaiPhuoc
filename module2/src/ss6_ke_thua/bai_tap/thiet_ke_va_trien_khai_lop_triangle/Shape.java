package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class Shape {
    private String color = "black";
    public Shape () {
    }
    public Shape (String color) {
        this.color = color;
    }
    public String getColor () {
        return this.color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    @Override
    public String toString () {
        return "Hình này có màu là: " + getColor();
    }
}
