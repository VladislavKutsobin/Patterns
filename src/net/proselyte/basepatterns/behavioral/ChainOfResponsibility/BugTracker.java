package net.proselyte.basepatterns.behavioral.ChainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.LOW);
        Notifier emailNotifier = new EmailNotifier(Priority.MEDIUM);
        Notifier smsNotifier = new SmsNotifier(Priority.HIGH);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK,", Priority.LOW);
        reportNotifier.notifyManager("Something went wrong", Priority.MEDIUM);
        reportNotifier.notifyManager("We have many problems", Priority.HIGH );
    }
}
