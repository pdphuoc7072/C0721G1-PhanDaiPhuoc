package ss12_java_collection_framework.bai_tap_optional.cai_dat_thao_tac_tim_kiem_trong_binary_search_tree;

public interface Tree<E> {
    boolean insert (E e);
    void inOrder ();
    int getSize ();
    boolean search (E e);
}
