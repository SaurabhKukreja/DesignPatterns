package designpatterns.singleton_youtube;

public class Country {

  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        Government government = Government.getInstance();
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        Government government2 = Government.getInstance();
      }
    });

    thread.start();
    thread2.start();
  }
}
