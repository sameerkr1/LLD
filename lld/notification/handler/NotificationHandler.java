package org.example.lld.notification.handler;

import lombok.Data;
import org.example.lld.notification.NotificationFactory;
import org.example.lld.notification.NotificationService;
import org.example.lld.notification.enums.NotificationType;
import org.example.lld.notification.model.Notification;
import org.example.lld.notification.model.User;

@Data
public class NotificationHandler {
    private final NotificationFactory notificationFactory;

    public NotificationHandler(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void handleNotification(User user, Notification notification, NotificationType notificationType) {
        NotificationService notificationService = notificationFactory.getNotificationService(notificationType);
        notificationService.sendNotification(user, notification);
    }
}
