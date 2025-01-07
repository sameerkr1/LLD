package org.example.notification2.model;

import org.example.notification2.enums.NotificationStatus;
import org.example.notification2.enums.NotificationType;

import java.time.LocalDateTime;

public class EmailNotification extends Notification {

    private String emailId;
    private String subject;

    public EmailNotification(Message message, User user, LocalDateTime createdAt, LocalDateTime scheduledTime,
                             NotificationType notificationType, NotificationStatus notificationStatus,
                             String emailId, String subject) {
        super(message, user, createdAt, scheduledTime, createdAt, notificationType, notificationStatus);
        this.emailId = emailId;
        this.subject = subject;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
