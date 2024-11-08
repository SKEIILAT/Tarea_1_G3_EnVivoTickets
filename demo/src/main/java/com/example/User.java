package com.example;

public class User {
    private int idUser;
    private String userName;
    private String lastName;
    private String userEmail;
    private String userPhone;
    private NotificationService notificationService;
    private UserPurchase userPurchase;
    
    public User(int idUser, String userName, String lastName, String userEmail, String userPhone,
            NotificationService notificationService, UserPurchase userPurchase) {
        this.idUser = idUser;
        this.userName = userName;
        this.lastName = lastName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.notificationService = notificationService;
        this.userPurchase = userPurchase;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public UserPurchase getUserPurchase() {
        return userPurchase;
    }

    public void setUserPurchase(UserPurchase userPurchase) {
        this.userPurchase = userPurchase;
    }

    
    

}
