package bai_lam_them_fix_bug_tuan_4;

public abstract class Person {
    private String name;
    private  int AGE;
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, int AGE, String address) {
        this.name = name;
        this.AGE = AGE;
        this.address = address;
    }

    @Override
    public String toString() {
        return "name= " + name + '\'' +
                ", AGE= " + AGE +
                ", address= " + address;
    }
    public abstract void howToMove();
}
