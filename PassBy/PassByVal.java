/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassBy;

import sun.applet.Main;

/**
 *
 * @author pavan
 */
public class PassByVal {
    
    public static void main(String args[])
    {
        int sId = 25;
        PassByVal val = new PassByVal();
        System.out.println(sId);
        val.passTheValueMethod(sId);
        System.out.println(sId);
        
        Student obj = new Student();
        System.out.println("Student Id: " + obj.getStudentId());
        System.out.println("Student Type" + obj.getStudentType());
        val.passTheValueMethod(obj);
        System.out.println("Student Id: " + obj.getStudentId());
        System.out.println("Student Type" + obj.getStudentType());       
   
}

public void passTheValueMethod(int sId){
sId = 10;
System.out.println("The sId are" + sId);
}
   
public void passTheValueMethod(Student obj)
{
    obj.setStudentId(1234);
    obj.setStudentType('A');
}
}
