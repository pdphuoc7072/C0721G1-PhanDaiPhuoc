package ss11_dsa_stack_queue.bai_tap_optional.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Stack;

public class ConvertDecimalToBinary {
    public void convertDecimalToBinary (int number) {
        Stack<Integer> myStack = new Stack<>();
        while (number != 0) {
            int modOfNumber = number % 2;
            myStack.push(modOfNumber);
            number /= 2;
        }
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }
}
