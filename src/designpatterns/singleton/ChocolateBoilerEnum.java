package designpatterns.singleton;

enum  ChocolateBoilerEnum {

  INSTANCE;

  private boolean empty;
  private boolean boiled;
  private static ChocolateBoilerEnum chocolateBoiler;

  ChocolateBoilerEnum() {
    System.out.println("New Chocolate Boiler Enum Installed");
    empty = true;
    boiled = false;
  }
  public void fill() {
    System.out.println("Trying to fill");
    if(isEmpty()) {
      empty = false;
      System.out.println("Fill Successful");
    }
  }

  public void drain() {
    System.out.println("Trying to Drain");
    if(!isEmpty() && isBoiled()) {
      empty = true;
      System.out.println("Drained");
    }
  }

  public void boil() {
    System.out.println("Trying to boil");
    if(!isEmpty() && !isBoiled()) {
      boiled = true;
      System.out.println("Boiled");
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }

  @Override
  public String toString() {
    return "Our Chocolate Boiler is empty = " + empty + " and it is boiled = " + boiled ;
  }
}
