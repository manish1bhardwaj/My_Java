// Print all numbers between a and b that are divisible by 7.
package Logic_Building;

public class DivisibleBy7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        int count=0;
        while(a<=b){
            if(a%7==0){
                System.out.println(a);
            }
            a++;   
        }
    }
}
