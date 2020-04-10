package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Implementation obj = new Implementation();
        obj.insertFirst(10);
        obj.insertFirst(20);
        obj.insertFirst(30);
        obj.insertFirst(40);
        obj.insertFirst(50);

        obj.insertLast(60);
        obj.insertLast(70);


        System.out.println("Forward Traversal");
        obj.displayForward();

        System.out.println();
        System.out.println("Backward Traversal");
        obj.displayBackward();



    }
}
