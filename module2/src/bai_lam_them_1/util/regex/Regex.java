package bai_lam_them_1.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String FULL_NAME_REGEX = "^([A-Z]+[a-z\\s]*){2,}$";
    private static final String PHONE_NUMBER_REGEX = "^[0][35789][0-9]{8}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+\\.[A-Za-z0-9]+$";
    private static final String BIRTHDAY_REGEX = "^(?:0[1-9]|[12][0-9]|3[01])[-|/](?:0[1-9]|1[0-2])[-|/](?:19[0-9]{2}|20[0-9]{2})$";

    private Pattern pattern;
    private Matcher matcher;

    public boolean validateOfFullName (String string) {
        pattern = Pattern.compile(FULL_NAME_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfPhoneNumber (String string) {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfEmail (String string) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfBirthday (String string) {
        pattern = Pattern.compile(BIRTHDAY_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
