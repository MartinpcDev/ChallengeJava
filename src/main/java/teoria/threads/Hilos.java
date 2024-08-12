package teoria.threads;

public class Hilos {

  public static void main(String[] args) {
    Hilo1 hilo1 = new Hilo1();
    hilo1.start();
    Thread hilo2 = new Thread(new Hilo2());
    hilo2.start();
  }
}

class Hilo1 extends Thread {

  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("Bucle de la clase hilo1");
    }
  }
}

class Hilo2 implements Runnable {


  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("Bucle de la clase hilo2");
    }
  }
}
