package ss11_dsa_stack_queue.bai_tap_optional.to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingQueue {
    private static final String MALE = "male";
    private static final String FEMALE = "female";

    public static void main(String[] args) {
        Queue<Person> queueMale = new LinkedList<>();
        Queue<Person> queueFemale = new LinkedList<>();
        ArrayList<Person> listPerson = new ArrayList<>();
        Person person1 = new Person("Phước", "male", new int[]{27, 7, 1990});
        Person person2 = new Person("Hà", "female", new int[]{19, 8, 1992});
        Person person3 = new Person("Kiệt", "male", new int[]{2, 3, 1989});
        Person person4 = new Person("Na", "female", new int[]{8, 1, 1994});
        Person person5 = new Person("Thủy", "female", new int[]{20, 5, 1988});
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);
        listPerson.add(person4);
        listPerson.add(person5);
        
        for (Person person : listPerson) {
            switch (person.getGender()) {
                case MALE:
                    queueMale.add(person);
                    break;
                case FEMALE:
                    queueFemale.add(person);
                    break;
            }
        }

        ArrayList<Person> listAfterDemerging = new ArrayList<>();
        while (!queueFemale.isEmpty()) {
            listAfterDemerging.add(queueFemale.poll());
        }
        while (!queueMale.isEmpty()) {
            listAfterDemerging.add(queueMale.poll());
        }
        System.out.println(listAfterDemerging);
    }
}
