package DoublyLinkedListString;

public class Node<E> {
    E name;
    Node<E> next;
    Node<E> previous;

    public Node(E name) {
        this.name = name;
        this.next = null;
        this.previous = null;
    }
}
