package ss12_java_collection_framework.thuc_hanh_optional.cai_dat_cay_tim_kiem_nhi_phan;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        //create a BST
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(27);
        tree.insert(14);
        tree.insert(35);
        tree.insert(19);
        tree.insert(10);
        tree.insert(42);
        tree.insert(31);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
