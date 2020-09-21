package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class AdaMatrix {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            for (int i = 0; i < t; i++) {
                int n = scan.nextInt();
                int[][] arr = new int[n][n];
                int[] newArr = new int[n*n];

                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        arr[j][k] = scan.nextInt();
                    }
                }
                int index = 0;
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        newArr[index] = arr[k][j];
                        index++;
                    }
                }
                /*
                //Printing array
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        System.out.print(arr[j][k] + " ");
                    }
                    System.out.println();
                }

                 */
//                System.out.println(Arrays.toString(newArr));
                index = 0;
                int count = 0;
                for (int j = 1; j <= n*n; j++) {
                    if (newArr[index] != j) {
                        count++;
                    }
                    index++;
                }
                System.out.println(count);
            }

        }
        catch (Exception e) {
            return;
        }
    }
}
