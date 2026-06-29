package OPPs.Basics;

class StudentObj1 {
    int roll;
}
public class Obj1 {
    public static void main(String[] args) {
        StudentObj1 s1=new StudentObj1();

        s1.roll=10; 

        StudentObj1 s2=s1;

        s2.roll=50;

        System.out.println(s1.roll);
        // output is 50  because both s1 and s2 reference variable refering the same object 
        // and any changes made by any refernce varible will be applicable to all reference variable 
        // those who refer to same object.
    }
}
