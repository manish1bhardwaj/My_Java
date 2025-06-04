// import java.util.*;
// Binary to Decimal.
// public class BinaryToDecimal {
//     public static void BinTODec(int n){
//         int Bin = n;
//         int pow = 0;
//         int D = 0;
//         while(n>0){
//             int LastD = n%10;
//             D = D+(LastD*(int)Math.pow(2,pow));
//             pow++;
//             n = n/10;
//         }
//         System.out.println("Decimal of "+ Bin + " = " + D);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);{
//             int n = sc.nextInt();
//             BinTODec(n); 
//             sc.close(); 
//         }
//     }
// }


// public class BinaryToDecimal {
//     public static void DecToBin(int n){
//         int Dec = n;
//         int pow = 0;
//         int B = 0;
//         while(n>0){
//             int rem = n%2;
//             B= B+(rem*(int)Math.pow(10,pow));
//             pow++;
//             n = n/2;
//         }
//         System.out.println("Binaryof "+ Dec + " = " + B);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);{
//             int n = sc.nextInt();
//             DecToBin(n); 
//             sc.close(); 
//         }
//     }
// }
