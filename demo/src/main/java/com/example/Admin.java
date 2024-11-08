/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Admin implements IPriceManagement,IPromotionManagement,IPolicyManagement, ICalendarManagement{
    private IPriceManagement priceManagement;
    private IPromotionManagement promotionManagement;
    private IPolicyManagement policyManagement;
    private ICalendarManagement scheduleManagement;

    public Admin(IPriceManagement priceManagement, IPromotionManagement promotionManagement, IPolicyManagement policyManagement, ICalendarManagement scheduleManagement) {
        this.priceManagement = priceManagement;
        this.promotionManagement = promotionManagement;
        this.policyManagement = policyManagement;
        this.scheduleManagement = scheduleManagement;
    }

    public void updatePrice(int id_event, double newPrice) {
        priceManagement.set_price(id_event, newPrice);
    }

    public void define_promotion(int id_event, String newPromotion) {
        promotionManagement.set_promotion(id_event, newPromotion);
    }
    @Override
    public void define_policy(int id_event, String newPolicy) {
        policyManagement.define_policy(id_event, newPolicy);
    }
    
    @Override
    public void set_price(int id_event, double price) {
        priceManagement.set_price(id_event, price);
    }

    @Override
    public void set_promotion(int id_event, String details) {
        promotionManagement.set_promotion(id_event, details);
    }

    @Override
    public void reschedule_calendar(int id_event, Date newDate) {
        scheduleManagement.reschedule_calendar(id_event, newDate);
    }

}
