package creators;

import products.Notification;
import products.SmsNotification;

public class SmsNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
