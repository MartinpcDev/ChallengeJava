package varios;

public class CarreraVehiculo {

  public static void main(String[] args) {
    Vehiculo uno = new Vehiculo("Coche");
    Vehiculo dos = new Vehiculo("Moto");
    Vehiculo tres = new Vehiculo("Caracol de Carreras");

    uno.start();
    dos.start();
    tres.start();
  }
}

class Vehiculo extends Thread {

  private int dRecorrida = 0;

  public Vehiculo(String nombre) {
    setName(nombre);
  }

  public void run() {
    while (true) {
      try {
        Thread.sleep((long) (Math.random() * 400) + 100);
        dRecorrida += 10;
        System.out.println(getName() + " ha recorrido " + dRecorrida + " metros.");

        if (dRecorrida >= 120) {
          System.out.println(getName() + " ha alcanzado la meta. " + getName() + " Es el "
              + "Ganador!!!");
          System.exit(0);
        }
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
