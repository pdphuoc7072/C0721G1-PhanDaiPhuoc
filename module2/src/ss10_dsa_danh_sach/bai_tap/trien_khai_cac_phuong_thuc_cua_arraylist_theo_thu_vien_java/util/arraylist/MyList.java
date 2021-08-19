package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien_java.util.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList () {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList (int capacity) {
        elements = new Object[capacity];
    }
    public void add (int index, E element) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i++) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }
    private void ensureCapacity () {
        if (size >= elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }
    public E remove (int index) {
        checkIndex(index);
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
    private void checkIndex (int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }
    public int size () {
        return elements.length;
    }
//    public E clone () {
//
//    }
    public boolean contains (E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }
    public int indexOf (E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }
//    public boolean add (E e) {
//
//    }
//    public void ensureCapacity (int minCapacity) {
//
//    }
    public E get (int i) {
        checkIndex(i);
        return (E) elements[i];
    }
    public void clear () {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
