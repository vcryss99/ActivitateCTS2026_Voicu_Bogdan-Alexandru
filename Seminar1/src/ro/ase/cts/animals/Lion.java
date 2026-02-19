package ro.ase.cts.animals;

public class Lion extends Animal{

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String name) {
        System.out.println("LEUL MANANCA");
    }

}
