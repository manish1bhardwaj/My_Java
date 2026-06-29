package OPPs.Basics;


// Question 2
class Test {
    int x = 10;
}
public class obj2 {
       public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = t1;

        t1 = null;

        System.out.println(t2.x);
    }
}
// Your Answer
// null

// ❌ Incorrect.

// Correct Output
// 10
// Why?

// Initially

// t1 ──────\
//            \
//             ► Object (x = 10)
//            /
// t2 ──────/

// After

// t1 = null;

// Only t1 loses its reference.

// t1 ───► null

// t2 ───► Object (x = 10)

// The object still exists because t2 is pointing to it.

// Therefore

// System.out.println(t2.x);

// prints

// 10
// Important Rule ⭐

// Setting one reference to null

// t1 = null;

// does not destroy the object.

// The object is destroyed only when no references point to it anymore.

// Example:

// Test t1 = new Test();
// Test t2 = t1;
//
// t1 = null;
// t2 = null;

// Now the object has zero references.

// It becomes eligible for Garbage Collection.

// Notice the wording: eligible. Java decides when (or if) to actually reclaim the memory.
//

