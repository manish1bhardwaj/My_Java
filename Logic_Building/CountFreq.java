package Logic_Building;

public class CountFreq {
    public static void main(String[] args){
        int[] arr = {1,2,2,3,5,1,4,5,2};
        // int num  = 2;                 //freq of given number.
        // int freq = 0;
        // for(int i = 0;i<arr.length;i++){
        //     if(arr[i]==num){
        //         freq++;
        //     }
        // }
        // System.out.print(freq);
        
        for(int i = 0;i<arr.length;i++){
            int freq = 1;

            boolean visited = false;

            for(int v = 0;v<i;v++){
                if(arr[i]==arr[v]){
                    visited=true;
                    break;
                }
            }
            if(visited) continue;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }
            System.out.println(arr[i] +"="+ freq);
        }
        
    }
    
}
