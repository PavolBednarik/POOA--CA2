/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooa.ca2;

import java.util.Scanner;

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
    private String username;
    private String password;

    //first constructor with default values
    public Employee() {
        this.name = "default Name";
        this.email = "default@Email..com"; 
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
    // setter for set name of employee
    public void setName(String name) {
        this.name = name;
    }

    //setter for email address with conditions
    public void setEmail(String email) {
        // I took regex from this site https://howtodoinjava.com/java/regex/java-regex-validate-email-address/
        String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        // condition for email. Email canot be 3 or less letter (with use of regex is usless but its requrement)
        if (email.length() <= 3) {
            System.out.println("Error: Email is to short!");
            return;
        // condition for email using regex for email validation
        } else if (!email.matches(regex)) {
            System.out.println("Error: enter a valid email address! ");
            System.out.println("Domain name must include at least one dot, and that the part of the domain name after the last dot can only consist of letters!");
            return;
        } else {
            this.email = email;
        }
        System.out.println("Employee added sucesfully");
    }

    //getter for nextEmpNum
    public static int getNextEmpNum() {
        return nextEmpNum;
    }

    // new constructor for employee with parameters username and password
    public Employee(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum;
        nextEmpNum++;
        this.username = username;
        this.password = password;
    }

    // getters and setters for username and password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
