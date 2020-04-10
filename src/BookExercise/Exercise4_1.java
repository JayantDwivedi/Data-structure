package BookExercise;


import java.util.Random;
import java.util.Scanner;

public class Exercise4_1
{
    public static void main(String[] args)
    {
       double value = Math.random();
       value*=13;
        //System.out.println(value);
       value++;
       int value1 = (int) value;
        //System.out.println(value);
        System.out.println(value1);
        switch (value1)
        {
            case 1:
                System.out.println("Ace");
                break;
            case 11:
                System.out.println("Jack");
                break;
            case 12:
                System.out.println("Queen");
                break;
            case 13:
                System.out.println("King");
                break;
            default:
                System.out.println(value1);
        }


    }
}
