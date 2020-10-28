package Hackerrank;

import java.util.Scanner;
/*
This one is the question of TCS NQT exam 2020.
Problem : Print fibonacci sequence upto given range, range must be greater than 5 and less or equals to 20
then you have to count the no of even terms and odd terms in that sequence
Input : 7
Output : 1 1 2 3 5 8 13
         2
         5
 */

public class TCSNQT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range =  scan.nextInt();
        if ((range <= 20) && (range > 5)) {
            int a = 1;
            int b = 1;
            System.out.print(a + " ");
            System.out.print(b + " ");
            int countEven = 0, countOdd = 2;
            for (int i = 2; i < range; i++) {
                int c = a + b;
                System.out.print(c + " ");
                if (c % 2 == 0 ) {
                    countEven++;
                }
                else{
                    countOdd++;
                }
                a = b;
                b = c;
            }
            System.out.println();
            System.out.println("Even : " + countEven);
            System.out.println("Odd : " + countOdd);
        }else {
            System.out.println();
        }
    }
}
