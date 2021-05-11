package designpatterns.builderpattern_employee;

public class _Employee {
  // In this class we will try to add employee details without the Builder patteern
  // firstName and LastName are mandatory
  // all other parameters are optional

  // For simplicity - we dont have any setter methods

  private String firstName;
  private String lastName;
  private int age;
  private String phone;

  public _Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public _Employee(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public _Employee(String firstName, String lastName, String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
  }

  public _Employee(String firstName, String lastName, int age, String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.phone = phone;
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
    return "_Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age
        + ", phone='" + phone + '\'' + '}';
  }
}
