import java.util.*;

public class Review {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4, -6, -7,9,8};
        int[] result = rearrange(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rearrange(int[] arr) {
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        int p = 0, n = 0;
        for (int num : arr) {
            if (num >= 0) pos[p++] = num;
            else neg[n++] = num;
        }
        int[] result = new int[arr.length];
        int i = 0, pi = 0, ni = 0;
        while (pi < p && ni < n) {
            result[i++] = pos[pi++];
            result[i++] = neg[ni++];
        }
        // Add remaining positive numbers
        while (pi < p) {
            result[i++] = pos[pi++];
        }
        // Add remaining negative numbers
        while (ni < n) {
            result[i++] = neg[ni++];
        }
        return result;
    }
}
