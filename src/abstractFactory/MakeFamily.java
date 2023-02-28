package abstractFactory;

import abstractFactory.russianFamily.RussianFamily;

public class MakeFamily {
    public static void main(String[] args) {
        FamilyFactory familyFactory = new RussianFamily();
        familyFactory.getCat().say();
        familyFactory.getHome().say();
        familyFactory.getHuman().say();
    }
}
