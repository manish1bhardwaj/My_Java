import java.util.*;
public class First_Negative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int  i = 0;
        int  j = 0;

        while(j<arr.length){
            if(arr[j]<0){
                negative.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(negative.size()==0){
                    ans.add(0);
                }
                else{
                    ans.add(negative.get(0));
                }
                if(negative.size()>0 && arr[i]==negative.get(0)){
                    negative.remove(0);
                }
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
