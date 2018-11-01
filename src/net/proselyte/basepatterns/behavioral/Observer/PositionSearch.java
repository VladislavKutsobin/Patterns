package net.proselyte.basepatterns.behavioral.Observer;

public class PositionSearch {
    public static void main(String[] args) {
        FootballWebSite footballWebSite = new FootballWebSite();

        footballWebSite.addPosition("Goalkeeper");
        footballWebSite.addPosition("Midfielder");

        Observer firstplayer = new Player("Vladislav");
        Observer secondplayer = new Player("Vladimir");

        footballWebSite.addObserver(firstplayer);
        footballWebSite.addObserver(secondplayer);

        footballWebSite.addPosition("Second midfielder");
    }
}
