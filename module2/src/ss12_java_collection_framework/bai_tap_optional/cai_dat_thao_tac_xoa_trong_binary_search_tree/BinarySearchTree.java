package ss12_java_collection_framework.bai_tap_optional.cai_dat_thao_tac_xoa_trong_binary_search_tree;

public class BinarySearchTree<E extends  Comparable<E>> extends AbstractTree<E> {
    private TreeNode<E> root;
    private int size = 0;

    public BinarySearchTree() {
    }
    public BinarySearchTree(E[] object) {
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);
        }
    }
    TreeNode<E> creatNewNode (E e) {
        return new TreeNode<>(e);
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = creatNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = creatNewNode(e);
            } else {
                parent.right = creatNewNode(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return 0;
    }
    @Override
    public void inOrder () {
        inOrder(root);
    }
    private void inOrder (TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.element + " ");
        inOrder(root.right);
    }
    @Override
    public boolean search (E e) {
        TreeNode<E> current = root;
        while (current != null || e != current.element) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
                if (current == null) {
                    return false;
                }
            } else if (e.compareTo(current.element) > 0) {
                current = current.right;
                if (current == null) {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }


}
