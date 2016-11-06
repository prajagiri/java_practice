/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traveller;

/**
 *
 * @author pavan
 */
public class Traveller {
    private int travellerId;
    private int baggageAmount;
    private int expiryYear;
    private boolean nocStatus;

    public Traveller() {
        this.travellerId = 0;
        this.baggageAmount = 0;
        this.expiryYear = 0;
        this.nocStatus = false;
    }

    public int getBaggageAmount() {
        return baggageAmount;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public int getTravellerId() {
        return travellerId;
    }

    public boolean isNocStatus() {
        return nocStatus;
    }

    public void setBaggageAmount(int baggageAmount) {
        this.baggageAmount = baggageAmount;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public void setTravellerId(int travellerId) {
        this.travellerId = travellerId;
    }

    public void setNocStatus(boolean nocStatus) {
        this.nocStatus = nocStatus;
    }
    
    
    
}
