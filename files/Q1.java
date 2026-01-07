// print each character's occurrence and frequency in a single line
public class Q1 {
    public static void main(String[] args) {
        String str = "hello world";
        int[] freq = new int[256]; // assuming ASCII

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        boolean[] printed = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!printed[ch]) {
                System.out.print("'" + ch + "':" + freq[ch] + " ");
                printed[ch] = true;
            }
        }
    }
}
