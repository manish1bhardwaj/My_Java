class Mesurement {
    int len ;
    int bre ;

    public Mesurement(int len,int bre){
        this.len = len;
        this.bre = bre;
    }
    public int area(){
        int area = len*bre;
        return area;
    } 
}
public class Data{
    public static void main(String[] args) {
        Mesurement s1 = new Mesurement(10, 20);
        Mesurement s2 = new Mesurement(40, 5);

        s1.area();
        s2.area();
        System.out.println(s1.area());
        System.out.println(s2.area());
        
    }
   

}
