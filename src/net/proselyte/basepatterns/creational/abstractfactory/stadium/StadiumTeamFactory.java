package net.proselyte.basepatterns.creational.abstractfactory.stadium;

import net.proselyte.basepatterns.creational.abstractfactory.*;

public class StadiumTeamFactory implements TeamFactory {
    @Override
    public Director getDirector() {
        return new StadiumBuildingDirector();
    }

    @Override
    public CallWorker getCallWorker() {
        return new SecretaryStadiumDirector();
    }

    @Override
    public Architect getArchitect() {
        return new StadiumBuildingArchitect();
    }

    @Override
    public Accountant getAccountant() {
        return new StadiumProjectAccountant();
    }
}
