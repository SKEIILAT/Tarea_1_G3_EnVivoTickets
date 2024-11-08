package com.example;

/**
 *
 * @author HP
 */
public class AvailabilityManager implements IAvailabilityFunction{

    @Override
    public boolean check_disponibility(int id_function) {
        //1 significa que la funcion esta disponible 
        if(id_function==1){
            System.out.println("Funcion disponible");
            return true;
        }else{
            System.out.println("Funcion no disponible");
            return false;
        }
    }
}
