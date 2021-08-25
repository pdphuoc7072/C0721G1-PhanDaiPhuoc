package ss12_java_collection_framework.bai_tap_optional.cai_dat_thao_tac_duyet_theo_thu_tu_preorder_trong_binary_search_tree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
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
        tree.preOrder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
