package bai_jame_mo_rong_13_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String FULL_NAME_REGEX = "^([A-Z]+[a-z\\s]*){2,}$";
    private static final String EMAIL_REGEX = "^[a-z]+([A-Za-z0-9\\.]+)*@[A-Za-z0-9]{2,5}+(\\.[A-Za-z0-9]{2,5}+)*(\\.[A-Za-z]{2,5})$";
    ;
    Pattern pattern;
    Matcher matcher;

    public boolean validateOfFullName (String string) {
        pattern = Pattern.compile(FULL_NAME_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public boolean validateOfEmail (String string) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
