package net.proselyte.basepatterns.behavioral.State;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading book...");
    }
}
