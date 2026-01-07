class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void stuinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

}
public class Prac{
    public static void main(String[] args){
        // Pen p1 = new Pen();
        // p1.color = "Blue";
        // p1.type = "Gel";
        // p1.write();

        // Pen p2 = new Pen();
        // p2.color = "Black";
        // p2.type = "Gel";

        // p1.printcolor();
        // p2.printcolor();
        Student s1 = new Student("Manish",18);
        // Student s2 = new Student();
        // Student s3 = new Student();
        // s1.name = "Manish";
        // s1.age = 17;

        // s2.name = "Abhishek";
        // s2.age = 17;

        // s3.name = "Anubhav";
        // s3.age = 17;

        s1.stuinfo();
        // s2.stuinfo();
        // s3.stuinfo();
    }

}