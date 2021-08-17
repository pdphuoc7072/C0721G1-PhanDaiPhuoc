package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle () {
    }
    public Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle (String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1 () {
        return this.side1;
    }
    public double getSide2 () {
        return this.side2;
    }
    public double getSide3 () {
        return this.side3;
    }
    public void setSide1 (double side1) {
        this.side1 = side1;
    }
    public void setSide2 (double side2) {
        this.side2 = side2;
    }
    public void setSide3 (double side3) {
        this.side3 = side3;
    }
    public double getArea () {
        double p = (getSide1() + getSide2() + getSide3()) / 2;
        double s = Math.pow((p * (p - getSide1()) * (p - getSide2()) * (p - getSide3())), 0.5);
        return s;
    }
    public double getPerimeter () {
        return (getSide1() + getSide2() + getSide3());
    }
    @Override
    public String toString () {
        return "Tam giác này có chu vi = " + getPerimeter() + ", diện tích = " + getArea() + ". " + super.toString();
    }
}
