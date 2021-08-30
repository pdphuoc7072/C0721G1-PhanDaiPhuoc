package ss11_dsa_stack_queue.bai_tap_optional.to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Person implements Comparable<Person> {
    private String name;
    private String gender;
    private String dateOfBirth;

    public Person() {
    }

    public Person (String name, String gender, String dateOfBirth) {
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString () {
        return " name = " + getName() + ", gender = " + getGender() + ", dateOfBirth = " + getDateOfBirth() + "\n";
    }

    @Override
    public int compareTo(Person o) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return (simpleDateFormat.parse(this.getDateOfBirth())).compareTo(simpleDateFormat.parse(o.getDateOfBirth()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
