package ss10_dsa_danh_sach.bai_lam_them_fix_bug;

public class Teacher extends Person {
    private int salary;
    public Teacher(int salary,String name, int AGE, Address address) {
        super(name, AGE, address);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void howToMove() {
        System.out.println("Teacher goes by motorbike");
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString()+
                "salary=" + salary +
                '}';
    }
}
