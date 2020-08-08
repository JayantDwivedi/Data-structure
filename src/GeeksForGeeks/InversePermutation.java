package GeeksForGeeks;

import java.util.Scanner;

public class InversePermutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int[] arr2 = new int[n];
            int pos = 0, ele = 0;
            for (int i = 0; i < n; i++) {
                ele = arr[i];
                pos = i + 1;
                arr2[ele - 1] = pos;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr2[i] + " ");
            }
            System.out.println();
        }
    }
}
