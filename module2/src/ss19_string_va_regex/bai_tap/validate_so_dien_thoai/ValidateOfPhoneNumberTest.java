package ss19_string_va_regex.bai_tap.validate_so_dien_thoai;

public class ValidateOfPhoneNumberTest {
    public static void main(String[] args) {
        ValidateOfPhoneNumber validateOfPhoneNumber = new ValidateOfPhoneNumber();
        String[] validPhoneNumber = new String[]{"(84)-(0978489648)", "(00)-(0000000000)", "(81)-(0999999999)"};
        String[] invalidPhoneNumber = new String[] {"(a8)-(22222222)", "(88)-(1111111111)", "(99)-(01234567890)"};
        for (String phoneNumber : validPhoneNumber) {
            boolean isValid = validateOfPhoneNumber.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber +" is valid: "+ isValid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isValid = validateOfPhoneNumber.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber +" is valid: "+ isValid);
        }
    }
}
