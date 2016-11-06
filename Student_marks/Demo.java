/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_marks;

/**
 *
 * @author pavan
 */
public class Demo {
     public static void main(String[] args){
         int marks = 50;
         
         Student obj = new Student();
         Demo d = new Demo();
         d.output(obj);
         
         obj.setStudentMarks(marks);
         d.output(obj);
         
             
     }
     
     public void output(Student obj){
        if(obj.validateExamMarks())
             System.out.println("Valid Marks");
         else 
            System.out.println("Invalid Marks");
     }
    
}
