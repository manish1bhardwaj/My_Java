// Print all prime numbers between 1 and 100.
package Logic_Building;

public class PrimeNumber {
    public static void main(String[] args) {
       int num = 2;
       while(num<=100){
       int i =2;
       boolean isprime = true;
            while(i*i<=num){
                if(num%i==0){
                    isprime=false;
                    break;
                }
                i++;
            }
            if(isprime){
                System.out.println(num+" ");
            }
            num++;
       }
    }
    
}
