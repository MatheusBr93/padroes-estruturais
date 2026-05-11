package mediator.app;

import mediator.colleagues.ChatUser;
import mediator.colleagues.User;
import mediator.mediator.ChatMediator;
import mediator.mediator.ChatRoom;

public class Main {

    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User ana = new ChatUser("Ana", chatRoom);
        User bruno = new ChatUser("Bruno", chatRoom);
        User carla = new ChatUser("Carla", chatRoom);

        chatRoom.addUser(ana);
        chatRoom.addUser(bruno);
        chatRoom.addUser(carla);

        ana.send("Bom dia, equipe!");
        System.out.println();

        bruno.send("Bom dia! Já estou revisando o projeto.");
    }
}
