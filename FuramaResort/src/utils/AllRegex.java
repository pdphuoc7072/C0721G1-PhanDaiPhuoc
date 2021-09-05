package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllRegex {
    private static final String ID_SERVICE_REGEX = "^(SV)((VL)|(HO)|(RO))[-]\\d{4}$";
    private static final String NAME_SERVICE_REGEX = "^[A-Z][a-z0-9\\s]*$";
    private static final String RENTAL_TYPE_REGEX = "^[R][T][-]((YEAR)|(MONTH)|(DAY)|(HOUSE))$";
    private static final String RATE_ROOM_REGEX = "^[0-9]\\s[S][T][A][R][S]$";
    private static final String BOOKING_REGEX = "^(BK)((VL)|(HO)|(RO))[-]\\d{4}$";
    private static final String NUMBER_CONTRACT_REGEX = "^(CT)((VL)|(HO)|(RO))[-]\\d{4}$";
    private static final String BIRTHDAY_REGEX = "^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$";
    Pattern pattern;
    Matcher matcher;
    public AllRegex() {
    }

    public boolean validateOfIdService (String string) {
        pattern = Pattern.compile(ID_SERVICE_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfNameService (String string) {
        pattern = Pattern.compile(NAME_SERVICE_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfRentalType (String string) {
        pattern = Pattern.compile(RENTAL_TYPE_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfRateRoom (String string) {
        pattern = Pattern.compile(RATE_ROOM_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfUsableArea(double number) {
        if (number > 30) {
            return true;
        } else {
            return false;
        }
    }
    public  boolean validateOfPoolArea (double number) {
        if (number > 30) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validateOfRentalCost (double number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validateOfMaxNumberPeople (int number) {
        if (number > 0 && number < 20) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validateOfNumberFlor (int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validateOfBooking (String string) {
        pattern = Pattern.compile(BOOKING_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfContract (String string) {
        pattern = Pattern.compile(NUMBER_CONTRACT_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfBirthday (String string) {
        pattern = Pattern.compile(BIRTHDAY_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
