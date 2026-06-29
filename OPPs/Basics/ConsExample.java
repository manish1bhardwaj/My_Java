package OPPs.Basics;

class ConsStudent {

    int x = getValue();

    int getValue() {

        System.out.println("Method");

        return 50;

    }

    ConsStudent() {

        System.out.println("Constructor");

    }
}
public class ConsExample {

    public static void main(String[] args) {

        ConsStudent s = new ConsStudent();

        System.out.println(s.x);

    }
}
