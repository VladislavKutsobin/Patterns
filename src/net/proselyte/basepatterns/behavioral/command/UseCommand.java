package net.proselyte.basepatterns.behavioral.command;

public class UseCommand implements Command{
    Builder builder;

    public UseCommand(Builder builder) {
        this.builder = builder;
    }

    @Override
    public void execute() {
        builder.useMaterials();
    }
}
