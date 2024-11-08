package com.example;

import java.sql.Date;

public class Notification {
    private int idNotification;
    private String description;
    private String type;
    private Date dateNotification;

    public Notification(int idNotification, String description, String type, Date dateNotification) {
        this.idNotification = idNotification;
        this.description = description;
        this.type = type;
        this.dateNotification = dateNotification;
    }

    public int getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateNotification() {
        return dateNotification;
    }

    public void setDateNotification(Date dateNotification) {
        this.dateNotification = dateNotification;
    }
    
    
}
