package array;

public interface Array
{
    // to insert the element in array
    boolean insert(int addElement);

    // to check whether the array is full or not
    boolean isFull();

    // to delete the given element in array
    boolean delete(int delElement);

    // to traverse the all element of array
    void traverse();

    // to search the element of the array
    boolean search(int searchElement);

    // to sort the array
    int[] sort();

    // to check whether the array is empty
    boolean isEmpty();

}
