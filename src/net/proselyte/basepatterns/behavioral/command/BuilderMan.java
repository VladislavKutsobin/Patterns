package net.proselyte.basepatterns.behavioral.command;

public class BuilderMan {
    Command buy;
    Command use;
    Command trash;

    public BuilderMan(Command buy, Command use, Command trash) {
        this.buy = buy;
        this.use = use;
        this.trash = trash;
    }

    public void buying() {
        buy.execute();
    }

    public void using() {
        use.execute();
    }
    public void trashing() {
        trash.execute();
    }
}
