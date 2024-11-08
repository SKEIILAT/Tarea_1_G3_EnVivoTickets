/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.time.LocalDateTime;

/**
 *
 * @author HP
 */
public class Incident {
    private int id_incident;
    private int id_user;
    private String type_incident;
    private String description;
    private StatusIncident status;
    private LocalDateTime date_report;

    public Incident(int id_incident, int id_user, String type_incident, String description, LocalDateTime date_report) {
        this.id_incident = id_incident;
        this.id_user = id_user;
        this.type_incident = type_incident;
        this.description = description;
        this.status = StatusIncident.InProgress;
        this.date_report = date_report;
    }

}
