// Print the square of each number from 1 to n.
package Logic_Building;

public class SquareOfNumber {
    public static void main(String[] args){
        int n = 10;
        int i = 1;
        int square=0;
        while(i<=n){
            square = i*i; 
            System.out.println(square);
            i++;
        }
    }
}
