package abstractFactory.ukrainianFamily;

import abstractFactory.Cat;
import abstractFactory.FamilyFactory;
import abstractFactory.Home;
import abstractFactory.Human;

public class UkrFamily implements FamilyFactory {
    @Override
    public Cat getCat() {
        return new Mainkun();
    }

    @Override
    public Human getHuman() {
        return new Woman();
    }

    @Override
    public Home getHome() {
        return new TownHouse();
    }
}
