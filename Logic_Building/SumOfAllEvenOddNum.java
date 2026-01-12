package Logic_Building;

// public class SumOfAllEvenOddNum {
//     public static void main(String[] args) {
//         int i = 1;
//         int n = 10;
//         int sum = 0;
//         while(i<=n){
//             if(i%2==0){
//                 sum+=i;
//                 System.out.println(sum);
//             }
//             i++;
//         }
//     }
    
// }
// For Odd Sum
public class SumOfAllEvenOddNum {
    public static void main(String[] args) {
        int i = 1;
        int n = 10;
        int sum = 0;
        while(i<=n){
            if(i%2==1){
                sum+=i;
                System.out.println(sum);
            }
            i++;
        }
    }
    
}