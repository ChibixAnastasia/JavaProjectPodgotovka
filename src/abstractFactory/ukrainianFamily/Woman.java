package abstractFactory.ukrainianFamily;

import abstractFactory.Human;

public class Woman implements Human {
    @Override
    public void say() {
        System.out.println("WOMAN");
    }
}
