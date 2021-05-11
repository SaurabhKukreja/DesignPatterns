package designpatterns.builderpattern_employee;

public class Employee {
  // In this class we will try to modify _Employee to use the builder pattern.
  // Considering firstName and LastNamee are madatory and rest all the params are optional.

  // Using this builder pattern we can make sure the Employee object is immutable.

  private String firstName;
  private String lastName;
  private int age;
  private String phone;

  public Employee(EmployeeBuilder employeeBuilder) {
    this.firstName = employeeBuilder.firstName;
    this.lastName = employeeBuilder.lastName;
    this.age = employeeBuilder.age;
    this.phone = employeeBuilder.phone;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public String getPhone() {
    return phone;
  }

  @Override
  public String toString() {
    return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age
        + ", phone='" + phone + '\'' + '}';
  }
}
