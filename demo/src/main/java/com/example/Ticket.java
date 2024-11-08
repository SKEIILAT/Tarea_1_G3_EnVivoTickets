package com.example;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Ticket {
    private int id_ticket;
    private StatusTicket status;
    private Date presentation_date;
    private int id_function;
    private int price;
    private SectionEvent section;
    private int seat;

    public Ticket(int id_ticket, StatusTicket status, Date presentation_date, int id_function, int price, SectionEvent section, int seat) {
        this.id_ticket = id_ticket;
        this.status = status;
        this.presentation_date = presentation_date;
        this.id_function = id_function;
        this.price = price;
        this.section = section;
        this.seat = seat;
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public StatusTicket getStatus() {
        return status;
    }

    public void setStatus(StatusTicket status) {
        this.status = status;
    }

    public Date getPresentation_date() {
        return presentation_date;
    }

    public void setPresentation_date(Date presentation_date) {
        this.presentation_date = presentation_date;
    }

    public int getId_function() {
        return id_function;
    }

    public void setId_function(int id_function) {
        this.id_function = id_function;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SectionEvent getSection() {
        return section;
    }

    public void setSection(SectionEvent section) {
        this.section = section;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    
}
