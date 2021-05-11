package designpatterns.builderpattern_employee;

public class EmployeeBuilder {

  public String firstName;
  public String lastName;
  public int age;
  public String phone;

  public EmployeeBuilder(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public EmployeeBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public EmployeeBuilder setPhone(String phone) {
    this.phone = phone;
    return this;
  }

  public Employee build() {
    Employee employee = new Employee(this);
    return employee;
  }

}
