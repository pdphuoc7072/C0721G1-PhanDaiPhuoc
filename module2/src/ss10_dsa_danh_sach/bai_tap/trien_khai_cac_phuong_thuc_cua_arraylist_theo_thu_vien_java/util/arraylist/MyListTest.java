package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien_java.util.arraylist;

import org.omg.PortableInterceptor.INACTIVE;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myListInteger = new MyList<Integer>();
        myListInteger.add(0, 1);
        myListInteger.add(1,2);
        myListInteger.add(3);
        myListInteger.add(4);
        for (int i = 0; i < myListInteger.size(); i++) {
            System.out.println(myListInteger.get(i));
        }
        System.out.println();
        myListInteger.remove(2);
        for (int i = 0; i < myListInteger.size(); i++) {
            System.out.println(myListInteger.get(i));
        }
        System.out.println();
        System.out.println(myListInteger.contains(5));
        System.out.println();
        System.out.println(myListInteger.indexOf(4));
        System.out.println();
        myListInteger.ensureCapacity(15);
        myListInteger.add(5);
        myListInteger.add(6);
        myListInteger.add(7);
        myListInteger.add(8);
        myListInteger.add(9);
        myListInteger.add(10);
        myListInteger.add(11);
        myListInteger.add(12);
        for (int i = 0; i < myListInteger.size(); i++) {
            System.out.println(myListInteger.get(i));
        }
    }
}
