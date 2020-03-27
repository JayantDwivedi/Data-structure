package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            int num = scan.nextInt();
            arr[i] = num;
        }

        Arrays.sort(arr);

      /*  for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
      */
       // int sum = 0;
        int min = 0;
        int max = 0;

        for(int j = 0; j < 4; j++){
            min = min + arr[j];
        }
        for(int k = 1; k < 5; k++){
            max = max + arr[k];
        }
        System.out.println("Minimum " + min);
        System.out.println("Maximum " + max);

    }
}
