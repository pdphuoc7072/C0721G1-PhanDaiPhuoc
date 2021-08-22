package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien_java.util.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(30);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.addLast(14);
        ll.addLast(20);
        ll.remove(0);
        ll.printList();

    }
}
