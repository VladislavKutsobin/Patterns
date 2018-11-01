package net.proselyte.basepatterns.behavioral.State;

public class PersonDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();

        Person person = new Person();

        person.setActivity(activity);

        for(int i=0; i<10;i++) {
            person.justDoIt();
            person.changeActivity();
        }
    }
}
