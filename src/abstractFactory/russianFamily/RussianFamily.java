package abstractFactory.russianFamily;

import abstractFactory.Cat;
import abstractFactory.FamilyFactory;
import abstractFactory.Home;
import abstractFactory.Human;

public class RussianFamily implements FamilyFactory {
    @Override
    public Cat getCat() {
        return new BritainCat();
    }
    @Override
    public Human getHuman() {
        return new Man();
    }
    @Override
    public Home getHome() {
        return new Apartment();
    }
}
