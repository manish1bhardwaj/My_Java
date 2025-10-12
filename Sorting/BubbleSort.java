import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter numbers ");
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        BubbleSort(a);
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
    static void BubbleSort(int[] a){
        int n = a.length;
        boolean flag = false;
        for(int i = 0;i<n-1;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
}
