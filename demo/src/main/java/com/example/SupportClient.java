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
public class SupportClient implements ISupportClient {
    private IEscalationAccident service_scaling;

    public SupportClient(IEscalationAccident service_scaling) {
        this.service_scaling = service_scaling;
    }

    @Override
    public void registerIncident(int id_user, String typeIncident, String description) {
        // Implementación para registrar un incidente
        int id_incident = (int) Math.random() * 1000; // Generación de un ID aleatorio para fines de ejemplo
        Incident incident = new Incident(id_incident, id_user, typeIncident, description, LocalDateTime.now());
        System.out.println("Incidente registrado con ID: " + id_incident);
    }

    @Override
    public void fixedError(int id_incident, String details) {
        // Implementación para resolver un error
        System.out.println("Error resuelto para el incidente " + id_incident + " con detalles: " + details);
        updateState(id_incident, StatusIncident.Fixed);
    }

    @Override
    public void updateState(int id_incident, StatusIncident newState) {
        // Implementación para actualizar el estado del incidente
        System.out.println("El estado del incidente " + id_incident + " se ha actualizado a: " + newState);
    }

    public void escalateIncident(int id_incident) {
        // Implementación para escalar un incidente
        System.out.println("Escalando incidente con ID: " + id_incident);
        service_scaling.escalateIncident(id_incident);
        updateState(id_incident, StatusIncident.Derived);
    }

}
