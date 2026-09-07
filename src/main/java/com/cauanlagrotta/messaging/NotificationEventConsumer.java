package com.cauanlagrotta.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

import com.cauanlagrotta.model.Notification;
import com.cauanlagrotta.service.NotificationService;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor 
public class NotificationEventConsumer {

    private final NotificationService notificationService;

    @RabbitListener(queues = "notification-queue")
    public void sendNotificationEvent(Notification notification){
        notificationService.createNotification(notification);
    }
}
