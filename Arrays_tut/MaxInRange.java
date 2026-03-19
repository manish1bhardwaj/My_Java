public class MaxInRange {
    public static void main(String[] args) {
        int[] arr = {1 ,2,3,9,18};
        System.out.println(maxRange(arr,1,3));
        
    }
    static int maxRange(int[] arr,int s,int e){
        if(arr==null){
            return -1;
        }
        int maxval = arr[s];
        for(int i=s;i<=e;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
