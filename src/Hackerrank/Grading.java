package Hackerrank;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int[] arr = new int[T];

        for(int i = 0; i < T; i++){        //Insert Element in array.
            int data = scan.nextInt();
            arr[i] = data;
        }

        for(int j = 0; j < arr.length; j++) {
            if (arr[j] >= 38) {
                if (arr[j] + (5 - arr[j] % 5) - arr[j] < 3) {
                    arr[j] = (arr[j] + (5 - arr[j] % 5));
                }
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
