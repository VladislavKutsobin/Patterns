package net.proselyte.basepatterns.structural.bridge;

public class MathematicTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Mathematics teacher teaches... ");
    }
}
