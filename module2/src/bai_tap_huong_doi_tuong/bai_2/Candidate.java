package bai_tap_huong_doi_tuong.bai_2;

public class Candidate {
    private int id;
    private String fullName;
    private String birthday;
    private double scoreOfMath;
    private double scoreOFLiterature;
    private double scoreOfEnglish;

    public Candidate() {
    }

    public Candidate(int id, String fullName, String birthday, double scoreOfMath, double scoreOFLiterature, double scoreOfEnglish) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.scoreOfMath = scoreOfMath;
        this.scoreOFLiterature = scoreOFLiterature;
        this.scoreOfEnglish = scoreOfEnglish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getScoreOfMath() {
        return scoreOfMath;
    }

    public void setScoreOfMath(double scoreOfMath) {
        this.scoreOfMath = scoreOfMath;
    }

    public double getScoreOFLiterature() {
        return scoreOFLiterature;
    }

    public void setScoreOFLiterature(double scoreOFLiterature) {
        this.scoreOFLiterature = scoreOFLiterature;
    }

    public double getScoreOfEnglish() {
        return scoreOfEnglish;
    }

    public void setScoreOfEnglish(double scoreOfEnglish) {
        this.scoreOfEnglish = scoreOfEnglish;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", scoreOfMath=" + scoreOfMath +
                ", scoreOFLiterature=" + scoreOFLiterature +
                ", scoreOfEnglish=" + scoreOfEnglish +
                '}';
    }
}
