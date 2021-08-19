package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name;
    private String classes;
    public Student () {
        this("John", "C02");
    }
    public Student (String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    public String getName () {
        return this.name;
    }
    public String getClasses () {
        return this.classes;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setClasses (String classes) {
        this.classes = classes;
    }
}
