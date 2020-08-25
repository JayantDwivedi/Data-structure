package Stack;

public class StackMain {
    public static void main(String[] args) {

        int size = 5;

        //ArrayImplementation stack = new ArrayImplementation(size);
        ListImplementation stacks = new ListImplementation();

       /* stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        System.out.println(stack.peek());

        stack.display();
        */
        stacks.pushll(10);
        stacks.pushll(20);
        stacks.pushll(30);


        //stacks.pop();

    }
}
