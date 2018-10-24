package net.proselyte.basepatterns.structural.bridge;

import net.proselyte.basepatterns.creational.abstractfactory.TeamFactory;

public class PhysicsTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Physics teacher teaches...");
    }
}
