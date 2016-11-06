/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS;


/**
 *
 * @author pavan
 */
public class Employee {
    private char gender;
    private float allowances;
    private double basicSalary;
    final int age = 25;
  
    Employee()
    {
        this.gender = 'M';
        this.allowances = 1000.00f;
        this.basicSalary = 10000.00;
        //this.age = 30;
    }
    
    public void setEmployeeData(char g, float all, double sal)
            {
                this.gender = g;
                this.allowances = all;
                this.basicSalary = sal;
            }
    public void display()
    {
        System.out.println(this.gender);
        System.out.println(this.allowances);
        System.out.println(this.basicSalary);
        System.out.println(this.age);
    }
}
