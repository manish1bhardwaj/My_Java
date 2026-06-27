class Student{
   String name="xyz";
   int age= 20;
   int roll_no = 12;
   public Student(){
   }
   public Student(String name ,int a){
    this.name = name;
    age = a;
   }
   public Student(String n){
    name = n;
   }
   public void f1(){
      System.out.println("Say hi to"+name);
   }
   public static void f2(){
      System.out.println("Hi..");
   }
   public int getage(){
      return this.age;
   }
   public void setage(int age){
      this.age = age;
   }
}

 public class Main{
   public static void main(String[] args){
      Student s1 = new Student("Manish",20);      //default constructor will be call 
                                                                         
      Student s2 = new Student("Vivek",20);
   

      s1.f2();
      s2.f2();

      s1.f1();
      s2.f1();
      s1.setage(30);
      s2.setage(49);

      
      System.out.println(s1.name+" "+s1.getage());
      System.out.println(s2.name+" "+s2.getage());
    
   }
        
    }

    