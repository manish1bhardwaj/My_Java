// import java.util.Scanner;
// Question 1 : Write a Java method to compute the average of three numbers..
/*public class FunctionSheet {
    public static int Average(int a , int b , int c){
        int Ave = (a+b+c)/3;
        return Ave;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Average(a, b, c);
            System.out.println("Average is" + " = "+ Average(a, b, c));
            sc.close();
        }
    }
    
}
*/


/*Question 2 : Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.*/

// public class FunctionSheet {
//     public static boolean isEven(int n){
//         return n%2==0;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             System.out.println("Number is Even" + " = "+ isEven(n));
//             sc.close();
//     }
    
// }

/*Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321. */

// public class FunctionSheet {
//     public static boolean isPalindrome(int n){
//         int palindrome = 0;
//         int original = n;
//         while(n>0){
//             int Ld = n%10;
//             palindrome = palindrome*10 +Ld;
//             n=n/10;
//         }
//         return palindrome==original;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);{
//         int n = sc.nextInt();
//         if (isPalindrome(n)) {
//             System.out.println(n + " is a palindrome.");
//         } else {
//             System.out.println(n + " is not a palindrome.");
//         }
//         sc.close();
//         }
//     }
// }