package DoublyLinkedList;

public class Implementation {
    Node first;
    Node last;

    public Implementation(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        return false;
    }

    public void insertFirst(int data){
        Node newnode = new Node(data);
        if(isEmpty()){
            last = newnode;
        }
        else{
            first.previous = newnode;
        }
        newnode.next = first;
        first = newnode;
    }

    public void insertLast(int data){
        Node newnode = new Node(data);
        if(isEmpty()){
            first = newnode;
        }
        else{
            last.next = newnode;
            newnode.previous = last;
        }
        last = newnode;
    }

    public void displayForward(){
        Node current = first;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void displayBackward(){
        Node current = last;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.previous;

        }
    }
}
