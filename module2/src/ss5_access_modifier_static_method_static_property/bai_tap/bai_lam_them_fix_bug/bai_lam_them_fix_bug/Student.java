package ss5_access_modifier_static_method_static_property.bai_tap.bai_lam_them_fix_bug.bai_lam_them_fix_bug;

public class Student {
    private static String school = "Codegym";
    private String name;
    private  int AGE;

    public Student() {
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public Student(String name, int AGE) {
        this.name = name;
        this.AGE = AGE;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", AGE=" + AGE +
                '}';
    }
}
