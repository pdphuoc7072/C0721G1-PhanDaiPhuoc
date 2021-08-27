package models;

public class Employee extends Person {
    private String idOfEmployee; // Mã nhân viên
    private EducationLevel educationLevel; // Trình độ
    private Position position; // Vị trí

    public Employee(String fullName, String birthday, Gender gender, String idCardNumber, String phoneNumber, String email, String idOfEmployee, EducationLevel educationLevel, Position position) {
        super(fullName, birthday, gender, idCardNumber, phoneNumber, email);
        this.idOfEmployee = idOfEmployee;
        this.educationLevel = educationLevel;
        this.position = position;
    }

    public String getIdOfEmployee() {
        return idOfEmployee;
    }

    public void setIdOfEmployee(String idOfEmployee) {
        this.idOfEmployee = idOfEmployee;
    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
