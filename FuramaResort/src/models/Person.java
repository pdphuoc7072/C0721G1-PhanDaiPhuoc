package models;

public abstract class Person {
    protected enum Gender {
        MALE, FEMALE; // Giới tính nam, nữ
    }
    private String fullName; // Họ tên
    private String birthday; // Ngày sinh
    private Gender gender; // Giới tính
    private String idCardNumber; // Số CMND
    private String phoneNumber; // Số điện thoại
    private String email; // Email

    public Person(String fullName, String birthday, Gender gender, String idCardNumber, String phoneNumber, String email) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
