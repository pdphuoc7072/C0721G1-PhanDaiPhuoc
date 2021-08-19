package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        this("red", true);
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor () {
        return this.color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public boolean isFilled () {
        return this.filled;
    }
    public void setFilled (boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString () {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}
