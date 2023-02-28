package factoryMethod;

public class PigFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Pig();
    }
}
