package varios;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador {

  static int segundos;

  public static void main(String[] args) {

    segundos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos segundos quieres poner?"));

    Timer reloj = new Timer(1000, e -> {
      System.out.println("Segundos que faltan: " + segundos);
      if (segundos == 0) {
        Toolkit.getDefaultToolkit().beep();
      }
      segundos--;
    });

    while (segundos >= 0) {
      reloj.start();
    }

    reloj.stop();
  }
}
