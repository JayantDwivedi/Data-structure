package BookExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ShiftCipherEncryption {
    public static void main(String[] args) {
        /* This is not working we have to use an Array of Alphabets for circulation,
         */
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();

        String str = scan.nextLine();
        int acii = 0;
        for(int i = 0; i < str.length(); i++){
            int ascii = str.charAt(i);
            int cipherValue = ascii + 20;    // 20 is the key.
            char character = (char) cipherValue;
            list.add(character);
        }
        System.out.println(list);
    }
}
