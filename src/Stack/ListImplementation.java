package Stack;

public class ListImplementation {

    Node head = null;

    public boolean isEmpty(){
        return head == null;
    }

    public void pushll(int data){
        Node node;
        node = new Node(data);
        //node.setData(data);
        node.next = head;
        head = node;
    }

    public void pop(){
        head = head.next;
    }

    public Node peek(){
        return head;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            int value = temp.getData();
            temp = temp.next;
            System.out.print(value + " ");

        }

    }
}
