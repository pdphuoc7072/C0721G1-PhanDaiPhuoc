package ss19_string_va_regex.bai_tap.validate_so_dien_thoai;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateOfPhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";

    public ValidateOfPhoneNumber() {
    }
    public boolean validate (String string) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
