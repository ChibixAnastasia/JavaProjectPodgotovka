package abstractFactory.ukrainianFamily;

import abstractFactory.Home;

public class TownHouse implements Home {
    @Override
    public void say() {
        System.out.println("TOWNHOUSE");
    }
}
