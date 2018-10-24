package net.proselyte.basepatterns.structural.bridge;

public class CompleteSchoolProgram extends Task {
    public CompleteSchoolProgram(Teacher teacher) {
        super(teacher);
    }

    @Override
    public void startTeach() {
        System.out.println("Teaching in progress...");
        teacher.teach();
    }
}
