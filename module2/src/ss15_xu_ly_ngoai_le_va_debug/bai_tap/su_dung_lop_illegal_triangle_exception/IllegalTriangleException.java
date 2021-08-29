package ss15_xu_ly_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

public class IllegalTriangleException extends Exception {
    private double side = 1.0;
    public IllegalTriangleException (double side) {
        super("Tổng 2 cạnh không lớn hơn cạnh còn lại. Hoặc do nhập vào số nhỏ hơn hoặc bằng 0");
    }

}
