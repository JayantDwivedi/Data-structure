package HackerEarth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MagicalWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 65; i <122 ; i++) {
            boolean isPrime = true;
            for (int j = 2; j < (int)Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                list.add(i);
            }
        }
        Collections.sort(list);
        System.out.println(list);   // list of all prime between 65 to 122
        int n = scan.nextInt();
        String str = scan.next();
        for (int i = 0; i < n; i++) {
            int aciiValue = (int) str.charAt(i);
            int lower = 0;
            int upper = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) < aciiValue) {
                    lower = list.get(j);
//                    continue;
                }
            }

            for (int j = 1; j <= list.size(); j++) {
                if(list.get(list.size() - j)> aciiValue) {
                    upper = list.get(list.size() - j);
//                    continue;
                }
            }

//            System.out.println("Lower: " + lower);
//            System.out.println("Upper: " + upper);

            StringBuilder sb = new StringBuilder();
            if (Math.abs(aciiValue - upper) == Math.abs(aciiValue - lower)) {
                char c = (char) lower;
                sb.append(c);
            }
            if (Math.abs(aciiValue - upper) < Math.abs(aciiValue - lower)) {
                char c = (char) upper;
                sb.append(c);
            }
            if (Math.abs(aciiValue - upper) > Math.abs(aciiValue - lower)) {
                char c = (char) lower;
                sb.append(c);
            }

            System.out.print(sb);
        }
    }
}
