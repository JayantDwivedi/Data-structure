package JumpSearch;

public class JumpSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int n = arr.length;
        int key = 40;   // key to be searched
        int index = search(arr, key);
        if(index != -1) {
            System.out.println("Element found at" + index +" index");
        }
        else {
            System.out.println("Element not found");
        }
    }
    public static int search(int[] arr, int key) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        while (arr[step] < key) {

        }
        return -1;
    }
}
