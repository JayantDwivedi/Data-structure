package GFGLearning;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 16, 20 };
        int[] sumArr = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sumArr[i] = sum;
        }
        System.out.println(Arrays.toString(sumArr));
    }
}
