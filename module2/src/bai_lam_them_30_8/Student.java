package bai_lam_them_30_8;

public class Student implements Comparable<Student> {
    private String nameStudent;
    private int ageStudent;
    private Address addressStudent;

    public Student() {
    }

    public Student(String nameStudent, int ageStudent, Address addressStudent) {
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

    public Address getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(Address addressStudent) {
        this.addressStudent = addressStudent;
    }
    @Override
    public String toString () {
        return ("Name: " + getNameStudent() + ", Age: " + getAgeStudent() + ", Address: [" + getAddressStudent()) + "]";
    }


    @Override
    public int compareTo(Student o) {
        if (this.getNameStudent() == o.getNameStudent()) {
            return this.getAgeStudent() - o.getAgeStudent();
        } else {
            return this.getNameStudent().compareTo(o.getNameStudent());
        }
    }
}
