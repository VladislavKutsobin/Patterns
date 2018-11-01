package net.proselyte.basepatterns.behavioral.mediator;

public class SingleUser implements User {
    Chat chat;
    String name;

    public SingleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String msg) {
        chat.sendMessage(msg, this);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println(this.name + " receiving message: " + msg + ".");
    }
}
