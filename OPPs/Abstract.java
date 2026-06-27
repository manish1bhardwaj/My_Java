abstract class RBI{
    //Abstract method
    abstract double getInterestRate();

    // Normal Method 
    void showRBI(){
        System.out.println("Bank Follows RBI guidelines");
    }
}
class SBI extends RBI{
    double getInterestRate(){
    return 7.5;
    }
}