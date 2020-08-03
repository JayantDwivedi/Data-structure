package Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(arr));
    }
}
