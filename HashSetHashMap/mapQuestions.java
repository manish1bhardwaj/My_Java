package HashSetHashMap;
import java.util.*;
// find most frequent element in it ?
public class mapQuestions{
    public static void main(String[] args) {
        int[] arr= {1,3,2,1,4,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }
        System.out.println(map);
        int max_freq = 0 ,ansKey= -1;
        for(var e:map.entrySet()){
            if(e.getValue()>max_freq){
                max_freq = e.getValue();
                ansKey= e.getKey();
            }
        }
        System.out.println(ansKey);
    }
}