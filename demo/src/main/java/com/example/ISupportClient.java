/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author HP
 */
public interface ISupportClient {
    void registerIncident(int id_user, String typeIncident, String description);
    void fixedError(int id_incident, String details);
    void updateState(int id_incident, StatusIncident newState);
}
