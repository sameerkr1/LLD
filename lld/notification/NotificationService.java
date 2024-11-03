package org.example.lld.notification;

import org.example.lld.notification.model.Notification;
import org.example.lld.notification.model.User;

public interface NotificationService {

    void sendNotification(User user, Notification notification);
}
