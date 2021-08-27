package ss11_dsa_stack_queue.bai_tap_optional.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    private String myString;
    private String[] arrayOfMyString;
    public BracketCheck () {
        setMyString();
        setArrayOfMyString();
    }
    private void setMyString () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        myString = scanner.nextLine();
    }
    private void setArrayOfMyString () {
        this.arrayOfMyString = this.myString.split("");
    }
    public boolean isRight() {
        String[] strings = this.arrayOfMyString;
        Stack<String> stack = new Stack<>();
        StringBuilder left = new StringBuilder();
        boolean isEquals;
        for (String element : strings) {
            if (element.equals("(")) {
                stack.push(element);
            } else if (element.equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    left.append(element);
                }
            }
        }
        isEquals = (stack.size()) == (left.length());
        return isEquals;
    }
}
