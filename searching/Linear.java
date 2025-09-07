import java.util.Scanner;
public class Linear {
    public static boolean linear_s(int arr[],int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int [] arr = {1,2,4,5,7,8,9,3,6,10};
        boolean re = linear_s(arr, target);
        System.out.println(re);
    }
    
}
