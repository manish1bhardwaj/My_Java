// . Check whether the given number is a Perfect number.
package Logic_Building;
import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=num/2){
            if(num%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==num){
            System.out.println("Perfect no");
        }
        else{
            System.out.println("Not Perfect");
        }
            sc.close();
        }
    }
}
