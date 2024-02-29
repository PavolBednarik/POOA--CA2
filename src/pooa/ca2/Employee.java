/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooa.ca2;

/**
 *
 * @author pavol
 */
public class Employee {

   
    // instance fields
    private String name;
    private String email;
    private int empNum;
    private static int nextEmpNum = 1; // static field nextEmpNum
    
    //first constructor with default values
    public Employee() {
        this.name = "default Name";
        this.email = "defaultemail@gmail.com";
        this.empNum = nextEmpNum;
        nextEmpNum++; // need to increase with every new employee
    }
    //second constructor with vlues passed as parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum;
        nextEmpNum++; // need to increase with every new employee
    }

    // getters for name email and empNum
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return empNum;
    }

    //setter for email address with conditions
    public void setEmail(String email) {
        if(email.length()<=3){
            System.out.println("Incorrect lenght of email!");
            // another email validation
        }else
            this.email = email;
    }
    
    //getter for nextEmpNum
    public static int getNextEmpNum() {
        return nextEmpNum;
    }
    
}
