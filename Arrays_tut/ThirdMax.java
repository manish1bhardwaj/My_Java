import java.util.*;
public class ThirdMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
            third = second;
            second = first;
            first = arr[i];
            }
            else if(arr[i]>second){
                third=second;
                second= arr[i];
            }
            else if(arr[i]>third){
                third = arr[i];
            }
        }
        System.out.println(first);
    }
}
