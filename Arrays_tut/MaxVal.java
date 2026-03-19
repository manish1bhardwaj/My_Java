public class MaxVal {
    public static void main(String[] args) {
        int[] arr = {1 ,3, 4, 56,89,13 };
        System.out.println(max(arr));
        
    }
    static int max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int maxval = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
