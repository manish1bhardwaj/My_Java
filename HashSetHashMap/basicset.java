package HashSetHashMap;
import java.util.*;
public class basicset {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(11);set.add(4); set.add(4); set.add(10);
        set.add(11);set.add(15);set.add(34);set.add(30);
// iterate on set only with for each loop
        for(int nums:set){
            System.out.print(nums+" ");
        }

        // System.out.println(set.size());
        // System.out.println(set.contains(34));
        // // set.remove(11);
        // System.out.println(set.size());
        // System.out.println(set);

    }
}
