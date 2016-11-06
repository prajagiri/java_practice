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
public class Checks {
    public boolean checkBaggage(Traveller obj)
    {
        if(obj.getBaggageAmount() >= 0 && obj.getBaggageAmount() <=40)
            return true;
        return false;
    }
    
    public boolean checkImmigration(Traveller obj){
        if(obj.getExpiryYear() >= 2001 && obj.getExpiryYear() <=2025)
            return true;
        return false;        
    }
    
    public boolean checkSecurity(Traveller obj){
        return obj.isNocStatus();
    }
        
}
