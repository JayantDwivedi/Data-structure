package TreePractice;

public class MyTreeMain {
    public static void main(String[] args) {
        Implementation obj = new Implementation();
//        Implementation tree = new Implementation();
        obj.insert(10);
        obj.insert(20);
        obj.insert(5);
        obj.insert(3);
        obj.insert(7);
        obj.insert(30);
        obj.insert(15);

        System.out.println("Pre Order Traversal");
        obj.postOrder(obj.getRoot());
        System.out.println();

        System.out.println("Post Order Traversal");
        obj.postOrder(obj.getRoot());
        System.out.println();

        System.out.println("In Order Traversal");
        obj.inOrder(obj.getRoot());
        System.out.println();

        obj.search(7);
    }
}
