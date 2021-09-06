package bai_jame_mo_rong_6_9;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String nameClass;

    public Student() {
    }

    public Student(String name, int age, String nameClass) {
        this.name = name;
        this.age = age;
        this.nameClass = nameClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
