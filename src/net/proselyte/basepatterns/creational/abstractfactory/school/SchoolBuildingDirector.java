package net.proselyte.basepatterns.creational.abstractfactory.school;

import net.proselyte.basepatterns.creational.abstractfactory.Director;

public class SchoolBuildingDirector implements Director {
    @Override
    public void checkProcess() {
        System.out.println("Director checks school project work...");
    }
}
