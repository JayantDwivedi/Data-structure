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
    public boolean search(int key)
    {
        TreeNode current = root;
        boolean response = false;

        while (current != null)
        {
            if (current.getData() < key)
            {
                current = current.getRight();
            }
            else if (current.getData() > key)
            {
                current = current.getLeft();
            }
            else
            {
                response = true;
                break;
            }
//            System.out.println(current.getData());
        }
        return response;
    }

    // finding the maximum element of tree
    public int maximum() {
        TreeNode current = root;
        while (current != null) {
            current = current.getRight();
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

    // TRY TO UNDERSTAND GETTER
    public void getterRight() {
        TreeNode current = root;
        current = current.getLeft().getRight().getRight();
        System.out.println(current.getData());
    }
    public void getterLeft() {
        System.out.println(root.getLeft().getData());
    }

    public void setterRight() {
        TreeNode current = root;
        System.out.println("Current without operation " + current.getData());
        current.setRight(current);
        System.out.println("Current after setRight " + current.getData());
    }
}
