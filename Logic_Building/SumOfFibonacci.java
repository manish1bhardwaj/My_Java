// Find and print the sum of the Fibonacci series up to n terms.
package Logic_Building;
import java.util.*;

public class SumOfFibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=a;
            int next  = a+b;
            a=b;
            b=next;
            
        }
        System.out.println(sum);
    }
    
}
