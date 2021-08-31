package ss17_io_binary_file_va_serialization.thuc_hanh.doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan;

import java.io.Serializable;

public class Student implements Serializable {
    private int idOfStudent;
    private String nameOfStudent;
    private String addressOfStudent;

    public Student() {
    }

    public Student(int idOfStudent, String nameOfStudent, String addressOfStudent) {
        this.idOfStudent = idOfStudent;
        this.nameOfStudent = nameOfStudent;
        this.addressOfStudent = addressOfStudent;
    }

    public int getIdOfStudent() {
        return idOfStudent;
    }

    public void setIdOfStudent(int idOfStudent) {
        this.idOfStudent = idOfStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getAddressOfStudent() {
        return addressOfStudent;
    }

    public void setAddressOfStudent(String addressOfStudent) {
        this.addressOfStudent = addressOfStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idOfStudent=" + idOfStudent +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                ", addressOfStudent='" + addressOfStudent + '\'' +
                '}';
    }
}
