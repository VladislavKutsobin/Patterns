package net.proselyte.basepatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer know Java core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer know Java EE: " + isJavaEEDeveloper.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javacore = new TerminalExpression("Java Core");

        return new OrExpression(java, javacore);
    }

    public static AndExpression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
