package ss11_dsa_stack_queue.bai_tap_optional.kiem_tra_chuoi_palindrome_su_dung_queue;

public class PalindromeCheckTest {
    public static void main(String[] args) {
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        if (palindromeCheck.isElementInStackAndQueueEqual()) {
            System.out.print("This string is palindrome");
        } else {
            System.out.print("This string is NOT palindrome");
        }
    }
}
