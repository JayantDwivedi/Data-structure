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
}
