package models;

public class FreeInclusiveService {
    private String nameOfFreeService; // Tên dịch vụ miễn phí

    public FreeInclusiveService() {
    }

    public FreeInclusiveService(String nameOfFreeService) {
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
        return  nameOfFreeService;
    }
}
