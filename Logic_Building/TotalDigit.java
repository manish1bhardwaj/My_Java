// Count and print the total number of digits in a given number
package Logic_Building;

public class TotalDigit {
    public static void main(String[] args) {
        int num = 12345;
        int i=0;
        while(num>0){
            i++;
            num = num/10;
        }
        System.out.println(i);
    }
}
