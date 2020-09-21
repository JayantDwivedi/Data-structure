package HackerEarth;

import java.util.Scanner;

public class VocalRecognisation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String str = scan.next();
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                for (int k = j; k <= str.length(); k++) {
                    String substr = str.substring(j,k);
                    System.out.println(substr);
                    for (int l = 0; l < substr.length(); l++) {
                        if (substr.charAt(i) == 'a' || substr.charAt(i) == 'e' || substr.charAt(i) == 'i' || substr.charAt(i) == 'o' || substr.charAt(i) == 'u') {
                            count++;
                        }
                    }
//                    System.out.println(count);
                }
            }
            System.out.println(count);
//            System.out.println(str.substring(0,6));
        }
    }
}
