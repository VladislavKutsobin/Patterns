package net.proselyte.basepatterns.behavioral.command;

public class BuilderRunner {
    public static void main(String[] args) {
        Builder builder = new Builder();

        BuilderMan builderMan = new BuilderMan(
                new BuyCommand(builder),
                new UseCommand(builder),
                new TrashCommand(builder)
        );

        builderMan.buying();
        builderMan.using();
        builderMan.trashing();
    }
}
