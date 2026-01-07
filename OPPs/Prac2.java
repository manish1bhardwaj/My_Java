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
public class Prac2{
    public static void main(String[] args){
        Student s1 = new Student("Manish",18);
    
}
}
