/*public class Day2 {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.println("Numbers : "+i);
        }
    }
}
*/

/*public class Day2 {
    public static void main(String[] args){
        for(int i=1;i<=20;i++){  // or (int i=2;i<=20;i+=2) no need if cond.
            if(i%2==0){
            System.out.println("Numbers : "+i);
            }
        }
    }
}
*/
/*Print the sum of first N natural numbers (input N)
import java.util.Scanner;
public class Day2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num =sc.nextInt();     //or use direct formula  int sum = N * (N + 1) / 2;
        int i = 1;
        while (i<=num){
            sum=sum+i;
            System.out.println("Numbers : "+i);
            i++;
        }
        System.out.println(sum);
    }
}
*/

/*Print the multiplication table of a number (input from user)
import java.util.Scanner;
public class Day2 {
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        System.out.println("Table of : "+n);
        int num=0;
        int i=1;
        for(i=1;i<=10;i++){
            num = i*n;
            System.out.println(i+ " x " +n + " = " +num);
        }
    }
}
*/
/*Print the factorial of a number (input N → 5 → 5×4×3×2×1 = 120)

import java.util.Scanner;
public class Day2 {
    public static void main(String[] args){
        System.out.print("Factorial of no : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int i = 1;
        // for(int i = 1;i<=n;i++){
        //     num = num*i;
        while(i<=n){
            num=num*i;
            System.out.println(num);  //for direct factorial only print outside the loop.
            i++;
        }
    }
}
*/