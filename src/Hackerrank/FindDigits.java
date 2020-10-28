package Hackerrank;

import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int i = 0; i < test; i++) {
            int num = scan.nextInt();
            int n = num;
            int count = 0;
            int rem = 0;
            while (num > 0) {
                rem = num % 10;
                System.out.println("n : " + rem);
                if ((rem != 0) && (n % rem == 0)) {
                    count++;
                }
                num = num / 10;
            }
            System.out.println("Count : " + count);
        }
    }
}

/*
 https://www.hackerrank.com/challenges/find-digits/problem
 link to the problem statement
*/
