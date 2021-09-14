package bai_tap_huong_doi_tuong.bai_3;

public class Student implements Comparable<Student> {
    private String idOfStudent;
    private String fullName;
    private String birthday;
    private String gender;
    private String nameClass;
    private String course;

    public Student() {
    }

    public Student(String idOfStudent, String fullName, String birthday, String gender, String nameClass, String course) {
        this.idOfStudent = idOfStudent;
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.nameClass = nameClass;
        this.course = course;
    }

    public String getIdOfStudent() {
        return idOfStudent;
    }

    public void setIdOfStudent(String idOfStudent) {
        this.idOfStudent = idOfStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idOfStudent='" + idOfStudent + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getIdOfStudent().compareTo(o.getIdOfStudent());
    }
}
