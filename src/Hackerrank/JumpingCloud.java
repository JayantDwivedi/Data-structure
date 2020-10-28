package Hackerrank;

import java.util.Scanner;

public class JumpingCloud {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] cloud = new int[size];
        int step = scan.nextInt();
        for (int i = 0; i < size; i++) {
            cloud[i] = scan.nextInt();
        }

        int energy = 100;
        int i = 0;
//        System.out.println((i+step)%size);
        while ((i+step)%size >= 0) {
//            System.out.println((i+step)%size);
            energy -= 1;
            if (cloud[(i+step)%size] == 1){
                energy -= 2;
            }
            if ((i+step)%size != 0) {
                i = i + step;
            }else {
                break;
            }
        }
        System.out.println(energy);
    }
}
// https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
