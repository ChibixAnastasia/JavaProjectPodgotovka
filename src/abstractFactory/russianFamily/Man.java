package abstractFactory.russianFamily;

import abstractFactory.Human;

public class Man implements Human {
    @Override
    public void say() {
        System.out.println("MAN");
    }
}
