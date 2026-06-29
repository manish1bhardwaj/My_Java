package OPPs.Basics;
class Student {

    Student() {

        System.out.println("Constructor Called");
    }
}

class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
    }
}
// 1. WHAT IS A CONSTRUCTOR?
// Interview Definition

// A constructor is a special member of a class that is automatically called when an object is created.
//  Its primary purpose is to initialize the object's state.

// Let's understand every word in this definition.

// "Special Member"

// A constructor belongs to the class, just like methods and variables.

// Example:

// class Student {

//     int roll;
//     String name;

//     Student() {
//         System.out.println("Constructor Called");
//     }

//     void study() {
//         System.out.println("Studying");
//     }
// }

// Here,

// roll → Instance variable
// name → Instance variable
// study() → Method
// Student() → Constructor
    
// }

// 2. WHY DO WE NEED CONSTRUCTORS?

// This is the most important question.

// Imagine constructors didn't exist.

// class Student {

//     int roll;
//     String name;
// }

// Now:

// Student s1 = new Student();

// s1.roll = 101;
// s1.name = "Manish";

// Now create another student.

// Student s2 = new Student();

// s2.roll = 102;
// s2.name = "Rahul";

// Then another.

// Student s3 = new Student();

// s3.roll = 103;
// s3.name = "Aman";

// Notice something?

// We are repeating initialization again and again.

// Constructor Solves This
// class Student {

//     int roll;
//     String name;

//     Student(int r, String n) {

//         roll = r;
//         name = n;
//     }
// }

// Now,

// Student s1 = new Student(101, "Manish");
// Student s2 = new Student(102, "Rahul");
// Student s3 = new Student(103, "Aman");

// Everything is initialized immediately.

// Cleaner.

// Safer.

// Professional.

// A constructor is a special member of a class.
// It has the same name as the class.
// It has no return type, not even void.
// It runs automatically when an object is created.
// Its primary purpose is to initialize the object's state.
// Every object creation triggers a constructor.
// new allocates memory; the constructor initializes the object.
