package models;

public class EducationLevel {
    private final String INTERMEDIATE_LEVEL = "intermediateLevel";
    private final String COLLEGE_LEVEL = "collegeLevel";
    private final String UNIVERSITY_LEVEL = "universityLevel";
    private final String AFTER_UNIVERSITY_LEVEL = "afterUniversityLevel";

    public String getINTERMEDIATE_LEVEL() {
        return INTERMEDIATE_LEVEL;
    }

    public String getCOLLEGE_LEVEL() {
        return COLLEGE_LEVEL;
    }

    public String getUNIVERSITY_LEVEL() {
        return UNIVERSITY_LEVEL;
    }

    public String getAFTER_UNIVERSITY_LEVEL() {
        return AFTER_UNIVERSITY_LEVEL;
    }
}
