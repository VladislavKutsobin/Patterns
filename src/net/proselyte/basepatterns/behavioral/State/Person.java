package net.proselyte.basepatterns.behavioral.State;

public class Person {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if(activity instanceof Sleeping) {
            setActivity(new Reading());
        }else if(activity instanceof Reading) {
            setActivity(new Coding());
        }else if(activity instanceof Coding) {
            setActivity(new Sleeping());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
