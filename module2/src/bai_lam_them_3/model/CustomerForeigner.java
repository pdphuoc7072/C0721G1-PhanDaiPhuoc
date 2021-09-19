package bai_lam_them_3.model;

public class CustomerForeigner extends Customer {
    private String nationality;

    public CustomerForeigner() {
    }

    public CustomerForeigner(String idOfCustomer, String fullName, String nationality) {
        super(idOfCustomer, fullName);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "CustomerForeigner{" +
                super.toString() +
                "nationality='" + nationality + '\'' +
                '}';
    }
    @Override
    public String getStringToCSV () {
        return super.getStringToCSV() + "," + this.nationality;
    }
}
