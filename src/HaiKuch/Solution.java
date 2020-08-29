package HaiKuch;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int b = scan.nextInt();   //  kick start 2020 round A
            int[] arr = new int[n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                count = 0;
                for (int k = i; k < n ; k++) {
                    if (arr[i] < b) {
                        count++;
                        if (arr[i] + arr[k] < b) {
                            count++;
                        }
                    }
                }
                list.add(count);
            }
            System.out.println(list);
        }
    }
}
