package Stack;

public class Node {
    int data;
    Node next;

    public void setData(int data){
        this.data = data;
    }
    public Node(int data){
        next = null;
    }

    public int getData() {
        return data;
    }
}
