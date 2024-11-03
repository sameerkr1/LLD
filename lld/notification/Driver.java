package org.example.lld.notification;

import org.example.lld.notification.enums.NotificationType;
import org.example.lld.notification.handler.NotificationHandler;
import org.example.lld.notification.model.Notification;
import org.example.lld.notification.model.User;

public class Driver {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        NotificationHandler notificationHandler = new NotificationHandler(notificationFactory);

        User user = new User();
        Notification notification = new Notification();

        notificationHandler.handleNotification(user, notification, NotificationType.EMAIL);
    }

}
