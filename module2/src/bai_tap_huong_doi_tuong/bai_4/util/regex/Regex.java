package bai_tap_huong_doi_tuong.bai_4.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String BIRTHDAY_REGEX = "^(?:0[1-9]|[12][0-9]|3[01])[-|/](?:0[1-9]|1[0-2])[-|/](?:19[0-9]{2}|20[0-9]{2})$";
    private static final String ID_OF_CADRES_REGEX = "^[C][B][-][0-9]{4}$";
    Pattern pattern;
    Matcher matcher;

    public boolean validateOfBirthday (String string) {
        pattern = Pattern.compile(BIRTHDAY_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfIdCadres (String string) {
        pattern = Pattern.compile(ID_OF_CADRES_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
