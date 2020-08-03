package BinarySearch;

public class BinSearch {
    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            }
            else if (arr[mid] > key) {
                high = mid - 1;
            }
            else {
                res = mid;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int key = 80;
        int index = search(arr, key);
        if (index == -1 ) {
            System.out.println("Element not found");
        }
        else  {
            System.out.println("Element found at " + (index + 1) + " place");
        }
    }
}
