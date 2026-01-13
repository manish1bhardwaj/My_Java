// Reverse the given number and print the reversed value.
package Logic_Building;

public class ReverseNumber{
    public static void main(String args[]){
        int num = 12567;
        int reversed= 0;
        while(num>0){
            int LD = num%10;
            reversed = reversed*10+LD;
            num = num/10;
        }
        System.out.println(reversed);
    }
}