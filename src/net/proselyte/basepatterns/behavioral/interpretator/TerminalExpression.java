package net.proselyte.basepatterns.behavioral.interpretator;

public class TerminalExpression implements Expression {
    private String str;

    public TerminalExpression(String str) {
        this.str = str;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(str)) {
            return true;
        } else return false;
    }
}
