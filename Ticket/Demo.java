/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

/**
 *
 * @author pavan
 */
public class Demo {
    public static void main(String[] str){
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket(18,1);
        Ticket t3 = new Ticket(2,18);
        
                
        if(t3.validateTravelPoints()){
            t3.calculateTicketAmt();
            System.out.println(t3.getTicketAmount());
        }
                }
    
}
