package designpatterns.singleton;

public class ChocolateBoiler {

  private boolean empty;
  private boolean boiled;

  private static ChocolateBoiler chocolateBoiler;

  private ChocolateBoiler() {
    System.out.println("New Chocolate Boiler Installed");
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

  public static ChocolateBoiler getInstance() {
    if(chocolateBoiler == null) {
      synchronized (ChocolateBoiler.class) {
        if(chocolateBoiler == null) {
          chocolateBoiler = new ChocolateBoiler();
        }
      }
    }
    return chocolateBoiler;
  }

  @Override
  public String toString() {
    return "Our Chocolate Boiler is empty = " + empty + " and it is boiled = " + boiled ;
  }
}
