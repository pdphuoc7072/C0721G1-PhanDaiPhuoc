package ss12_java_collection_framework.bai_tap_optional.cai_dat_thao_tac_duyet_theo_thu_tu_postorder_trong_binary_search_tree;

public interface Tree<E> {
    boolean insert (E e);
    void postOrder ();
    int getSize ();
}
