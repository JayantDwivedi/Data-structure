package LinkedList.Practice;

public class CircularLinkedList {

    Node1 head = null;
    void insert(int data) {
        Node1 node = new Node1(data);
        if (head == null) {
            head = node;
            node.next = head;
        }
        else {
            Node1 temp = head;
            head = node;
            node.next = temp;
            temp.next = head;
        }
    }

    void display() {
        Node1 temp = head;
        if (head != null) {
            do {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }while(temp != head);
        }
        else {
            System.out.println("Circular Linked List is Empty");
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50 );
        cll.display();
    }
}

