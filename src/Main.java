import factoryMethod.Animal;
import factoryMethod.AnimalFactory;
import factoryMethod.DogFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new DogFactory();
        Animal animal = animalFactory.createAnimal();
        System.out.println("uuu");

        Integer a = 22;
        Integer b = 22;
        Integer c = 22;
        a = 900;
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
    }
}