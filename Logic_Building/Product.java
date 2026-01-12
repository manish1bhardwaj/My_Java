// Find and print the product of all digits of a given number.
package Logic_Building;

public class Product {
    public static void main(String[] args) {
        int num = 49;
        int product = 1;
        while(num>0){
            int lastdigit = num%10;
            product= product*lastdigit;
            num = num/10; 
            
        }
        System.out.println(product);
    }
    
}
