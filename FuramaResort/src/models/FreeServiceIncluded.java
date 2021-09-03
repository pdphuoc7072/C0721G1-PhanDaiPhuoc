package models;

public class FreeServiceIncluded {
    private String nameOfFreeService; // Tên dịch vụ miễn phí

    public FreeServiceIncluded() {
    }

    public FreeServiceIncluded(String nameOfFreeService) {
        this.nameOfFreeService = nameOfFreeService;
    }

    public String getNameOfFreeService() {
        return nameOfFreeService;
    }

    public void setNameOfFreeService(String nameOfFreeService) {
        this.nameOfFreeService = nameOfFreeService;
    }

    @Override
    public String toString() {
        return "FreeServiceIncluded{" +
                "nameOfFreeService='" + nameOfFreeService + '\'' +
                '}';
    }
}
