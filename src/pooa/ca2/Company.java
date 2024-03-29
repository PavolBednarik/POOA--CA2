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

    private String companyName;
    private ArrayList<Employee> staff;

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
    public void addNewStaff(Employee employee) {
        // adding regex to validate that if they add wrong email addres it wont be added 
        String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        if (employee.getEmail().matches(regex)) {
            staff.add(employee);
        } else {
            System.out.println("Employee not added!");
        }
    }

    // method what return number of employees in array 
    public int getStaffNumber() {
        return staff.size();
    }

    // method listEmployee using Iterator (netbean sugestion simple for loop )
    public void listEmployee(int empNumValue) {
        Iterator<Employee> empIterator = staff.iterator();
        while (empIterator.hasNext()) {
            Employee employee = empIterator.next();
            if (employee.getEmpNum() > empNumValue) {
                System.out.println(employee.getName());

            }
        }
    }

//    // method used only for testing purpouse
//    public void listAllEmployee() {
//        for (Employee employee : staff) {
//            System.out.println(employee.getName() + " " + employee.getEmail() + " " + employee.getEmpNum());
//        }
//    }
    // method that remove staff fromm arraylist using iterator
    public void removeStaff(int empNum) {
        //checking if employee list is empty
        if(getStaffNumber()==0){
            System.out.println("Employee list is empty");
            return;
        }
        Iterator<Employee> empIterator = staff.iterator();
        while (empIterator.hasNext()) {
            Employee employee = empIterator.next();
            if (employee.getEmpNum() == empNum) {
                empIterator.remove();
                System.out.println("Employee removed.");
                return;
            }
        }
        System.out.println("Employee not found");
    }
}
