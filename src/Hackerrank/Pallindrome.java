package Hackerrank;

import java.util.Scanner;

public class Pallindrome
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        StringBuilder str1 = new StringBuilder(str);
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                System.out.println("Pallindrome");
            }
        }
        System.out.println(str1);
        System.out.println(str2);
    }
}
