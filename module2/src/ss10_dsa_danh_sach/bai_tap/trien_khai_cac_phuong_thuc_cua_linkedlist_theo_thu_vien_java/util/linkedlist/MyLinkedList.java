package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien_java.util.linkedlist;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return data;
        }
    }
    private Node head;
    private int numNodes = 0;
    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public MyLinkedList() {
    }

    public void add (int index, E element) {
        Node temp = head;
        for (int i = 0; i < index -1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node current = temp.next;
        temp.next = new Node(element);
        temp.next.next = current;
        numNodes++;
    }
    public void addFirst (E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }
    public void addLast (E element) {
        Node temp = head;
        for (int i = 0; i < numNodes && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        temp.next.next = null;
        numNodes++;
    }
    public E remove (int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            for (int i = 0; i < numNodes && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return (E) data;
    }
    public boolean remove (Object element) {
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }
    public int size () {
        return numNodes;
    }
    public MyLinkedList<E> clone () {
        if (numNodes == 0) {
            throw new NullPointerException();
        }
        MyLinkedList<E> temp = new MyLinkedList<E>();
        Node tempNode = head;
        temp.addFirst((E) tempNode.data);
        tempNode = tempNode.next;
        while (tempNode != null) {
            temp.addLast((E) tempNode.data);
            tempNode = tempNode.next;
        }
        return temp;
    }
    public boolean contains (E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        if (temp.data.equals(element)) {
            return true;
        }
        return false;
    }
    public int indexOf (E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((E) temp.getData() == element) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    public boolean add (E element) {
        if (!head.data.equals(element)) {
            addFirst(element);
            numNodes++;
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (!temp.data.equals(element)) {
                    add(indexOf(element), element);
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }
//    public void ensureCapacity (int minCapacity) {
//
//    }
    public E get (int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public E getFirst () {
        return (E) head.data;
    }
    public E getLast () {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public void clear () {
        head = null;
        numNodes = 0;
    }
}
