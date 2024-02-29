/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooa.ca2;

/**
 *
 * @author pavol
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        
        // creating 3 employees oject
        Employee emp1 = new Employee("Joe Bloggs","jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana","ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb","tt@gmail.com");
        
        // array project Group what store 3 employees
        Employee[] projectGroup = new Employee[3];
        projectGroup[0] = emp1;
        projectGroup[1] = emp2;
        projectGroup[2] = emp3;
        
        // test if employees are in array
//        for (Employee employee : projectGroup){
//            System.out.println(employee.getName()+ " " + employee.getEmail() + " " + employee.getEmpNum()) ;
//        }
        
        // printing number of next employee
        System.out.println("Next employee number: "+ Employee.getNextEmpNum());
        
        int m =1;
        for (Employee employee :projectGroup) {
            if (employee.getEmpNum()> m) {
            System.out.println(employee.getName());
            }
        }
    }
}
