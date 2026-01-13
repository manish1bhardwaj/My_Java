// Find and print the sum of digits of the given number.
package Logic_Building;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1568;
        int sum =0;
        while(num>0){
            int LD = num%10;
            sum+=LD;
            num = num/10;
        }
        System.out.println(sum);
    }
    
}
