package org.example.notification2.service.impl;

import org.example.notification2.model.Notification;
import org.example.notification2.model.SMSNotification;
import org.example.notification2.service.NotificationSender;

public class SMSNotificationSender implements NotificationSender {


    @Override
    public void sendNotification(Notification notification) {

        if (!(notification instanceof SMSNotification)) {
            throw new IllegalArgumentException("argument wrong!!");
        }

        SMSNotification smsNotification = (SMSNotification) notification;
        // send to third party
    }
}
