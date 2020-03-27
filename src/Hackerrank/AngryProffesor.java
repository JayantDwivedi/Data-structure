package Hackerrank;

import java.util.Scanner;

public class AngryProffesor {
    static String angryProfessor(int k, int[] a){
        String s = "YES";
        int count = 0;
        for(int value:a){
            if(value <= 0){
                count++;
            }
        }
        System.out.println(count);

        if(count >= k){
            return s = "NO";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i = 0; i < t; i++){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];

            for(int j = 0; j < n;j++){
                a[j] = scan.nextInt();
            }
            System.out.println(angryProfessor(k,a));
        }

    }
}
