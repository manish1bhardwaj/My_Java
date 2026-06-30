package Class_Practice;
import java.util.*;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int esum = 0;
        int osum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                esum+=arr[i];
            }
            else{
                osum+=arr[i];
            }
        }
        // System.out.println(esum);
        System.out.println(osum);
    }
    
}
