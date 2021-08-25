package ss12_java_collection_framework.thuc_hanh_optional.cai_dat_cay_tim_kiem_nhi_phan;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
}
