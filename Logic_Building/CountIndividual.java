package Logic_Building;
public class CountIndividual {
    public static void main(String[] args) {
        long n = 1578794792187L;
        int count = 0;
        while(n>0){
            int rem = (int)(n%10);
            if(rem==7){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}