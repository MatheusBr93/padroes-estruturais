package mediator.colleagues;

import mediator.mediator.ChatMediator;

public class ChatUser extends User {

    public ChatUser(String name, ChatMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " enviou: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, String senderName) {
        System.out.println(name + " recebeu de " + senderName + ": " + message);
    }
}
