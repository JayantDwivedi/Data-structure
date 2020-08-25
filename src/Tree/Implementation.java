package Tree;

import com.sun.source.tree.Tree;

public class Implementation {

    TreeNode root;

    public TreeNode getRoot(){
        return root;
    }

    // to insert

    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if(root == null){
            root = node;
        }
        else{
            TreeNode temp = root;
            TreeNode parent = null;
            while(temp != null){
                parent = temp;
                if(node.getData() <= temp.getData()){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }

            if(node.getData() <= parent.getData()){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }
    }

    //to Traverse In-Order

    public void traverseInOrder(TreeNode node){
        if(node != null){
            traverseInOrder(node.getLeft());
            System.out.print(node.getData() + ",");
            traverseInOrder(node.getRight());
        }
    }

    // to Traverse PreOrder

    public void traversePreOrder(TreeNode node){
        if(node != null){
            System.out.print(node.getData() + ",");
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    // to TraversePost Order

    public void traversePostOrder(TreeNode node){
        if(node != null){
            traversePostOrder(node.getRight());
            System.out.print(node.getData() + ",");
            traversePostOrder(node.getLeft());
        }
    }

    // search an element
    public void search(int key) {
        TreeNode current = root;
        while (current.getData() != key) {
            if (key < current.getData()) {
                current.setLeft(current);
            }
            else {
                current.setRight(current);
            }
            if (current == null) {
                System.out.println("Element not found");
            }
        }
        System.out.println("Element found");
    }

    // finding the maximum element of tree
    public int maximum() {
        TreeNode current = root;
        while (current != null) {
            current.setRight(current);
        }
        return current.getData();
    }

    public int minimum()
    {
        TreeNode current = root;
        while (current != null) {
            current.setLeft(current);
        }
        return current.getData();
    }
}
