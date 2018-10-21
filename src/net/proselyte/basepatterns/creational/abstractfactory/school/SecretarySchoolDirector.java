package net.proselyte.basepatterns.creational.abstractfactory.school;

import net.proselyte.basepatterns.creational.abstractfactory.CallWorker;

public class SecretarySchoolDirector implements CallWorker {
    @Override
    public void answerCall() {
        System.out.println("Helps school director with his work...");
    }
}
