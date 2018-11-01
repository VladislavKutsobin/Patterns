package net.proselyte.basepatterns.behavioral.command;

public class BuyCommand implements Command {
    Builder builder;

    public BuyCommand(Builder builder) {
        this.builder = builder;
    }

    @Override
    public void execute() {
        builder.buyMaterials();
    }
}
