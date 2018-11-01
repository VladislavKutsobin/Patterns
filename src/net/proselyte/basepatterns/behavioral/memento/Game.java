package net.proselyte.basepatterns.behavioral.memento;

import java.util.Date;

public class Game {
    private String name;
    private Date date;

    public void setNameAndDate(String name) {
        this.name = name;
        this.date = new Date();
    }

    public Save save() {
        return new Save(name);
    }

    public void load(Save save) {
        name = save.getName();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Game: \n" +
                "name: " + name +
                "\ndate: " + date;
    }
}
