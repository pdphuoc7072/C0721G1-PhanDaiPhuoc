package ss10_dsa_danh_sach.bai_lam_them_fix_bug_tuan_2;

public class Employee extends Person {
    private int salary;
    public Employee(int salary,String name, int AGE, Address address) {
        super(name, AGE, address);
        this.salary =salary;
    }

    @Override
    public void howToMove() {
        System.out.println("Employee by motorbike or car");
    }

}
