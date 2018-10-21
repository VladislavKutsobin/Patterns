package net.proselyte.basepatterns.creational.abstractfactory.school;

import net.proselyte.basepatterns.creational.abstractfactory.*;

public class SchoolTeamFactory implements TeamFactory {
    @Override
    public Director getDirector() {
        return new SchoolBuildingDirector();
    }

    @Override
    public CallWorker getCallWorker() {
        return new SecretarySchoolDirector();
    }

    @Override
    public Architect getArchitect() {
        return new SchoolBuildingArchitect();
    }

    @Override
    public Accountant getAccountant() {
        return new SchoolProjectAccountant();
    }
}
