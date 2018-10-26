package net.proselyte.basepatterns.structural.composite;

public class BuildRunner {
    public static void main(String[] args) {
        BuildTeam buildTeam = new BuildTeam();

        Worker builder = new Builder();
        Worker plumber = new Plumber();
        Worker electrician = new Electricain();

        buildTeam.addWorker(builder);
        buildTeam.addWorker(plumber);
        buildTeam.addWorker(electrician);

        buildTeam.makeRepairWorks();
    }
}
