package Hackerrank;


import java.util.Scanner;

public class Anangram
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        int[] Acount = new int[26];
        int[] Bcount = new int[26];

        for (int i = 0; i < a.length(); i++) {
            Acount[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            Bcount[b.charAt(i) - 'a']++;
        }

//        System.out.println("A count array " + Arrays.toString(Acount));
//        System.out.println("B count array " + Arrays.toString(Bcount));

        int response = 0;
        for (int i = 0; i < 26; i++) {
            response += Math.abs(Acount[i] - Bcount[i]);
        }
        System.out.println(response);
    }
}
