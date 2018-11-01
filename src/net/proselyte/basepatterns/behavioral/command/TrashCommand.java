package net.proselyte.basepatterns.behavioral.command;

public class TrashCommand implements Command{
    Builder builder;

    public TrashCommand(Builder builder) {
        this.builder = builder;
    }

    @Override
    public void execute() {
        builder.trashMaterials();
    }
}
