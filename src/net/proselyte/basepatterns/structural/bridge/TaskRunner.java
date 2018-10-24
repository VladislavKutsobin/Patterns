package net.proselyte.basepatterns.structural.bridge;

public class TaskRunner {
    public static void main(String[] args) {
        Task []tasks = {
                new CompleteSchoolProgram(new MathematicTeacher()),
                new CompleteUniversityProgram(new PhysicsTeacher())
        };

        for(Task task : tasks) {
            task.startTeach();
        }
    }
}
