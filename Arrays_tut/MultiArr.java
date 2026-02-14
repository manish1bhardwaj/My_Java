package Arrays_tut;
import java.util.*;

public class MultiArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        // int num[][] = new int[3][3];
        // int[][] arr2D = {
        //     {1,2,3},
        //     {4,5},
        //     {7,8,9,10}
        // };
        //Taking input in 2D array
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        //input
        for(int row=0;row<arr.length;row++){
            //for each col in every row
            for(int col = 0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
        //output
        //  for(int row=0;row<arr.length;row++){
        //     //for each col in every row
        //     for(int col = 0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println("");
        // }

        // //2 way to print output
        //  for(int row=0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //3 way to print output
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));

        }

        
       
    }
}
