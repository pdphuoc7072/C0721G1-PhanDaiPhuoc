package ss19_string_va_regex.thuc_hanh.validate_account;

public class AccountExampleTest {
    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        String[] validAccount = new String[] {"123abc_", "_abc123", "______", "123456","abcdefgh"};
        String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};
        for (String account : validAccount) {
            boolean isValid = accountExample.validateAccount(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }
        for (String account : invalidAccount) {
            boolean isValid = accountExample.validateAccount(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }
    }
}
