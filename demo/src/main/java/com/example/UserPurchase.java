package com.example;
import java.util.Date;
public class UserPurchase {
    Date date;
    private NotificationService notificationService;

    public UserPurchase(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    
    public void buyTicket(User user) {
        System.out.println("Compra de ticket realizada por el usuario: " + user.getUserName());
        // Crear notificación utilizando el constructor actualizado
        Notification notification = new Notification(
                1, 
                "Tu compra de ticket ha sido exitosa.",
                "Compra",
                (java.sql.Date) date
        );
        // Enviar notificación al usuario después de la compra
        notificationService.sendNotification(user,notification);
    
    }
}
