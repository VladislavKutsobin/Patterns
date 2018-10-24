package net.proselyte.basepatterns.structural.bridge;

public abstract class Task {
    protected Teacher teacher;

    protected Task(Teacher teacher) {
        this.teacher = teacher;
    }

    public abstract void startTeach();
}
