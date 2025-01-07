package org.example.notification2.service;

import org.example.notification2.model.Notification;

public interface NotificationSender {

    void sendNotification(Notification notification);
}
