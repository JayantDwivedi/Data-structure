package HackerEarth;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayingWithNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int mean = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            for (int j = 0; j < n; j++) {
                if (arr[j] >= l && arr[j] <= r) {
                    list.add(arr[j]);
                }
            }
//            System.out.println(list);
            int sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum += list.get(j);
            }
//            System.out.println(sum);
            mean = sum / list.size();
            list.removeAll(list);
            System.out.println(mean);
        }
    }
}
