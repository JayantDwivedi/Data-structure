package Hackerrank;

import java.util.Scanner;

public class BirthdayCakeCandle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        int[] arr = new int[T];

        for(int i = 0; i < T; i++){
            int data = scan.nextInt();
            arr[i] = data;
        }

        int max = arr[0];
        int count = 0;

        for(int j = 0; j < arr.length; j++){
            if( arr[j] > max) {
                max = arr[j];
            }
        }
        for(int k = 0; k < arr.length; k++){
            if(arr[k] == max){
                count++;
            }
        }
        System.out.println("No of Maximum Candles " + count);
    }
}
