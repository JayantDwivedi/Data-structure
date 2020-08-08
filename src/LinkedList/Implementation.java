package LinkedList;

public class  Implementation {

    Node head = null;

    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public Node deleteFirst(){
        Node temp = head;
        head = head.next;
        return temp;
    }

    public void displayList(){
        Node current = head;
        while(current != null){
           int value = current.getData();
            current = current.next;
            System.out.print(value + " ");
        }
        System.out.println();
    }
    // insert at last

    public void insertLast(int data){
        Node temp = head;
        Node node = new Node(data);
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    /*public void deleteLast(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

    }*/

    // searching
    public boolean searching(int value) {
        Node temp = head;
        while (temp.getData() != value) {
            if(temp.getData() == value){
                return true;

            }
            else{
                temp = temp.next;
            }

        }
        return false;
    }
}
