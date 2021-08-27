package ss10_dsa_danh_sach.bai_lam_them_fix_bug_tuan_2;

import java.util.Scanner;

public class StudentManager {
    public static Person[] peopleList = new Person[100];
    static {
        peopleList[0] = new Student("phước", 18,new Address("47","Lâm Nhĩ","HA","Cẩm lệ","DN"));
        peopleList[1] = new Student("thiện", 19,new Address("47","Lâm Nhĩ","HA","Cẩm lệ","DN"));
        peopleList[2] = new Student("sang", 20,new Address("47","Lâm Nhĩ","HA","Cẩm lệ","DN"));
        peopleList[3] = new Teacher(1000,"chánh", 20,new Address("47","Lâm Nhĩ","HA","Cẩm lệ","DN"));
        peopleList[4] = new Teacher(2000,"Hải", 20,new Address("47","Lâm Nhĩ","HA","Cẩm lệ","DN"));
        peopleList[5] = new Employee(2000,"Hà", 20,new Address("47","Lâm Nhĩ","HA","Cẩm lệ","DN"));
        peopleList[6] = new Employee(2000,"Nhung", 20,new Address("47","Lâm Nhĩ","HA","Cẩm lệ","DN"));
    }
    // thêm mới student
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập  tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số nhà");
        String houseNumber = scanner.nextLine();
        System.out.println("nhập tên đường");
        String stress = scanner.nextLine();
        System.out.println("nhập phường/xã");
        String ward = scanner.nextLine();
        System.out.println("nhập huyện");
        String district = scanner.nextLine();
        System.out.println("nhập tỉnh/TP");
        String province = scanner.nextLine();
        Address address =new Address(houseNumber,stress,ward,district,province);
        Student student = new Student(name, age,address);
        for (int i = 0; i < peopleList.length; i++) {
            if (peopleList[i] == null) {
                peopleList[i] = student;
                break;
            }
        }
    }
    // hiện thị danh sách
    public static void display() {
        for (int i = 0; i < peopleList.length; i++) {
            if (peopleList[i]!=null){
                System.out.println(peopleList[i].toString());
                if (peopleList[i] instanceof Student) {
                    ((Student)peopleList[i]).howToMove();
                } if (peopleList[i] instanceof Employee) {
                    ((Employee)peopleList[i]).howToMove();
                } if (peopleList[i] instanceof Teacher) {
                    ((Teacher)peopleList[i]).howToMove();
                }
            }
        }
    }
}
