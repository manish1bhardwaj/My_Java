// 25. Find and print the sum of all factors of the given number.
package Logic_Building;

public class SumOfFactors {
    public static void main(String[] args){
        int n = 8;
        int i = 1;
        int sum = 0;
        while(i<=n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
    
}
