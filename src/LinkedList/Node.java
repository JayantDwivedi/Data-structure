package LinkedList;

public class Node {
    private int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public int getData(){
        return data;
    }

   /* public void display(){                   // This is also used for display the Linked List
        System.out.print(data + " ");
    }

    */
}
