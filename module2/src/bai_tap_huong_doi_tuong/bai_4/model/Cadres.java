package bai_tap_huong_doi_tuong.bai_4.model;

public class Cadres {
    private String idOfCadres;
    private String fullName;
    private String gender;
    private String homeTown;
    private String birthday;
    private String specialize;
    private String educationLevel;
    private double coefficientOfSalary;
    private double allowance;
    private double netSalary;

    public Cadres() {
    }

    public Cadres(String idOfCadres, String fullName, String gender, String homeTown, String birthday, String specialize, String educationLevel, double coefficientOfSalary, double allowance, double netSalary) {
        this.idOfCadres = idOfCadres;
        this.fullName = fullName;
        this.gender = gender;
        this.homeTown = homeTown;
        this.birthday = birthday;
        this.specialize = specialize;
        this.educationLevel = educationLevel;
        this.coefficientOfSalary = coefficientOfSalary;
        this.allowance = allowance;
        this.netSalary = netSalary;
    }

    public String getIdOfCadres() {
        return idOfCadres;
    }

    public void setIdOfCadres(String idOfCadres) {
        this.idOfCadres = idOfCadres;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public double getCoefficientOfSalary() {
        return coefficientOfSalary;
    }

    public void setCoefficientOfSalary(double coefficientOfSalary) {
        this.coefficientOfSalary = coefficientOfSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    @Override
    public String toString() {
        return "Cadres{" +
                "idOfCadres='" + idOfCadres + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", birthday='" + birthday + '\'' +
                ", specialize='" + specialize + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", coefficientOfSalary=" + coefficientOfSalary +
                ", allowance=" + allowance +
                ", netSalary=" + netSalary +
                '}';
    }
    public String getString () {
        return this.idOfCadres + "," + this.fullName + "," + this.gender + "," + this.homeTown + "," + this.birthday + "," +
                this.specialize + "," + this.educationLevel + "," + this.coefficientOfSalary + "," + this.allowance + "," + this.netSalary;
    }
}
