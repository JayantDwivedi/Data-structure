package DoublyLinkedListString;

public class Main {
    public static void main(String[] args) {
        Implementation obj = new Implementation();



        obj.insertFirst("Jayant");
        obj.insertFirst("Kartik");
        obj.insertFirst("haiek");

        obj.insertLast(10);
        obj.insertLast(10.34F);
        obj.insertLast(23L);


        obj.display();
    }
}
