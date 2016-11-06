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
public class Student {
    private int studentId;
    private char studentType;

    public Student() {
        this.studentId = 0;
        this.studentType = 'N';
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getStudentType() {
        return studentType;
    }
    
    
}
