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
public class EmployeeTest {
    //https://github.com/PavolBednarik/POOA--CA2.git
    
    public static void main(String[] args) {

        // creating 3 employees oject
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");

        // array project Group what store 3 employees
        Employee[] projectGroup = new Employee[3];
        projectGroup[0] = emp1;
        projectGroup[1] = emp2;
        projectGroup[2] = emp3;

        // printing number of next avalible employee number
        System.out.println("Next employee number: " + Employee.getNextEmpNum());

        // I set up value m on 0 so there it show all employees 
        int m = 0;
        for (Employee employee : projectGroup) {
            if (employee.getEmpNum() > m) {
                System.out.println(employee.getName());
            }
        }
        // new employee object as a manager
        Employee manager = new Employee("Michael Scott", "ms@gmail.com", "Gnomeo", "smurf");
        // creaed new company Business Gnómes Ltd.
        Company company = new Company("Business Gnómes Ltd. ");

        // consol where manager can login
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" ");
            System.out.println("Business Gnómes Ltd.");
            System.out.println("1.Manager login");
            System.out.println("2.Exit program");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    managerLogin(manager, company);
                    break;
                case "2":
                    System.exit(0);
                default:
                    System.out.println("Invalid input, please enter input from menu");
            }
        }
    }

    // creating manager menu
    public static void managerMenu(Employee manager, Company company) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" ");
            System.out.println("Manager menu");
            System.out.println("Please enter your choice:");
            System.out.println("1. View current staff");
            System.out.println("2. Add new staff");
            System.out.println("3. Remove staff");
            System.out.println("4. Exit menu");
            // using switch and scanner to get information from user
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    if (company.getStaffNumber()==0){
                        System.out.println("Employee list is empty");
                    }else{
                    company.listEmployee(0);
                    }
                    //company.listAllEmployee();// testing pourpose only
                    break;
                case "2":
                    Employee newEmployee = new Employee();
                    System.out.println("Enter new employee name");
                    String newname = sc.nextLine();
                    newEmployee.setName(newname);
                    System.out.println("Enter new employee email");
                    String newemail = sc.nextLine();
                    newEmployee.setEmail(newemail);
                    company.addNewStaff(newEmployee);
                    break;
                case "3":
                    while (true) {
                        System.out.println("Select employee by employee number to be removed");
                        if (sc.hasNextInt()) {
                            int removedStaff = sc.nextInt();
                            company.removeStaff(removedStaff);
                            sc.nextLine();
                            break;
                        } else {
                            System.out.println("Error: invalid input. Please enter a number.");
                            sc.nextLine();
                        }
                    }
                    break;
                case "4":
                    System.out.println("Logging out see you next time ");
                    return;
                default:
                    System.out.println("Invalid input, please enter input from menu");
            }
        }
    }

    // manager login method
    public static void managerLogin(Employee manager, Company company) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();
        // comparing if username and login match manager username and login
        if (username.equals(manager.getUsername()) && password.equals(manager.getPassword())) {
            managerMenu(manager, company);

        } else {
            System.out.println("Invalid username or password");
        }
    }
}
