package ss12_java_collection_framework.thuc_hanh_optional.cai_dat_cay_tim_kiem_nhi_phan;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }
}