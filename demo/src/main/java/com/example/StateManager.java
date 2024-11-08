package com.example;

import static com.example.StatusFunction.Available;
import static com.example.StatusFunction.InProgress;
import static com.example.StatusFunction.SoldOut;

/**
 *
 * @author HP
 */
public class StateManager implements IStatusFunction{

    @Override
    public int update_state(int id_function, StatusFunction newStatus) {
        //Retorna 0 si la actualizacion fue exitosa
        System.out.println("Seleccione un nuevo estado para la funcion: "+id_function);
        //Modifica el estado de la funcion seleccionando uno de sus 3 estados
        if(newStatus.equals(Available)||newStatus.equals(SoldOut)|| newStatus.equals(InProgress)){
            System.out.println("La funcion: "+id_function+" ahora esta en estado: "+newStatus);
            return 0;
        }else{
            return 1;
        }
    }
    
}
