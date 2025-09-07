import java.util.Scanner;

public class L_Search {
    private static boolean search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        boolean result = search(arr, target);
        System.out.println(result);
        sc.close();
    }
}
