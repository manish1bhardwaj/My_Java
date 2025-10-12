package Recursion;
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(pow(n, m, 1));
    }

    private static int pow(int n, int m, int ans) {
        if (m == 0) return ans;
        return pow(n, m - 1, ans * n);
    }
}
