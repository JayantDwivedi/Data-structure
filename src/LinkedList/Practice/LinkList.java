package LinkedList.Practice;

import JARProcess.Hello;

class LinkList {

    Node1 head = null;
    // insertion from beginning
    public void insert(int data) {
        Node1 node = new Node1(data);
        node.next = head;
        head = node;
    }

    // insertion from last
    public void insertLast(int data) {
        Node1 node = new Node1(data);
        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void display() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkList llist = new LinkList();
        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insertLast(4);
        llist.insertLast(5);
        llist.insertLast(6);

        llist.display();
        Hello.print();
    }
}
