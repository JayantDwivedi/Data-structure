package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindEle {
    public static void main(String[] args) {
        // This program is finding element greater and smaller than the given element from the list
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(40,30,80,60,10,20,90));
        System.out.println(list);
        Collections.sort(list);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lower = 0, upper = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < n) {
                lower = list.get(i);
                continue;
            }
        }
        for (int i = 1; i <= list.size(); i++) {
            if(list.get(list.size() - i)  > n) {
                upper = list.get(list.size() - i);
                continue;
            }
        }
        System.out.println(lower);
        System.out.println(upper);

    }
}
