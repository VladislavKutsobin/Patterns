package net.proselyte.basepatterns.creational.Singleton;

public class Switcher {
    private static Switcher switcher;
    private boolean switchInstance;

    public static synchronized Switcher getSwitcher() {
        if(switcher == null) {
            switcher = new Switcher();
        }
        return switcher;
    }

    private Switcher() {

    }

    public boolean getSwitchInstance(boolean signal) {
        if(signal == true) {
            return false;
        } else {
            return true;
        }
    }

}
