package com.example;

import java.util.Date;

public class NotificationService implements INotificationSend, INotificationShedule {
    // Método para enviar una notificación
    @Override
    public void sendNotification(User user, Notification notification) {
        System.out.println("Enviando notificación a: " + user.getUserName());
        System.out.println("Tipo: " + notification.getType());
        System.out.println("Mensaje: " + notification.getDescription());
    }
    @Override
    // Método para programar una notificación
    public void sheduleNotification(User user, Notification notification, Date dateNotification) {
        System.out.println("Programando notificación para: " + user.getUserName());
        System.out.println("Fecha de envío: " + dateNotification);
        System.out.println("Mensaje: " + notification.getDescription());
    }

}
