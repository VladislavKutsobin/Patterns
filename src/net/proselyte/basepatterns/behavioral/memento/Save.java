package net.proselyte.basepatterns.behavioral.memento;

import java.util.Date;

public class Save {
    private final String name;
    private final Date date;

    public Save(String name) {
        this.name = name;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
