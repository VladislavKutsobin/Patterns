package net.proselyte.basepatterns.creational.abstractfactory;

import net.proselyte.basepatterns.creational.abstractfactory.school.SchoolTeamFactory;

public class AppRunner {
    public static void main(String[] args) {
        TeamFactory teamfactory = new SchoolTeamFactory();
        Accountant accountant = teamfactory.getAccountant();
        Architect architect = teamfactory.getArchitect();
        Director director = teamfactory.getDirector();
        CallWorker callWorker = teamfactory.getCallWorker();

        System.out.println("Starting school project...");
        director.checkProcess();
        accountant.keepAndEyeOnFinances();
        architect.makeProject();
        callWorker.answerCall();
    }
}
