/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_logic;

/**
 *
 * @author pavan
 */
public class demo {
    public static void main(String[] args){
        Student s =new Student();
        s.setCourseType('L');
        s.setOptedCourse("Maths");
        s.setStudentAge(20);
        s.setStudentName("Jasmine");
        
        if(s.validateStudentDetails())
            s.setPayableFees(s.calculateFeePayable());
        
        System.out.println(s.getPayableFees());
    }
    
}
