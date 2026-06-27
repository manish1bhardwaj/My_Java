package Class_Practice;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
        
    for(int i = 0;i<=n;i++){
        arr[i] = sc.nextInt();
        }
    int lar = 0;
    for(int j = 0;j<=arr.length;j++){
        if(arr[j] >lar){
            lar = arr[j];
            }
        }
        System.out.println(lar);
    } 
}
