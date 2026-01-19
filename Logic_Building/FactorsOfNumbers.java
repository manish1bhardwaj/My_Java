// Print all factors of the given number.
package Logic_Building;

public class FactorsOfNumbers {
    public static void main(String[] args) {
        int n = 8;
        int i=1;
        while(i<=n){
            if(n%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
    
}
