//    public static int cal(int a,int b){
//     int sum = a+b;
//     return sum;
//    }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);{
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int add = cal(a,b);
//             System.out.println("Sum is"+" "+add );
//             sc.close();
//         }
//     }
    
// }


// public class Day4{
//     public static int Prod(int a, int b){
//         int Product = a*b;
//         return Product;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);{
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int mul = Prod(a,b);
//             System.out.println("Prod is : "+mul);
//             sc.close(); 
//          }
//     }
// }

// Factorial with function

// public class Day4{
//     public static int Factorial(int n){
//         int num = 1;
//         int i = 1;
//         while(i<=n){
//             num=num*i;
//             i++;
//         }
//         return num;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);{
//             int n = sc.nextInt();
//             int fac = Factorial(n);
//             System.out.println(fac);
//             sc.close();
//         }
//     }
// }


// Binomial Coefficient

// public class Day4{
//     public static int Factorial(int n){
//         int num = 1;
//         int i = 1;
//         while(i<=n){
//             num=num*i;
//             i++;
//         }
//         return num;
//     }
//     public static int BinomialC(int n,int r){
//         int fac_n = Factorial(n);
//         int fac_r = Factorial(r);
//         int fac_diff = Factorial(n-r);
//         int bin = fac_n/(fac_r*fac_diff);
//         return bin;
//     }
   
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);{
//             int n = sc.nextInt();
//             int r = sc.nextInt();
//             int result = BinomialC(n, r);
//             System.out.println(result);
//             sc.close();
//         }
        
//     }
// }


// #Function Overloading using Parameter.

// public class Day4{
//     public static int Sum(int a,int b){
//         return a+b;
//     }
//     public static int Sum(int a,int b, int c){
//         return a+b+c;
//     }
//     public static void main(String[] args) {
//         System.out.println(Sum(5,8));
//         System.out.println(Sum(5,8,1));
//     }
// }

// #Function Overloading using DataTypes.

// public class Day4{
//     public static int Sum(int a,int b){
//         return a+b;
//     }
//     public static float Sum(float a,float b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         System.out.println(Sum(5,8));
//         System.out.println(Sum(2.1f,3.2f));
//     }
// }