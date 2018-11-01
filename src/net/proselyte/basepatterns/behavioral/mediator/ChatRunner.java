package net.proselyte.basepatterns.behavioral.mediator;

public class ChatRunner {
    public static void main(String[] args) {
        SimpleChat simpleChat = new SimpleChat();
        User admin = new Admin(simpleChat, "Admin");
        User user1 = new SingleUser(simpleChat, "Vlad");
        User user2 = new SingleUser(simpleChat, "Vladimir");

        simpleChat.setAdmin(admin);
        simpleChat.addUserToChat(user1);
        simpleChat.addUserToChat(user2);

        user1.sendMessage("Hello, I am Vlad");
        //admin.sendMessage("Hello, I am Admin");
    }
}