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
public class MusicalStore_Test {
    public static void main(String[] args){
        Musical_store obj = new Musical_store();
        System.out.println(obj.getActualBillAmount());
        
        obj.setBillAmount(200.00);
        obj.setDiscount(10);
        System.out.println(obj.getActualBillAmount())
    }
    
}
