/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_register;

/**
 *
 * @author pavan
 */
public class CourseManagement {
    public static void main(String[] args){
        Student obj;
        obj = new Student();
        obj.setStudentId(1001);
        obj.setStudentType('M');
        System.out.println("Student ID:" + obj.getStudentId());
        System.out.println("Student Type:" + obj.getStudentType());
    }
    
}
