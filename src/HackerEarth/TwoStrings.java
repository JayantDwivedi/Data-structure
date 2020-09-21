package HackerEarth;


import array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TwoStrings
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String str1 = scan.next();
            String str2 = scan.next();
            char[] arrStr1 = str1.toCharArray();
            char[] arrStr2 = str2.toCharArray();
            System.out.println(Arrays.equals(arrStr1,arrStr2));
            Collections.addAll(list);

        }
    }
}
