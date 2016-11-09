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
public class Ticket {
    private int startPoint;
    private int endPoint;
    private int ticketAmount;
    public static int count = 0;

    public Ticket() {
        this.startPoint = 0;
        this.endPoint = 0;
        this.ticketAmount = 0;
        count++;
    }

    public Ticket(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public int getStartPoint() {
        return startPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }
    
    public boolean validateTravelPoints(){
        if(this.startPoint > 0 && this.endPoint > 0 && this.endPoint > this.startPoint)
            return true;
        
        return false;
    }
    
    public void calculateTicketAmt(){
        this.ticketAmount = (this.endPoint - this.startPoint)*20;
    }
    
    
    
    
    
}
