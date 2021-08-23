package ss11_dsa_stack_queue.bai_tap_optional.to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;

import java.util.ArrayList;

public class ListPerson extends Person {
    static ArrayList<Person> listOfPerson = new ArrayList<>();
    public ListPerson () {
        setListPerson();
    }
    public static void setListPerson () {
        Person person1 = new Person("Phước", "male", new int[] {27, 7, 1990});
        Person person2 = new Person("Hà", "female", new int[] {19, 8, 1992});
        Person person3 = new Person("Kiệt", "male", new int[] {2, 3, 1989});
        Person person4 = new Person("Na", "female", new int[] {8, 1, 1994});
        Person person5 = new Person("Thủy", "female", new int[] {20, 5, 1988});
        listOfPerson.add(person1);
        listOfPerson.add(person2);
        listOfPerson.add(person3);
        listOfPerson.add(person4);
        listOfPerson.add(person5);
    }
    public static ArrayList<Person> getListPerson () {
        return listOfPerson;
    }
}
