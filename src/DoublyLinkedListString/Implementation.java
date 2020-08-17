package DoublyLinkedListString;

public class Implementation<E> {
    Node<E> first;
    Node<E> last;

    public Implementation() {
        first = null;
        last = null;
    }

    public void insertFirst(E name) {
        Node<E> newnode = new Node<E>(name);
        if (first == null) {
            last = newnode;
        }
        else {
            first.previous = newnode;
        }
        newnode.next = first;
        first = newnode;
    }

    public void insertLast(E name) {
        Node<E> newnode = new Node<E>(name);
        if (first == null) {
            first = newnode;
        }
        else {
            last.next = newnode;
            newnode.previous = last;
        }
        last = newnode;
    }

    public void display() {
        Node<E> temp = first;
        while (temp != null) {
            System.out.print(temp.name + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
