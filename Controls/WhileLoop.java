/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

/**
 *
 * @author pavan
 */
public class WhileLoop {
     public static void main(String[] args){
        
        int i = 50;
        while(i++ < 80)
        {
            if(i%2 == 0)
                System.out.println(i);
        }
}
