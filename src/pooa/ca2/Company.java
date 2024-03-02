/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooa.ca2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pavol
 */
public class Company {
    
    String companyName;
    ArrayList<Employee> staff = new ArrayList<>();

    // constructor with default value
    public Company() {
        this.companyName = "default company";
        this.staff = new ArrayList<>();
    }

    // overloaded constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
    
    // metod for adding new staff
    public void addNewStaff(Employee employee){
        staff.add(employee);
    }
    
    // method what return number of employees in array 
    public int getStaffNumber(){
        return staff.size();
    }
    
    // method listEmployee using Iterator (netbean sugestion simple for loop )
    public void listEmployee(int empNumValue){
    Iterator<Employee> empIterator = staff.iterator();
    while (empIterator.hasNext()) {
            Employee employee = empIterator.next();
            if (employee.getEmpNum()> empNumValue) {
                System.out.println(employee.getName());
                
            }
        }
    }
}
