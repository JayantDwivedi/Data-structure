package TreePractice;

public class Implementation {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    // traversal algorithms

    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    // PreOrder Traversal

    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.println(node.getData() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    // PostOrder Traversal

    public void postOrder (TreeNode node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getClass() + " ");
        }
    }

    // Insertion code for Binary Tree

    public void insert(int data) {
        TreeNode newNode = new TreeNode(data);
        // if root is empty
        if (root == null) {
            root = newNode;
        }
        else {
            TreeNode current = root;
            TreeNode parent = null;
            while (current != null) {
                parent = current;
                if (current.getData() <= newNode.getData()) {
                    current = current.getRight();
                }
                else {
                    current = current.getLeft();
                }
            }
            if (newNode.getData() <= parent.getData()) {
                parent.setLeft(current);
            }
            else {
                parent.setRight(current);
            }
        }
    }

    public void search (int key) {
        if (root == null) {
            System.out.println("Tree is Empty");
        }
        else {
            TreeNode current = root;
            TreeNode parent = null;
            while (current != null) {
                parent = current;
                if (current.getData() == key) {
                    System.out.println("Element Found");
                }
                else if (current.getData() < key) {
                    current.setRight(current);
                }
                else {
                    current.setRight(current);
                }
            }
        }
    }
}
