package String;
import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int c = 0;
        int v = 0;
        int S = 0;
        int d = 0;

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch >= 97 && ch <= 122){               // or (ch -'a'>=0 && ch-'a'<=25)
                if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    v++;
                }
                else{
                    c++;
                }
            }
            else if(ch-'0' >= 0 && ch-'0' <= 9){
                d++;
            }
            else{
                S++;
            }
        }
        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
        System.out.println("Digits = " + d);
        System.out.println("Special Characters = " + S);
    }
}
// a to z = 97-122
//A to Z = 65 - 90
// 0 to 9 = 48-57