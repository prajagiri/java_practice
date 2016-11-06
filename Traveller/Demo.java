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
public class Demo {
     public static void main(String[] args){
         Traveller obj = new Traveller();
         obj.setBaggageAmount(35);
         obj.setTravellerId(1001);
         obj.setExpiryYear(2019);
         obj.setNocStatus(true);
         
         Checks chk = new Checks();
         if(chk.checkBaggage(obj) && chk.checkImmigration(obj)&& chk.checkSecurity(obj))
             System.out.println("Allow Traveller to fly!");
         else
             System.out.println("Detain Traveller for Re-checking!");
    
}
