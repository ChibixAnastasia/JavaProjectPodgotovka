package abstractFactory.russianFamily;

import abstractFactory.Cat;

public class BritainCat implements Cat {
    @Override
    public void say() {
        System.out.println("CAT");
    }
}
