/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_reg;

/**
 *
 * @author pavan
 */
public class Registration {
    private int registrationId;
    private double fees;
    private int discount;

    public Registration() {
        this.fees = 0.00;
        this.registrationId = 0;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getFees() {
        return fees;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }
    
    public void calculateFees(int x){
        if(x>=85 && x<=100)
            this.discount = 12;
        else if(x>=75 && x<85)
            this.discount = 7;
        else if(x>=65&&x<75)
            this.discount = 0;
        else
            this.discount = 0;
        
        this.fees = this.fees - (this.fees * ((double)discount/100));
    }
    
    
    
}
