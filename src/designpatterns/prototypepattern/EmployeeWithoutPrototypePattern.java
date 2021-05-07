package designpatterns.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWithoutPrototypePattern {

  List<String> employeeList;

  public EmployeeWithoutPrototypePattern() {
    employeeList = new ArrayList<String>();
  }

  public EmployeeWithoutPrototypePattern(List<String> employeeList) {
    this.employeeList = employeeList;
  }

  public void loadData() {

    // Consider this method makes a call to DB or to an external API
    // to get the list of Employees .
    // To keep it simple we will simply add it in Array List.

    employeeList.add("Dave");
    employeeList.add("John");
    employeeList.add("Neil");
    employeeList.add("Steve");

  }

  public List<String> getEmployeeList() {
    return employeeList;
  }



}
