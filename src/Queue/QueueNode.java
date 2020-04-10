package Queue;

public class QueueNode {
    private int data;
    QueueNode next;

    public QueueNode(int data){
        this.data = data;
        this.next = null;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }
}
