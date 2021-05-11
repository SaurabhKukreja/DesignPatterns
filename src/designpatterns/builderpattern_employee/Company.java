package designpatterns.builderpattern_employee;

public class Company {

  public static void main(String[] args) {

    // Lets create new _Employee in the company
    // this is without the Builder Pattern
    _Employee _employee1 = new _Employee("John", "Smith");
    _Employee _employee2 = new _Employee("Dave", "Johnson", 45);
    _Employee _employee3 = new _Employee("Kevin", "Randall", "888-999-1234");
    _Employee _employee4 = new _Employee("Steve", "Matthews", 32, "888-111-1234");

    System.out.println("********Without Builder Pattern*******");
    System.out.println("Employee: " + _employee1.toString());
    System.out.println("Employee: " + _employee2.toString());
    System.out.println("Employee: " + _employee3.toString());
    System.out.println("Employee: " + _employee4.toString());

    System.out.println("********With Builder Pattern*******");
    Employee employee1 = new EmployeeBuilder("John", "Smith").build();
    Employee employee2 = new EmployeeBuilder("Dave", "Johnson")
        .setAge(45)
        .build();
    Employee employee3 = new EmployeeBuilder("Kevin", "Randall")
        .setPhone("888-999-1234")
        .build();
    Employee employee4 = new EmployeeBuilder("Steve", "Matthews")
        .setAge(32)
        .setPhone("888-111-1234")
        .build();

    System.out.println("Employee: " + employee1.toString());
    System.out.println("Employee: " + employee2.toString());
    System.out.println("Employee: " + employee3.toString());
    System.out.println("Employee: " + employee4.toString());
  }
}
