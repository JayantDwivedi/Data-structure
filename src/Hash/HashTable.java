package Hash;

import javax.xml.crypto.Data;

class HashTableLinerProbing {
    // three parameters
    private DataItem[] hashArray;
    private int arrSize;
    private DataItem nonItem;

    // constructor
    public HashTableLinerProbing(int size) {
        arrSize = size;                     // takes input of size of array
        hashArray = new DataItem[arrSize];  // create an array of size using dataitem
        nonItem = new DataItem(-1);      // make nonItem = -1;
    }

    // function for display hashtable
    public void displayTable() {
        System.out.println("Table: ");
        for (int i = 0; i < arrSize; i++) {          // traverse from 0 to size of array
            /*
            Print only those element which contains some value in
            hashtable those which is null not printed here
             */
            if(hashArray[i] != null) {
                System.out.print(hashArray[i].getKey() + " ");
            }
            else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }

    /*
    This is the main part of hash table or hashing it is the function which is used
    convert an element to the hash value
     */
    public int hashFunc(int key) {
        return key % arrSize;
    }

    // Insertion in hashtable
    public void insert(DataItem item)   // assume that table is not empty
    {
        int key = item.getKey();        // extracting key
        int hashvalue = hashFunc(key);  // hash the key
        //until empty cell or -1 is hit
        while (hashArray[hashvalue] != null && hashArray[hashvalue].getKey() != -1)
        {
            ++hashvalue;               // go to next cell
            hashvalue %= arrSize;      // wrap the content inside the array size
        }
        hashArray[hashvalue] = item;   // insert item
    }

    // Deletion in hash table
    public DataItem delete(int key)
    {
        int hashvalue = hashFunc(key);   // hash the key
        while (hashArray[hashvalue] != null)
        {
            if (hashArray[hashvalue].getKey() == key)   // check the value of each element from hashtable
            {
                DataItem temp = hashArray[hashvalue];  // save item to temp Dataitem
                hashArray[hashvalue] = nonItem;        // delete the item
                return  temp;                           // return the deleted item
            }
            ++hashvalue;            // increse hash value
            hashvalue %= arrSize;    // wrap the hash value
        }
        return null;                // means element not found
    }

    // find the data item
    public DataItem find(int key)
    {
        int hashvalue = hashFunc(key);          // take hash value
        while (hashArray[hashvalue] != null)       // until empty
        {
            if (hashArray[hashvalue].getKey() == key)
            {
                return hashArray[hashvalue];        // value find and return the value
            }
            ++hashvalue;    // increment hash value
            hashvalue %= arrSize;           // wrap the hashvalue in array size
        }
        return null;            // element not found;
    }
}
