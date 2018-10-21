package net.proselyte.basepatterns.creational.abstractfactory.school;

import net.proselyte.basepatterns.creational.abstractfactory.Accountant;

public class SchoolProjectAccountant implements Accountant {
    @Override
    public void keepAndEyeOnFinances() {
        System.out.println("School accountant keeps and eyas on funds, which were allocated for build school...");
    }
}
