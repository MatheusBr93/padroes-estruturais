package mediator.mediator;

import mediator.colleagues.User;

public interface ChatMediator {
    void addUser(User user);
    void sendMessage(String message, User sender);
}
