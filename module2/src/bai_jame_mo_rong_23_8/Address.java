package bai_jame_mo_rong_23_8;

public class Address {
    private int numHouse;
    private String street;
    private String ward;
    private String district;
    private String province;

    public Address() {
    }

    public Address(int numHouse, String street, String ward, String district, String province) {
        this.numHouse = numHouse;
        this.street = street;
        this.ward = ward;
        this.district = district;
        this.province = province;
    }

    public int getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(int numHouse) {
        this.numHouse = numHouse;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    public String toString () {
        return "Số nhà: " + getNumHouse() + ", Đường: " + getStreet() + ", Phường/Xã: " + getWard() + ", Quận/Huyện: " + getDistrict() + ", Tỉnh/Thành phố: " + getProvince();
    }
}
