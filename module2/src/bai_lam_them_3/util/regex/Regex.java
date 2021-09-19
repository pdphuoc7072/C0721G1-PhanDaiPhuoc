package bai_lam_them_3.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String ID_CUSTOMER_VIETNAM_REGEX = "^KHVN-[0-9]{5}$";
    private static final String ID_CUSTOMER_FOREIGNER_REGEX = "^KHNN-[0-9]{5}$";
    private static final String INVOICE_DATE_REGEX = "^(?:0[1-9]|[12][0-9]|3[01])[-|/](?:0[1-9]|1[0-2])[-|/](20[0-9]{2})$";
    Pattern pattern;
    Matcher matcher;

    public boolean validateOfIDCustomerVietNam (String string) {
        pattern = Pattern.compile(ID_CUSTOMER_VIETNAM_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfIDCustomerForeigner (String string) {
        pattern = Pattern.compile(ID_CUSTOMER_FOREIGNER_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean validateOfInvoiceDate (String string) {
        pattern = Pattern.compile(INVOICE_DATE_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
