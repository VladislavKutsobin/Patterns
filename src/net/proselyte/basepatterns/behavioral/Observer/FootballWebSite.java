package net.proselyte.basepatterns.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class FootballWebSite implements Observed {
    List<String> positions = new ArrayList<>();

    List<Observer> players = new ArrayList<>();

    public void addPosition(String position) {
        this.positions.add(position);
        notifyObservers();
    }

    public void removePosition(String position) {
        this.positions.remove(position);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.players.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.players.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: players) {
            o.handleEvent(this.positions);
        }
    }
}
