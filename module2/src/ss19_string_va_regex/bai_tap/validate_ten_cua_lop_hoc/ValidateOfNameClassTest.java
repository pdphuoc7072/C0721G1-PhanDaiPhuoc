package ss19_string_va_regex.bai_tap.validate_ten_cua_lop_hoc;

public class ValidateOfNameClassTest {
    public static void main(String[] args) {
        ValidateOfNameClass validateOfNameClass = new ValidateOfNameClass();
        String[] validNameClass = new String[] {"C0721G", "A0321I", "P0819H", "P0435L", "A0431K", "C0478M"};
        String[] invalidNameClass = new String[] {"M0318G", "P0323A", "P045H", "CG"};
        for (String nameClass : validNameClass) {
            boolean isValid = validateOfNameClass.validate(nameClass);
            System.out.println("Name class is " + nameClass +" is valid: "+ isValid);
        }
        for (String nameClass : invalidNameClass) {
            boolean isValid = validateOfNameClass.validate(nameClass);
            System.out.println("Name class is " + nameClass +" is valid: "+ isValid);
        }
    }
}
