package Queue;

public class ListImplementation {
    QueueNode head = null;
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public boolean enqueue(int data){
        if(isEmpty()){
            QueueNode newnode = new QueueNode(data);
            head = newnode;
            return true;
        }
        else{
            QueueNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            QueueNode newnode = new QueueNode(data);
            temp.next = newnode;
            return true;
        }
    }

    public void dequeue(){
        if(!isEmpty()){
            QueueNode temp = head;
            head = temp.next;
        }
        else{
            System.out.println("Queue is Empty");
        }
    }

    public int peek(){
        int value = head.getData();
        return value;
    }

    /*public boolean search(int element){
        QueueNode temp = head;
        boolean response = false;
        while(element != temp.getData()){
            temp = temp.next;
        }

    }*/

    public void display(){
        QueueNode temp = head;
        while(temp != null){
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
    }
}
