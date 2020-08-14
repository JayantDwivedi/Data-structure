package LinkedList.Practice;

public class ImplementationLinkedList {
    Node1 head = null;

    // Insert element at the first of the linked list or before head
    public void insertFirst(int data) {
        Node1 node = new Node1(data);
        node.next = head;
        head = node;
    }

    // Insert element at the last of the linked list
    public void insertLast(int data) {
        Node1 node = new Node1(data);
        if (head == null) {
            node.next = head;
            head = node;
        }
        else {
            Node1 temp = head;
            while (temp.next != null)  {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    // Display or Traversal of Linked List
    public void display() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Search the element in linked list
    public void search(int key) {
        Node1 temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found");
            } else {
                System.out.println("Element Not Found");
            }
            temp = temp.next;
        }
    }

    // Try to make a function after which you insert the element in linked list
    public void insertAfterEle(int ele, int data) {
        if (head != null) {
            Node1 temp = head;
            Node1 node = new Node1(data);
            while (temp != null) {
                if (temp.data == ele) {
                     Node1 temp1  = temp.next;
                     temp.next = node;
                     node.next = temp1;
                }
                temp = temp.next;
            }
        }
        else {
            System.out.println("Linked list is Empty");
        }
    }

    // Delete after this particular element
    public void deleteEle(int ele) {
        if (head != null){
            Node1 temp = head;
            while (temp.next.data != ele) {
                temp = temp.next;
            }
            Node1 temp1 = temp.next.next;
            temp.next = temp1;
        }
        else {
            System.out.println("Linked List is empty");
        }
    }

    //print list in reverse order
    public static void reversePrint(Node1 head) {
        reversePrint(head.next);
        System.out.println(head.data + " --> ");
    }

    /* In case of c and cpp there is no concept of garbage collector
     so we need to delete linked list one by one but in case of java there is
    a concept of garbage collector so we delete the entire list at a time
     */
    // delete the whole list
    public void deleteWhole() {
         head = null;
    }

    //(Iterative) count the length of the Linked List
    public int findLength() {
        Node1 temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // (Recursive) count the length of the linked list
    public int findLengthRec(Node1 head) {
        if (head == null) {
            return 0;
        }
        else {
            return 1 + findLengthRec(head.next);
        }
    }

    /* Delete a particular node without using head node*/
    public void delete(Node1 node) {
        if (node.next == null) {
            node = null;
        }
        else {
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }

    // print n the element from last of the linked list
    public int nfromLast(int n) {
        int len = findLength();
        int nfront = len - n + 1;    // return the value from the front of the element
        Node1 current = head;
        int count = 1;
        while (current != null) {
            if (count == 0) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        assert(false);
        return 0;
    }
    // end all the functions
    public static void main(String[] args) {
        ImplementationLinkedList obj = new ImplementationLinkedList();
//        for (int i = 1; i < 5; i++) {
//            obj.insertFirst(i);
//        }
        for (int i = 1; i < 5; i++) {
            obj.insertLast(i);
        }
        obj.insertAfterEle(3,5);
        obj.display();
        obj.deleteEle(3);
        obj.display();
        int n = obj.findLength();
        System.out.println("Length of linked list :  " + n);
        int lastData = obj.nfromLast(3);
        System.out.println("Nth from the last " + lastData);
    }
}
