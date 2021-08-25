package ss12_java_collection_framework.bai_tap_optional.cai_dat_thao_tac_tim_kiem_trong_binary_search_tree;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(27);
        tree.insert(14);
        tree.insert(35);
        tree.insert(19);
        tree.insert(10);
        tree.insert(42);
        tree.insert(31);
        System.out.println("Inorder (sorted): ");
        tree.inOrder();
        boolean check = tree.search(42);
        if (check) {
            System.out.println("Có phần tử trong BST");
        } else {
            System.out.println("KHÔNG có phần tử trong BST");
        }
    }
}
