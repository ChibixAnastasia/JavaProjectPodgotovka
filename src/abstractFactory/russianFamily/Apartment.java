package abstractFactory.russianFamily;

import abstractFactory.Home;

public class Apartment implements Home {
    @Override
    public void say() {
        System.out.println("APARTMENT");
    }
}
