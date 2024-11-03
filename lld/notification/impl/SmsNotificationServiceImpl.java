package org.example.lld.notification.impl;

import org.example.lld.notification.NotificationService;
import org.example.lld.notification.model.Notification;
import org.example.lld.notification.model.User;

public class SmsNotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotification(User user, Notification notification) {
        System.out.println("sms notification");
    }
}
