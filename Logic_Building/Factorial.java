// Calculate and print the factorial of a given number.
package Logic_Building;

public class Factorial {
    public static void main(String[] args) {
        int i = 1;
        int num = 3;
        int fact= 1;
        while(i<=num){
            fact = fact*i;
            i++;
        } 
        System.out.print(fact);
    }
}
