package GeeksForGeeks;

import java.util.Scanner;

public class RotationArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();         // size of array
        int k = scan.nextInt();         // no of rotation of array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        leftRotate(arr, k);
        leftRotateUsingStrin(arr, k);
    }
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i+(n-k))%n] = arr[i];           // main focus of aaray rotation
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
    public static void leftRotateUsingStrin(int[] arr, int k) {
        int n = arr.length;
        StringBuilder sc = new StringBuilder();
        for (int i = k; i < n; i++) {
            sc.append(arr[i]+" ");
        }
        for (int i = 0; i < k; i++) {
            sc.append(arr[i] + " ");
        }
        sc.append('\n');
        System.out.println(sc);
    }
}
