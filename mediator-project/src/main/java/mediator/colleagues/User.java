package mediator.colleagues;

import mediator.mediator.ChatMediator;

public abstract class User {

    protected String name;
    protected ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void send(String message);

    public abstract void receive(String message, String senderName);
}
