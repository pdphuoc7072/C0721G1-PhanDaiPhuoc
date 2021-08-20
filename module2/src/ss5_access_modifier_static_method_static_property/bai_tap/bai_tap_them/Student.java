package ss5_access_modifier_static_method_static_property.bai_tap.bai_tap_them;

public class Student {
    private String nameStudent;
    private int ageStudent;
    private String addressStudent;

    public Student(String nameStudent, int ageStudent, String addressStudent) {
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        this.addressStudent = addressStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }
    public String displayStudent () {
        return ("Name: " + getNameStudent() + ", Age: " + getAgeStudent() + ", Address: " + getAddressStudent());
    }
}
