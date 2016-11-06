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
public class DemoReg {
    public static void main(String[] args){
        Registration reg = new Registration();
        reg.setRegistrationId(2001);
        
        int branchId = 1002;
        
        switch(branchId){
            case 1001:
                reg.setFees(25575.0);
                break;
            case 1002:
                reg.setFees(15500.0);
                break;
            case 1003:
                reg.setFees(33750.0);
                break;
            case 1004:
                reg.setFees(8350.0);
                break;
            case 1005:
                reg.setFees(20500.0);
                break;
            
        }
        
        reg.calculateFees(89);
        System.out.println("Registration Id: " + reg.getRegistrationId());
        System.out.print("Fees: " + reg.getFees());
                 
                    
    }
    
}
