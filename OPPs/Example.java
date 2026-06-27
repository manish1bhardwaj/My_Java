interface Game {
    void play();
}

abstract class Institute {
    abstract void showInstitute();
}

class Learner extends Institute {

    private String name;
    private int id;

    Learner(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    void showInstitute() {
        System.out.println("Institute: GLA University");
    }
}

class Athlete extends Learner implements Game {

    Athlete(String name, int id) {
        super(name, id);
    }

    @Override
    public void play() {
        System.out.println(getName() + " plays Football");
    }
}

public class Main {

    public static void main(String[] args) {

        Athlete a = new Athlete("Afzal", 101);

        System.out.println("Name: " + a.getName());
        System.out.println("ID: " + a.getId());

        a.showInstitute();
        a.play();
    }
}
