package org.example.notification2;

import org.example.notification2.enums.NotificationStatus;
import org.example.notification2.enums.NotificationType;
import org.example.notification2.model.EmailNotification;
import org.example.notification2.model.Message;
import org.example.notification2.model.Notification;
import org.example.notification2.model.User;
import org.example.notification2.service.NotificationSender;
import org.example.notification2.service.impl.SMSNotificationSender;

import java.time.LocalDateTime;

public class Driver {

    public static void main(String[] args) {

        Message message = new Message();
        User user = new User();
        Notification notification = new EmailNotification(message, user, LocalDateTime.now(), LocalDateTime.now(), NotificationType.EMAIL, NotificationStatus.DELIVERED, "sameer.kumar@meesho.com", "testing purpose");

        NotificationSender smsNotificationSender = new SMSNotificationSender();
        smsNotificationSender.sendNotification(notification);
    }
}
