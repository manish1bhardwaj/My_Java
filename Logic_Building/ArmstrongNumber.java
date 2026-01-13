// Check whether the given number is an Armstrong number
package Logic_Building;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp= num ;
        int count = 0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp = num;
        int sum = 0;
        while(temp!=0){
            int LD= temp%10;
            sum +=Math.pow(LD,count);
            temp = temp/10;
        }
        if(sum==num){
        System.out.println("No.is Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
