package models;

public class FreeServiceIncluded {
    private String nameOfService; // Tên dịch vụ miễn phí

    public FreeServiceIncluded() {
    }

    public FreeServiceIncluded(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }
}
