package net.proselyte.basepatterns.structural.facade;

public class Workflow {
    private Driver driver = new Driver();
    private Circulation circulation = new Circulation();
    private CirculateTracker circulateTracker = new CirculateTracker();

    public void circulate() {
        circulation.circulateAlongTheRoute();
        circulateTracker.startCirculation();
        driver.driveTrolleybus(circulateTracker);
    }
}
