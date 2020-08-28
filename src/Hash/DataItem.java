package Hash;

public class DataItem {
    // Data item or say element used to store in hashing
    private int iData;

    // constructor
    public DataItem(int ii){
        this.iData = ii;
    }

    // function used to return element
    public int getKey() {
        return iData;
    }
}
