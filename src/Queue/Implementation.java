package Queue;

public class Implementation {
    private int front;
    private int rear;
    private int nItem;
    private int size;
    private int[] queue;

    public Implementation(int s){                    // Constructor to set the values of all the variables.
        front = 0;
        rear = 0;
        nItem = 0;
        size = s;
        queue = new int[s];
    }
     // Getter of all private fields.
    public int getFront(int front){
        return front;
    }

    public int getRear(int rear){
        return rear;
    }

    public int getnItem(int nItem){
        return nItem;
    }

    public int getSize(int size){
        return size;
    }

    public boolean isFull(){                    // To Check whether queue is Empty.
        boolean response = false;
        if(nItem == size){
            response = true;
            return response;
        }
        return response;
    }

    public boolean enqueue(int value){          // To insert the item in queue.
        boolean response = false;
        if(!isFull()){
            queue[rear] = value;
            rear++;
            nItem++;
            response = true;
            return response;
        }
        return response;
    }

    public int dequeue(){
        int value = 0;
        if(!isEmpty()){
            value = queue[front];
            front++;
            nItem--;
            return value;
        }
        return value;
    }

    boolean isEmpty() {
        if(nItem == 0){
            return true;
        }
        return false;
    }

    public int queueSize(){
        return nItem;
    }

    public int peekFront(){
        int value = queue[front];
        return value;
    }

    public int peekRear(){
        int value = queue[rear];
        return value;
    }

}
