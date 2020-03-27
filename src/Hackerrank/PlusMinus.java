package Hackerrank;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int [] arr = new int[T];

        for(int i = 0; i < T; i++){
            int data = scan.nextInt();
            arr[i] = data;
        }

        double posCount = 0;
        double negCount = 0;
        double zeroCount = 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[j] > 0){
                posCount++;
            }else
                if(arr[j] < 0){
                    negCount++;
                }else{
                    zeroCount++;
                }
        }
        System.out.printf("%.6f %n",posCount/arr.length);

        System.out.printf("%.6f %n",negCount/arr.length);

        System.out.printf("%.6f %n",zeroCount/arr.length);

    }
}
