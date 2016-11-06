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
public class Student {
    private int studentId;
    private int studentMarks;

    public Student() {
        this.studentId = 0;
        this.studentMarks = 75;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentMarks() {
        return studentMarks;
    }
    
    public boolean validateExamMarks(){
        if(this.studentMarks >= 65 && this.studentMarks <= 100)
            return true;
        return false;
    }
}
