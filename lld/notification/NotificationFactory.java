package org.example.lld.notification;

import lombok.Data;
import org.example.lld.notification.enums.NotificationType;
import org.example.lld.notification.impl.EmailNotificationServiceImpl;
import org.example.lld.notification.impl.SmsNotificationServiceImpl;

import java.util.HashMap;

@Data
public class NotificationFactory {

    private final HashMap<NotificationType, NotificationService> notificationTypeMap = new HashMap<>();

    public NotificationFactory() {
        notificationTypeMap.put(NotificationType.EMAIL, new EmailNotificationServiceImpl());
        notificationTypeMap.put(NotificationType.SMS, new SmsNotificationServiceImpl());
    }

    public NotificationService getNotificationService(NotificationType notificationType) {
        if (notificationTypeMap.containsKey(notificationType)) {
            return notificationTypeMap.get(notificationType);
        } else {
            System.out.println("please enter valid notification type");
            return null;
        }
    }

}
