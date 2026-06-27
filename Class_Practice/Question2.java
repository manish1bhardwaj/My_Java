package Class_Practice;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "#*I_Love_GLA763#";
        int v = 0;
        int c = 0;
        int d = 0;
        int s = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                d++;
            } else if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    v++;
                } else {
                    c++;
                }
            } else {
                s++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("Special characters: " + s);
        sc.close();



    }
    
}
