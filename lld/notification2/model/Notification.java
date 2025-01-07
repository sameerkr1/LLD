package org.example.notification2.model;

import org.example.notification2.enums.NotificationStatus;
import org.example.notification2.enums.NotificationType;

import java.time.LocalDateTime;

public abstract class Notification {
    private Message message;
    private User user;
    private LocalDateTime createdAt;
    private LocalDateTime scheduledTime;
    private NotificationType notificationType;
    private NotificationStatus notificationStatus;

    Notification(Message message, User user, LocalDateTime createdAt, LocalDateTime scheduledTime, LocalDateTime at, NotificationType notificationType, NotificationStatus notificationStatus) {
        this.message = message;
        this.user = user;
        this.createdAt = createdAt;
        this.scheduledTime = scheduledTime;
        this.notificationStatus = notificationStatus;
        this.notificationType = notificationType;
    }
}
