package HashSetandTreeset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashAndTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        long initial = System.currentTimeMillis();
        for (int i = 1; i < 10000001; i++) {
            hash.add(i);
        }
        long finalTime = System.currentTimeMillis();

        System.out.println("Time taken by Hash set in insertion : " + (finalTime - initial) + " in mili seconds");

        TreeSet<Integer> trset = new TreeSet<>();

        long initialTree = System.currentTimeMillis();
        for (int i = 1; i < 10000001; i++) {
            trset.add(i);
        }
        long finalTr = System.currentTimeMillis();

        System.out.println("Time taken by Tree Set in insertion " + (finalTr - initialTree) + " in mili seconds");



    }
}
