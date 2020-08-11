package CountingSort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1,4,1,2,7,5,2};            // choose element from 0 to 9
        System.out.println("Unsorted --> " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted --> " + Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];     // new Array to store output
        int[] count = new int[9];       // array to count the occurance of element

        // initialise count with 0
        for (int i = 0; i < 9; i++) {
            count[i] = 0;
        }

        // count the occurrance of every element
        for (int i = 0; i < n; i++) {
            ++count[arr[i]];
        }

        // change the count[i] now contain actual position of this character
        // in output array
        for (int i = 1; i <= 9; i++) {
            count[i] += count[i - 1];
        }

        // build output array
        for (int i = n-1 ; i > 0; i--) {
            newArr[count[arr[i]] - 1] = arr[i];
            --count[i];
        }

        // because we void
        for (int i = 0; i < n; i++) {
            arr[i] = newArr[i];
        }
    }
}
