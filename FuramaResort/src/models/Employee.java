package models;

public class Employee extends Person {
    private String idOfEmployee; // Mã nhân viên
    private EducationLevel educationLevel; // Trình độ: trung cấp/cao đẳng/đại học/sau đại học
                                                      // intermediate/college/university/post graduate
    private Position position; // Vị trí: lễ tân/phục vụ nam:phục vụ nữ/chuyên viên/giám sát/quản lý/giám đốc
                                       // receptionist/waiter:waitress/expert/supervision/manager/director

    public Employee(String fullName, String birthday, String gender, String idCardNumber, String phoneNumber, String email, String idOfEmployee, EducationLevel educationLevel, Position position) {
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

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "idOfEmployee = '" + idOfEmployee + '\'' +
                ", educationLevel = " + educationLevel +
                ", position = " + position +
                '}';
    }
}
