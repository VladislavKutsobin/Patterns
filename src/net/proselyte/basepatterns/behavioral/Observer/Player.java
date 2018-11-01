package net.proselyte.basepatterns.behavioral.Observer;

import java.util.List;

public class Player implements Observer {
    String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> positions) {
        System.out.println("Dear" + name + ", we have free places. You can join up on position: " + positions );
    }
}
