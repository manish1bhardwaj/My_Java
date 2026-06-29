package OPPs.Basics;

class StudentStructure{
    String name;
    int roll_no;
    float marks=90.3f;

    // we need  a way to add the values of the above properties object by object
    // so we need one word to access every object. (this keyword)

    StudentStructure(){
        this.name = "Man";
        this.roll_no = 30;
        this.marks= 90.4f;
    }
    StudentStructure(String name,int roll_no,float mark){
        this.name = name;
        this.roll_no=roll_no;
        this.marks= mark;
    }
}

public class Structure{
    public static void main(String[] args) {
        StudentStructure s1 = new StudentStructure("karan",29,98.3f);
        StudentStructure s2 = new StudentStructure("abhi",12,83.4f);


        System.out.println(s2.name);
        System.out.println(s2.roll_no);
        System.out.println(s1.marks);
        
    }
}