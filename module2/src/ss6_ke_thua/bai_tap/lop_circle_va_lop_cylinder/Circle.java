package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    private double radius = 1;
    private String color = "black";
    public Circle () {
    }
    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius () {
        return this.radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public String getColor () {
        return this.color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public double getArea () {
        return this.radius * this.radius * Math.PI;
    }
    @Override
    public String toString () {
        return "Hình tròn có bán kính radius = " + getRadius() + ", có diện tích là " + getArea() + ", với màu sắc là " + getColor();
    }
}
