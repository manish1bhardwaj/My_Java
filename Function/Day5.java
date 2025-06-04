// Possible Prime Number question. with Function
// Check Number is Prime Or Not..
// import java.util.Scanner;
// public class Day5 {
//     public static boolean isPrime(int n){
//     //Special Case if Asked also known as corner cases.
//     //only for n>=2
//     if(n==2){
//         return true;
//     }
//         for(int i = 2;i<=n-1;i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);{
//             int n = sc.nextInt();
//             System.out.println("This Number is Prime"+" "+isPrime(n));
//             sc.close();
//         }
//     }
// }


// Check Number is Prime Or Not..(Optimized approach)
import java.util.*;
// public class Day5 {
//     public static boolean isPrime(int n){
//     //Special Case if Asked also known as corner cases.
//     //only for n>=2
//     if(n==2){
//         return true;
//     }
//         for(int i = 2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);{
//             int n = sc.nextInt();
//             System.out.println("This Number is Prime"+" "+isPrime(n));
//             sc.close();
//         }
//     }
// }


// Check Number is Prime in Range

public class Day5 {
    public static boolean isPrime(int n){
    //Special Case if Asked also known as corner cases.
    //only for n>=2
    if(n==2){
        return true;
    }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeinRange(int n){
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int n = sc.nextInt();
            System.out.println("These Numbers are Prime");
            PrimeinRange(n);
            sc.close();
        }
    }
}