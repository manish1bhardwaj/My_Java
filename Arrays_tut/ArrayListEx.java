import java.util.*;
public class ArrayListEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list =new ArrayList<>();

        // list.add(23);
        // list.add(29);
        // list.add(59);
        // list.add(25);
        // list.add(55);
        // list.add(34);
        // // System.out.println(list+" ");
        // // System.out.println(list.contains(55));
        // System.out.println(list+" ");
        // list.set(3,78);
        // list.remove(4);
        // System.out.println(list+" ");

        // Take Input
        for(int i =0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0; i<5;i++){
            System.out.println(list.get(i));
        }


    }
    
}
