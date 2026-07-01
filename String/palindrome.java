package String;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev="";
        for(int i = s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            rev+=ch;
        }
        if(s.equals(rev)){
            System.out.print(rev+" "+"String is Palindrome");
        }
        else{
        System.out.print(rev+" "+"String is not Palindrome");
        }
    }
}
