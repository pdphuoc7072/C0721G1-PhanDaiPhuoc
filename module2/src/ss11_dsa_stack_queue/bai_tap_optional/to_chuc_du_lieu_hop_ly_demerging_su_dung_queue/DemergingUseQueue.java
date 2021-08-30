package ss11_dsa_stack_queue.bai_tap_optional.to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;

import java.util.*;

public class DemergingUseQueue {
    private static final String MALE = "male";
    private static final String FEMALE = "female";

    public static void main(String[] args) {
        Queue<Person> queueMale = new LinkedList<>();
        Queue<Person> queueFemale = new LinkedList<>();
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("An", "female", "27/07/1996"));
        listPerson.add(new Person("Nam", "male", "19/02/1988"));
        listPerson.add(new Person("Anh", "male", "01/07/1996"));
        listPerson.add(new Person("Bình", "male", "08/01/1987"));
        listPerson.add(new Person("Thủy", "female", "05/02/1988"));
        listPerson.add(new Person("Hiền", "female", "15/07/1996"));
        Collections.sort(listPerson);

        System.out.println("Trước khi sắp xếp nữ trước nam, danh sách (đã sắp xếp theo ngày tháng năm sinh) là: \n" + listPerson);

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

        List<Person> listAfterDemerging = new ArrayList<>();
        while (!queueFemale.isEmpty()) {
            listAfterDemerging.add(queueFemale.poll());
        }
        while (!queueMale.isEmpty()) {
            listAfterDemerging.add(queueMale.poll());
        }

        System.out.println("Sau khi sắp xếp nữ trước nam, danh sách (vẫn giữ được tính sắp xếp theo ngày tháng năm sinh) sẽ là: \n" + listAfterDemerging);
    }
}
