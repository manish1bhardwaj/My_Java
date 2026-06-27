import java.util.*;
public class Max_sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Subarray :");
        int k = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = sc.nextInt();
        int [] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        while(j<num.length){
            sum = sum + num[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max = Math.max(max,sum);
                sum = sum -num[i];
                i++;
                j++;
            }
        }   
        System.out.println(max);
    }
}