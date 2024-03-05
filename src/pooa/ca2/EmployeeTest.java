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

        // test if employees are in array
//        for (Employee employee : projectGroup){
//            System.out.println(employee.getName()+ " " + employee.getEmail() + " " + employee.getEmpNum()) ;
//        }
        // printing number of next avalible employee number
        System.out.println("Next employee number: " + Employee.getNextEmpNum());

        // I set up value m on 1 so there is 2 employees after with number higher than 1
        int m = 1;
        for (Employee employee : projectGroup) {
            if (employee.getEmpNum() > m) {
                System.out.println(employee.getName());
            }
        }
        // new employee object as a manager
        Employee manager = new Employee("Michael Scott", "ms@gmail.com", "Gnomeo", "smurf");

        // populating company object for testing purpouse only
        Company company = new Company("Business Gnómes Ltd. ");
        company.addNewStaff(emp1);
        company.addNewStaff(emp2);
        company.addNewStaff(emp3);
        company.addNewStaff(manager);

        company.listEmployee(0);
        // consol where manager can login
        try {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1.Manager login");
                System.out.println("2.Exit program");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        managerLogin(manager, company);
                        break;
                    case 2:
                        System.exit(0);
                    default:
                        System.out.println("Invalid input, please enter input from menu");
                }

            }

        } catch (Exception e) {
            System.out.println("Invalid input, exiting program");
        }
    }

    // creating manager menu
    public static void managerMenu(Employee manager, Company company) {
        // try and catch if they input not numeric value
        try {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Manager menu");
                System.out.println("Please enter your choice:");
                System.out.println("1. View current staff");
                System.out.println("2. Add new staff");
                System.out.println("3. Logout");
                // using switch and scanner to get information from user
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        company.listEmployee(0);
                        break;
                    case 2:
                        Employee newEmployee = new Employee();
                        sc.nextLine();
                        System.out.println("name");
                        String name = sc.nextLine();
                        System.out.println("email");
                        newEmployee.setName(name);
                        String email = sc.nextLine();
                        newEmployee.setEmail(email);
                        if (email.isEmpty()||name.isEmpty()){
                            System.out.println("not added");
                        }else {
                        company.addNewStaff(newEmployee);
                        }
                        break;
                    case 3:
                        System.out.println("Logging out see you next time ");
                        return;
                    default:
                        System.out.println("Invalid input, please enter input from menu");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input, logging out");
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
