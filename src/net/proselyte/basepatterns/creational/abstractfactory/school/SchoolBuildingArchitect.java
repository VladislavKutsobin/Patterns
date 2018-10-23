package net.proselyte.basepatterns.creational.abstractfactory.school;

import net.proselyte.basepatterns.creational.abstractfactory.Architect;

public class SchoolBuildingArchitect implements Architect {
    @Override
    public void makeProject() {
        System.out.println("Architect makes project for school...");
    }
}
