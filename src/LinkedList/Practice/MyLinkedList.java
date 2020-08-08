package LinkedList.Practice;

public class MyLinkedList {
    public static void main(String[] args) {
        Node first, second, third, forth;
        first = new Node(1);
        second = new Node(2);
        third = new Node(3);
        forth = new Node(4);

        first.next = second;
        second.next = third;
        third.next = forth;

        second.prev = first;
        third.prev = second;
        forth.prev = third;

        Node temp = first;

        System.out.println("Front Traverse");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Reverse Traversal");

        Node last = forth;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
//        System.out.println(third.next.data);
//        System.out.println(forth.prev.data);

    }
}
class Node {
    int data;
    Node next;
    Node prev;
    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
