package app;

import creators.EmailNotificationCreator;
import creators.NotificationCreator;
import creators.SmsNotificationCreator;

public class Main {
    public static void main(String[] args) {
        NotificationCreator emailCreator = new EmailNotificationCreator();
        NotificationCreator smsCreator = new SmsNotificationCreator();

        emailCreator.notifyUser("Relatório financeiro disponível.");
        smsCreator.notifyUser("Cliente aguardando retorno.");
    }
}
