package net.proselyte.basepatterns.creational.Singleton;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Switcher.getSwitcher().getSwitchInstance(true));
        System.out.println(Switcher.getSwitcher().getSwitchInstance(false));
    }
}
