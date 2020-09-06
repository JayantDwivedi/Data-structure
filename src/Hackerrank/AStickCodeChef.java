package Hackerrank;
import  java.util.*;

public class AStickCodeChef {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            for (int i = 0; i < t; i++) {
                int n = scan.nextInt();
                int[] arr = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = scan.nextInt();
                }

                 Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
                Set<Integer> set = new TreeSet<>();
                for (int x: arr) {
                    if (x != 0) {
                        set.add(x);
                    }
                }
                System.out.println(set);
                System.out.println(set.size());
            }
        }catch(Exception e) {
            return;
        }
    }
}
