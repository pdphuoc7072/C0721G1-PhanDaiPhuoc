package ss19_string_va_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateOfNameClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NAME_CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public ValidateOfNameClass() {
    }
    public boolean validate (String string) {
        pattern = Pattern.compile(NAME_CLASS_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
