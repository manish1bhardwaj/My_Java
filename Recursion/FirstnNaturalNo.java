package Recursion;
import java.util.*;
public class FirstnNaturalNo {
    static void PI(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PI(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PI(n);
    }
    
}