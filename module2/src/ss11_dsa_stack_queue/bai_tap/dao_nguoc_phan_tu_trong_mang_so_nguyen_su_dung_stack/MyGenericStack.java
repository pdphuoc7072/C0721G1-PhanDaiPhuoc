package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<I> {
    private LinkedList<I> stack;
    public MyGenericStack () {
        stack = new LinkedList();
    }
    public void push (I element) {
        stack.addFirst(element);
    }
    public int size () {
        return stack.size();
    }
    public boolean isEmpty () {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    public I pop () {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
}
