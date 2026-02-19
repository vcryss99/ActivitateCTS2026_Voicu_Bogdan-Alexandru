package ro.ase.cts.main;

import ro.ase.cts.animals.Animal;
import ro.ase.cts.animals.Lion;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Jeani",new ZooKeeper("DAsu"));

        Lion animal= new Lion("iuiu",3);

        zoo.addAnimal(animal);

        zoo.feedAllAnimals();
    }
}
