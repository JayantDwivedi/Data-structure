package Queue;

public class MyQueue {
    public static void main(String[] args) {
 /*       Scanner scan = new Scanner(System.in);

        System.out.println("Enter the maximum size of the Queue");
        int size = scan.nextInt();
*/
       // Implementation obj = new Implementation(90);
        ListImplementation obj1 = new ListImplementation();

        obj1.enqueue(20);
        obj1.enqueue(30);
        obj1.enqueue(40);
        obj1.enqueue(50);
        obj1.enqueue(60);
        obj1.enqueue(70);
        obj1.enqueue(80);
       // obj.display();
        obj1.dequeue();
        obj1.dequeue();
        System.out.println(obj1.peek());

       // System.out.println(obj.peekRear());
        //System.out.println(obj.queueSize());
       // obj.display();
        obj1.display();


    }
}
