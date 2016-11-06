/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators_typeCasting;

/**
 *
 * @author pavan
 */
public class Musical_store {
    private int discount;
    private double billAmount;

    public Musical_store() {
        this.discount = 25;
        this.billAmount = 100.00;
    }
    
    public void setDiscount(int disc)
    {
        this.discount = disc;
    }
    
    public void setBillAmount(double bill)
    {
        this.billAmount = bill;
    }
    
    public double getActualBillAmount()
    {
        billAmount = billAmount - (billAmount * ((double) discount / 100));
        return billAmount;
    }
    
}
