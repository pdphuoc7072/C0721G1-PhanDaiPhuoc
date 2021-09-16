package bai_lam_them_2.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String TRUCK_REGEX = "^\\d{2}C-\\d{3}\\.\\d{2}$";
    private static final String CAR_REGEX = "^\\d{2}[AB]-\\d{3}\\.\\d{2}$";
    private static final String BIKE_REGEX = "^\\d{2}-[A-Z]\\d-\\d{3}\\.\\d{2}$";
    private static final String OWNER_REGEX = "^([A-Z]+[a-z\\s]*){2,}$";
    Pattern pattern;
    Matcher matcher;

    public boolean validateOfTruck (String string) {
        pattern = Pattern.compile(TRUCK_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfCar (String string) {
        pattern = Pattern.compile(CAR_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfBike (String string) {
        pattern = Pattern.compile(BIKE_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfOwner (String string) {
        pattern = Pattern.compile(OWNER_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
