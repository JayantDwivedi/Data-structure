package Hackerrank;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String time12hrs = scan.nextLine();

        String h = time12hrs.substring(0,2);
        int hrs = Integer.parseInt(h);
        //System.out.println(hrs);

        String m = time12hrs.substring(3,5);
        int min = Integer.parseInt(m);
        String mintime = String.format("%02d",min);
        //System.out.println(min);

        String s = time12hrs.substring(6,8);
        int sec = Integer.parseInt(s);
        //System.out.println(sec);

        if(time12hrs.contains("PM")){
            hrs = hrs + 12;
        }
       System.out.printf("%02d:%02d:%02d",hrs,min,sec);
       // String out = ("%02d:%02d:%02d",hrs,min,sec);
    }
}
