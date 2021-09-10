package bai_lam_them_fix_bug_tuan_4;

public  class Student extends Person {
    private static String school = "Codegym";

    public Student(String name, int AGE, String address) {
        super(name, AGE, address);
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public String toString() {
        return "Student" +super.toString() +"\nschool= "+school;
    }

    @Override
    public void howToMove() {

    }

    public String toStringSaveCSV(){
        return this.getName()+","+this.getAGE()+","+this.getAddress()+","+school;
    }


}
