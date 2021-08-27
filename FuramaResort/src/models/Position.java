package models;

public class Position {
    private final String RECEPTIONIST = "receptionist";
    private final String SERVICE = "service";
    private final String EXPERT = "expert";
    private final String MONITOR = "monitor";
    private final String MANAGER = "manager";
    private final String DIRECTOR = "director";

    public String getRECEPTIONIST() {
        return RECEPTIONIST;
    }

    public String getSERVICE() {
        return SERVICE;
    }

    public String getEXPERT() {
        return EXPERT;
    }

    public String getMONITOR() {
        return MONITOR;
    }

    public String getMANAGER() {
        return MANAGER;
    }

    public String getDIRECTOR() {
        return DIRECTOR;
    }
}
