package net.proselyte.basepatterns.structural.bridge;

public class CompleteUniversityProgram extends Task {
    public CompleteUniversityProgram(Teacher teacher) {
        super(teacher);
    }

    @Override
    public void startTeach() {
        System.out.println("Teaching university program in progress...");
        teacher.teach();
    }
}
