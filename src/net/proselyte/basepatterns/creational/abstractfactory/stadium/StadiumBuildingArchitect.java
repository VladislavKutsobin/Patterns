package net.proselyte.basepatterns.creational.abstractfactory.stadium;

import net.proselyte.basepatterns.creational.abstractfactory.Architect;

public class StadiumBuildingArchitect implements Architect {
    @Override
    public void makeProject() {
        System.out.println("Stadium architect makes stadium building project");
    }
}
