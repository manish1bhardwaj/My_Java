/*Pattern 1: Print a solid square of *
import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        System.out.print("Enter no Rows : ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }
}
*/

/*Pattern 2: Right-Angled Triangle 🔺
import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        System.out.print("Enter no Rows : ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }
}
*/

/*Pattern 3: Inverted Right-Angled Triangle using *
import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        System.out.print("Enter no Rows : ");
        int n = sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }
}
*/

/*Pattern 4: Right-Aligned Triangle using *

import java.util.Scanner;
public class Day3{
    public static void main(String[] args){
        System.out.print("Enter number of Rows :");
        Scanner sc = new Scanner(System.in);{
            int n = sc.nextInt();
            sc.close();
            for(int i = 1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
*/

/*Pattern 5: Full Centered Pyramid

import java.util.Scanner;
public class Day3{
    public static void main(String[] args) {
        System.out.print("Enter a Number of Rows : ");
        Scanner sc = new Scanner(System.in);{
            int n = sc.nextInt();
            sc.close();
            for(int i = 1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j = 1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
} 
*/


/*Pattern 6: Full Centered  inverted Pyramid
import java.util.Scanner;
public class Day3{
    public static void main(String[] args) {
        System.out.print("Enter a Number of Rows : ");
        Scanner sc = new Scanner(System.in);{
            int n = sc.nextInt();
            sc.close();
            for(int i = n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j = 1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
} 
*/
/*Pattern 1: Number Pyramid
import java.util.Scanner;
public class Day3{
    public static void main(String[] args) {
        System.out.print("Enter a Number of Rows : ");
        Scanner sc = new Scanner(System.in);{
            int n = sc.nextInt();
            sc.close();
            for(int i = 1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }
                for(int j = 1;j<=i;j++){    //for ascending
                    System.out.print(j+" ");
                }
                for(int j = i-1;j>=1;j--){  // for descending
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
} 
*/

/*Pattern: Full Pyramid with Numbers (Centered)

import java.util.Scanner;
public class Day3{
public static void main(String[] args){
    System.out.print("Enter a row : ");
    Scanner sc = new Scanner(System.in);{
        int n = sc.nextInt();
        sc.close();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    } 
}
*/

/*import java.util.Scanner;
public class Day3{
public static void main(String[] args){
    System.out.print("Enter a row : ");
    Scanner sc = new Scanner(System.in);{
        int n = sc.nextInt();
        int num = 65;
        sc.close();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)num+" ");
                num++;
            }
            System.out.println();
        }
    }

    } 
}
*/

/*the Diamond Alphabet Pattern.

import java.util.Scanner;

public class Day3{
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Top half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Increasing characters
            char ch = (char)('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }

            // Decreasing characters
            ch -= 2; // Step back from last increment
            for (int j = 1; j < i; j++) {
                System.out.print(ch-- + " ");
            }

            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Increasing characters
            char ch = (char)('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }

            // Decreasing characters
            ch -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(ch-- + " ");
            }

            System.out.println();
        }
    }
}
*/


