package models;

public class EducationLevel {
    private String educationLevel;

    public EducationLevel() {
    }

    public EducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    @Override
    public String toString() {
        return "'" + educationLevel + '\'' ;
    }
}
