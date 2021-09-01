package ss17_io_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.util.Comparator;

public class SortDescendingForPriceOfProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPriceOfProduct() > o2.getPriceOfProduct()) {
            return -1;
        } else {
            return 1;
        }
    }
}
