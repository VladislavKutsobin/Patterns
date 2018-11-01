package net.proselyte.basepatterns.behavioral.interpreter;

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
