package designpatterns.singleton;

public class StaticChocoBoiler {
  static class  TestClass {
    void printSomething() {
      System.out.println("Testing");
    }
  }

  public void mainClassMethod() {
    System.out.println("this is main class method");
  }

  static class AnotherTestClass {
    void printANother() {
      System.out.println("Testing");
    }
  }

}
