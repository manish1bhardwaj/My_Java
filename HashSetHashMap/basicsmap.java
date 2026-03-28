package HashSetHashMap;
import java.util.*;
class basicsmap{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Manish",20);map.put("Abhishek",21);
        map.put("Ashish",19);map.put("Anubhav",22);
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        // System.out.println(map+" "+map.size());
        // System.out.println(map.remove("Ashish"));
        // System.out.println(map+" "+map.size());
        // System.out.println(map.get("Abhishek"));
        // System.out.println(map.containsKey("Ashish"));


    }
}