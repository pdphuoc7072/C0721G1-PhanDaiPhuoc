package ss11_dsa_stack_queue.bai_tap_optional.to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String name;
    private String gender;
    private int[] dateOfBirth = new int[3];
    static ArrayList<Person> listOfPerson = new ArrayList<>();

    public Person() {
    }

    public Person (String name, String gender, int[] dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int[] getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int[] dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString () {
        return "name = " + getName() + "gender = " + getGender() + "dateOfBirth = " + Arrays.toString(getDateOfBirth());
    }
}
