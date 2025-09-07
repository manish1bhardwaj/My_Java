class Computer{
    public void PlayMusic(){
        System.out.println("Palying Music");
    }
    public String getMePen(int cost){
        if(cost>=10)
            return "Pen";
        return "Nothing";
    }
}
public class Methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.PlayMusic();
        String str = obj.getMePen(10);
        System.out.println(str);
    }
    
}
