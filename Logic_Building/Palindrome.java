// Check whether the given number is a palindrome
package Logic_Building;

public class Palindrome {
    public static void main(String[] args) {
        int num = 101;
        int temp = num;
        int re = 0;
        while(temp!=0){
            int ld = temp%10;
            re = re*10+ld;
            temp = temp/10;
        }
        System.out.println("Number is Palindrome : "+" "+re);
    }
    
}
