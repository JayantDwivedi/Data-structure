package Hash;

import java.io.IOException;
import java.util.Scanner;

public class MainHash
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);  // scanner object

        DataItem aDataItem;
        int akey, size, n, keysPerCall;
        System.out.print("Enter the size of Hash Table : ");
        size = scan.nextInt();
        HashTableLinerProbing theHashTable = new HashTableLinerProbing(size);  // creating hash table object

        for (int i = 20; i < 35; i++)
        {
            aDataItem = new DataItem(i);    // convert element value to DataItem Object
            theHashTable.insert(aDataItem);  // insert aDataItem of i value
        }

        theHashTable.displayTable();

    }
}
