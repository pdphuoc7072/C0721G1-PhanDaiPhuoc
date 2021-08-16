package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_quadratic_equation;

public class QuadraticEquation {
    private double a = 1;
    private double b = 1;
    private double c = 1;
    public QuadraticEquation () {
    }
    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA () {
        return a;
    }
    public double getB () {
        return b;
    }
    public double getC () {
        return c;
    }
    public void setA (double a) {
        this.a = a;
    }
    public void setB (double b) {
        this.b = b;
    }
    public void setC (double c) {
        this.c = c;
    }
    public double getDiscriminant() {
        return (this.b * this.b - 4 * this.a * this.c);
    }
    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return  0;
        } else {
            return (-this.b + (Math.pow(this.getDiscriminant(), 0.5))) / (2 * this.a);
        }
    }
    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return  0;
        } else {
            return (-this.b - (Math.pow(this.getDiscriminant(), 0.5))) / (2 * this.a);
        }
    }
}
