import java.util.Scanner;
public class Binary {
    public static boolean Binary_s(int arr[],int target){
        int start = 0,end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int [] arr = {1,2,4,5,7,8,9,3,6,10};
        boolean re = Binary_s(arr, target);
        System.out.println(re);
        sc.close();
    }
    
}
