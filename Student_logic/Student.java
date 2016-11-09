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
public class Student {
    private int studentAge;
    private String studentName;
    private String optedCourse;
    private char courseType;
    private double payableFees;

    public Student() {
        this.studentAge=0;
        
    }

    public void setCourseType(char courseType) {
        this.courseType = courseType;
    }

    public void setOptedCourse(String optedCourse) {
        this.optedCourse = optedCourse;
    }

    public void setPayableFees(double payableFees) {
        this.payableFees = payableFees;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getCourseType() {
        return courseType;
    }

    public String getOptedCourse() {
        return optedCourse;
    }

    public double getPayableFees() {
        return payableFees;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentName() {
        return studentName;
    }
    
    public boolean validateStudentDetails(){
        if(this.studentAge < 16)
            return false;
        
        if(this.studentName.length() <3 || this.studentName.length()>20)
            return false;
        
        if(this.courseType != 'L' && this.courseType !='S')
            return false;
        
        switch(this.optedCourse){
            case "Maths":
            case "Physics":                    
            case "Chemistry":
            case "Computers":
                return true;
        }
        
        return false;
    }
    
    public double calculateFeePayable(){
        if(this.optedCourse.matches("Maths")){
            if(this.courseType == 'L')
                return 20000;
            else if(this.courseType == 'S')
                return 40000;
        }
        else if(this.optedCourse.matches("Physics")){
            if(this.courseType == 'L')
                return 15000;
            else if(this.courseType == 'S')
                return 30000;
        
        }
        else if(this.optedCourse.matches("Chemistry")){
            if(this.courseType == 'L')
                return 16000;
            else if(this.courseType == 'S')
                return 32000;
        }
        else if(this.optedCourse.matches("Computers")){
            if(this.courseType == 'L')
                return 22000;
            else if(this.courseType =='S')
                return 30000;
        }
        return 0;
    }
    
}
