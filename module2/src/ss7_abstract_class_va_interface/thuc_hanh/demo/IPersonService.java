package ss7_abstract_class_va_interface.thuc_hanh.demo;

public interface IPersonService {
    default void thi () {
        System.out.println("Bạn đang thi");
    }
}
