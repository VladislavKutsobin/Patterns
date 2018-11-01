package net.proselyte.basepatterns.behavioral.memento;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        Data data = new Data();

        System.out.println("Starting...");
        game.setNameAndDate("Mission one");

        System.out.println(game);

        System.out.println("Saving current save to db...");
        data.setSave(game.save());

        System.out.println("Mission 2 completed");
        game.setNameAndDate("Mission 2");
        System.out.println(game);

        System.out.println("Something wrong...");
        System.out.println("I want to complete mission 1");
        System.out.println("Rolling back to mission 1...");

        game.load(data.getSave());
        System.out.println(game);




    }
}
