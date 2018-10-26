package net.proselyte.basepatterns.structural.flyweight;

public class Teacher implements Worker {
    @Override
    public void doJob() {
        System.out.println("Teacher teaches students.");
    }
}
