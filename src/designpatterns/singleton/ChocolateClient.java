package designpatterns.singleton;

import designpatterns.singleton.StaticChocoBoiler.TestClass;

public class ChocolateClient {

  public static void main(String[] args) {
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
      }
    });
    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
        boiler1.fill();
        boiler1.boil();
        boiler1.drain();
      }
    });
    t1.start();
    t2.start();

    ChocolateBoilerEnum boilerEnum = ChocolateBoilerEnum.INSTANCE;
    boilerEnum.fill();
    System.out.println("++++"+boilerEnum.isEmpty());

    StaticChocoBoiler.TestClass testClass = new StaticChocoBoiler.TestClass();
    testClass.printSomething();
    

  }

}
