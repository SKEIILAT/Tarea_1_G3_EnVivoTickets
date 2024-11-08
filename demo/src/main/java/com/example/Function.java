package com.example;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Function {
    private int id_function;
    private Date date;
    private Time time;
    private StatusTicket status;

    public Function(int id_function, Date date, Time time, StatusTicket status) {
        this.id_function = id_function;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public int getId_function() {
        return id_function;
    }

    public void setId_function(int id_function) {
        this.id_function = id_function;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public StatusTicket getStatus() {
        return status;
    }

    public void setStatus(StatusTicket status) {
        this.status = status;
    }
    
    
}
