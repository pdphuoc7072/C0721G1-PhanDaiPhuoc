package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.service;

import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.model.Rectangle;

public class SquareService extends Rectangle implements IColorableService {
    public SquareService() {
    }
    public SquareService(double side) {
        super(side, side);
    }
    public SquareService(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide () {
        return getWidth();
    }
    public void setSide (double side) {
        setWidth(side);
        setHeight(side);
    }
    @Override
    public String toString () {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
    @Override
    public void howToColor () {
        System.out.println("Color all four sides");
    }
}
