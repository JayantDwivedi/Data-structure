package array;

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int size = scan.nextInt();

        Implementation imp = new Implementation(size);

        System.out.println("Enter the elements of Array: ");

        for(int i = 0; i < size; i++)
        {
            int element = scan.nextInt();
            imp.insert(element);
        }

        // TO SEE THE Inputed array.
        imp.traverse();

        // to search the element
        System.out.println("Enter the element to search");
        int element = scan.nextInt();
        if(imp.search(element) == true )
        {
            System.out.println("Element " + element + " found.");
        }
        else
        {
            System.out.println("Element " + element + " not found.");        }

        // to traverse
      //  imp.traverse();

        // to sort
        int [] sortedArray = imp.sort();

        for(int i = 0 ; i < sortedArray.length;i++)
        {
            System.out.print(sortedArray[i] + " " );
        }
        System.out.println();

        // to traverse
       // imp.traverse();


    }
}