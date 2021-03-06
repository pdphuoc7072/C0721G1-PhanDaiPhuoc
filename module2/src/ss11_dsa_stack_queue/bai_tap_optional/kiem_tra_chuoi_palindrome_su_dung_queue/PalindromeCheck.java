package ss11_dsa_stack_queue.bai_tap_optional.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheck {
    private String myString;
    private String[] arrayOfString;

    public PalindromeCheck() {
        setMyString();
        setArrayOfString();
    }
    private void setMyString () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        myString = scanner.nextLine().toLowerCase().trim();
    }
    private void setArrayOfString () {
        this.arrayOfString = this.myString.split("");
    }
    private Stack<String> pushMyStringToStack (String[] strings) {
        Stack<String> myStack = new Stack<>();
        for (String element : strings) {
            myStack.push(element);
        }
        return myStack;
    }
    private Queue<String> pushMyStringToQueue (String[] strings) {
        Queue<String> myQueue = new LinkedList<>();
        for (String element : strings) {
            myQueue.add(element);
        }
        return myQueue;
    }
    public boolean isElementInStackAndQueueEqual () {
        Stack<String> myStack = pushMyStringToStack(arrayOfString);
        Queue<String> myQueue = pushMyStringToQueue(arrayOfString);
        boolean isEquals = true;
        for (int i = 0; i < arrayOfString.length; i++) {
            if (!(myStack.pop().equals(myQueue.poll()))) {
                isEquals = false;
            }
        }
        return isEquals;
    }
}
