package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework;

import java.util.Comparator;

public class SortDescendingForPriceOfProduct implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPriceOfProduct() > o2.getPriceOfProduct()) {
            return 1;
        } else {
            return -1;
        }
    }
}
