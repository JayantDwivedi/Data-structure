package Hash;

import javax.xml.crypto.Data;

public class HashTableQuardraticProbing
{
    private DataItem[] hashArray;   // array is the hash table
    private int arraySize;
    private DataItem nonItem;       // for deleted items

    public HashTableQuardraticProbing(int size)
    {
        this.hashArray = new DataItem[arraySize];
        this.arraySize = size;
        this.nonItem = new DataItem(-1);         // non item means data item contains -1
    }


    // display hashtable
    public void displayTable()
    {
        System.out.print("Hash table using quardratic probing");
        for (int i = 0; i < arraySize; i++)
        {
            if (hashArray[i] != null)
            {
                System.out.println(hashArray[i].getKey() + " ");
            }
            else
            {
                System.out.print("** ");
            }
        }
        System.out.print("");
    }

    // hash function for quardratic probing
    public int hashFunction1(int key)
    {
        return key % arraySize;
    }
    public int hashFunction2(int key)
    {
        /*
        non zero, less than array size, diffrent from hF1
        array size must be relatively prime to 5, 4, 3, 1
         */
        return 5 - key % 5;
    }

    // insert function in quardratic probing
    public void insert(int key, DataItem item)
    {
        int hashvalue = hashFunction1(key);
        int stepCount = hashFunction2(key);
        while(hashArray[hashvalue] != null && hashArray[hashvalue].getKey() != 1)
        {
            hashvalue += stepCount;     // add the step
            hashvalue %= arraySize;     // for waparound
        }
        hashArray[hashvalue] = item;    // add item to hash table
    }

    // Delete function
    public DataItem delete (int key)
    {
        int hashvalue = hashFunction1(key);
        int stepCount = hashFunction2(key);
        while (hashArray[hashvalue] != null)
        {
            if (hashArray[hashvalue].getKey() == key)
            {
                DataItem temp = hashArray[hashvalue];
                hashArray[hashvalue] = nonItem;
                return temp;
            }
            hashvalue += stepCount;
            hashvalue %= arraySize;
        }
        return null;
    }


    // find or search function
    public DataItem find(int key)
    {
        int hashValue = hashFunction1(key);
        int stepCount = hashFunction2(key);
        while (hashArray[hashValue] != null)
        {
            if (hashArray[hashValue].getKey() == key)
            {
                return hashArray[hashValue];
            }
                hashValue += stepCount;
                hashValue %= arraySize;
        }
        return null;
    }
}
