package net.proselyte.basepatterns.creational.abstractfactory.stadium;

import net.proselyte.basepatterns.creational.abstractfactory.Director;

public class StadiumBuildingDirector implements Director {
    @Override
    public void checkProcess() {
        System.out.println("Stadium director checks stadium building work...");
    }
}
