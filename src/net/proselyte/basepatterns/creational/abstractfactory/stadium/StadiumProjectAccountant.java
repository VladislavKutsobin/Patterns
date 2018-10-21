package net.proselyte.basepatterns.creational.abstractfactory.stadium;

import net.proselyte.basepatterns.creational.abstractfactory.Accountant;

public class StadiumProjectAccountant implements Accountant {
    @Override
    public void keepAndEyeOnFinances() {
        System.out.println("Stadium accountant keeps and eyas on funds, which were allocated for build stadium...");
    }
}
