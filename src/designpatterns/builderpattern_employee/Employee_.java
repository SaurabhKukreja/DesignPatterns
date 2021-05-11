package designpatterns.builderpattern_employee;

public class Employee_ {
  // The first approach that we implemented in Employee class is using Builder pattern
  // That approach is completely fine and as per standards, so I am just showing how the same
  // implementation can be achieved in much simpler form.

  // So you can decide accordingly if you think your problem is complex
  // go with standard builder pattern
  // else you can follow the approach in this class.

  private String firstName;
  private String lastName;
  private int age;
  private String phone;

  public Employee_ withFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public Employee_ withlastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public Employee_ withPhone(String phone) {
    this.phone = phone;
    return this;
  }

  public Employee_ withAge(int age) {
    this.age = age;
    return this;
  }

  @Override
  public String toString() {
    return "Employee_{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age
        + ", phone='" + phone + '\'' + '}';
  }
}
