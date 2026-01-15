// Check whether the given number is a prime number.
package Logic_Building;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0 || num==1){
            System.out.println("not prime");
            return;
        }
            int i = 2;
            boolean isprime = true;
            while(i*i<=num){
                if(num%i==0){
                    isprime=false;
                    break;
                }
                i++;
            }
            if(isprime){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    }
