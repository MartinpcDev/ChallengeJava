package varios;

import java.util.Scanner;
import javax.swing.Timer;

public class Reloj {

  public static void main(String[] args) {
    Juego juego = new Juego();
    juego.comenzar();
  }
}

class Juego {

  private int segundosNecesarios;
  private static int segundos = 0;
  private final Scanner scanner = new Scanner(System.in);
  private final Timer reloj = new Timer(1000, e -> {
    segundos++;
  });

  private void getInfo() {
    System.out.println("Te dire un numero en segundos.");
    System.out.println("El contador comenzara, pero no lo vera.");
    System.out.println("Pulsa ENTER para detenerlo.");
    System.out.println("Si lo haces en el segundo exacto ganaras la partida.");
    System.out.println("PULSA ENTER PARA COMENZAR");
    scanner.nextLine();
  }

  public void comenzar() {
    getInfo();
    partida();
    comprobarVictoria();
  }

  private void comprobarVictoria() {
    if (segundosNecesarios == segundos) {
      System.out.println("Has ganado. se ha detenido en el segundo exacto");
    } else {
      System.out.println("Has perdido. Lo has detenido en el segundo: " + segundos);
    }
  }

  private void partida() {
    segundosNecesarios = (int) (Math.random() * 5 + 5);
    System.out.println("Deten el reloj en el segundo.....!" + segundosNecesarios + "¡");
    reloj.start();
    scanner.nextLine();
    reloj.stop();
  }
}
