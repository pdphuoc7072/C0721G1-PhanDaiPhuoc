package bai_lam_them_fix_bug_tuan_2;

public  class Student extends Person {
    private static String school = "Codegym";

    public Student(String name, int AGE, Address address) {
        super(name, AGE, address);
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public void howToMove() {
        System.out.println("Student goes by any vehicle");
    }

    @Override
    public String toString() {
        return "Student" +super.toString() +"\nschool"+school;
    }
}
