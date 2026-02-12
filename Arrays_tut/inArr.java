import java.util.*;
public class inArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        
        //Taking input in array using for loop
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        // 3 ways to print array

        // 1. print all element of array using for loop

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
            
        // }

        // 2.Enchance loop/for each loop.
        //  for (int num : arr) {
        //     System.out.print(num +" ");
            
        // }

        // 3. best way 
        System.out.println(Arrays.toString(arr));
    }
}
