package designpatterns.prototypepattern;

import java.util.List;

public class EmployeeClient {

  public static void main(String[] args) throws CloneNotSupportedException {
    // Suppose we need to have multiple Employee instances.
    // In this client lets see how we can get Employee List.

    EmployeeWithoutPrototypePattern employee1 = new EmployeeWithoutPrototypePattern();
    // Now we have to invoke loadData
    employee1.loadData();
    // Now lets try to do some modifications in this data
    List<String> employeeList1 = employee1.getEmployeeList();
    employeeList1.add("Kevin");

    // Now Imagine that another instance wants to get the Employee List
    // he will have to make call to DB to load the data again

    EmployeeWithoutPrototypePattern employee2 = new EmployeeWithoutPrototypePattern();
    // Now we have to invoke loadData
    employee2.loadData();
    // Now lets try to do some modifications in this data
    List<String> employeeList2 = employee2.getEmployeeList();
    employeeList2.remove("Dave");

    System.out.println("Employee LIst 1:" + employeeList1);
    System.out.println("Employee LIst 2:" + employeeList2);
    System.out.println("----------------------------------");
    // ------------ Lets see the same implementation with Prototype Pattern ---------------- //

    EmployeeWithPrototypePattern employee_p = new EmployeeWithPrototypePattern();
    // The main aspect is : We need to load the data just once
    employee_p.loadData();
    List<String> employeeList = employee_p.getEmployeeList();
    System.out.println("Initial Employee List "+ employeeList);
    // For any new Instances we can simply clone the employeeList

    // We are just cloning the employee object rather than creating a new instance.
    EmployeeWithPrototypePattern employee3 = (EmployeeWithPrototypePattern) employee_p.clone();
    List<String> employeeList3 = employee3.getEmployeeList();
    employeeList3.add("Smith");

    System.out.println("Employee List 3: "+ employee3.getEmployeeList());

    EmployeeWithPrototypePattern employee4 = (EmployeeWithPrototypePattern) employee_p.clone();
    List<String> employeeList4 = employee4.getEmployeeList();
    employeeList4.remove("John");

    System.out.println("Employee List 4: "+ employee4.getEmployeeList());

    // Again - We did not load the data again for Employee3 and Employee4
    // Wee just cloned the employeee object and used it.

  }

}
