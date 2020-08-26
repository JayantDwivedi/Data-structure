package Tree;

import Tree.Implementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Implementation tree = new Implementation();

        boolean response = true;

        tree.insert(30);
        tree.insert(20);
        tree.insert(60);
        tree.insert(10);
        tree.insert(25);
        tree.insert(50);
        tree.insert(70);

        System.out.println("InOrder Traversal");
        tree.traverseInOrder(tree.getRoot());
        System.out.println();

        System.out.println("Pre Order Traversal");
        tree.traversePreOrder(tree.getRoot());
        System.out.println();

        System.out.println("Post Order Traversal");
        tree.traversePostOrder(tree.getRoot());
        System.out.println();

        System.out.println("Search the element Enter key");
        int key = scan.nextInt();
        System.out.println(tree.search(key)?"Match found" : "Not found");
//        tree.search(70);
//        System.out.println("Maximum Element");
//        tree.maximum();
//
//        System.out.println("Minimum Element");
//        tree.minimum();

//        tree.getterLeft();
//        tree.getterRight();
//
//        tree.setterRight();

    }
}
