/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author HP
 */
public class SelectFunctionsMap implements IAvailabilitySeat,IReserveSeat {
    private Map<Integer, String> seat_map;

    @Override
    public boolean check_disponibility(int id_seat) {
        //1 significa que el asiento esta disponible 
        if(id_seat==1){
            System.out.println("Asiento disponible");
            return true;
        }else{
            System.out.println("Asiento no disponible");
            return false;
        }
    }

    public void select_seat(int id_seat) {
        // A partir del metodo anterior se comprueba disponibilidad para hacer una correcta seleccion
        boolean disponibility = this.check_disponibility(id_seat);
        if(disponibility==true){
            System.out.println("Asiento seleccionado correctamente");
        }else{
            System.out.println("El asiento no se encuentra disponible");
        }
    }

    @Override
    public void reserve_seat(int id_seat) {
        //Con el metodo anterior podemos crear el metodo para reservar ya que tendra un comportamiento similar
        this.select_seat(id_seat);
    }
}
