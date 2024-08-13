package juegoExcabacion;

import java.util.Scanner;

public class JuegoExcabar {

  private static int derrumbe = 1;
  private static int diamante = 1;

  private int carbon = 0;
  private int oro = 0;
  private int diamantes = 0;

  private static boolean derrumbado = false;
  private static boolean jugando = true;
  private final Scanner consola = new Scanner(System.in);

  public void jugar() {
    while (!derrumbado && jugando) {
      menuEleccion();
    }

    finalPartida();
  }

  private void finalPartida() {
    if (derrumbado) {
      System.out.println("Perdiste la vida y la partida. Tu cuerpo esta bajo toneladas de tierra");
    } else {
      System.out.println("Conseguiste salir a tiempo");
      System.out.println("Has conseguido " + carbon + " kilos de carbon. Son "
          + carbon + " puntos.");
      System.out.println("Has conseguido " + oro + " kilos de oro. Son " + oro * 10 + " puntos.");
      System.out.println("Has conseguido " + diamantes + " diamantes. Son "
          + diamantes * 50 + " puntos.");
      int total = carbon + (oro * 50) + (diamantes * 50);
      tablaPuntuacion(total);
    }
  }

  private void tablaPuntuacion(int total) {
    System.out.println("Tu puntuacion total es de " + total + " puntos.");
    if (total < 100) {
      System.out.println("Sigues siendo pobre");
    } else if (total < 500) {
      System.out.println("Al menos viviras 25 años a gusto");
    } else {
      System.out.println("Eres rico.");
    }
  }

  private void menuEleccion() {
    mostrarMateriales();
    System.out.println("1 - Seguir cavando.");
    System.out.println("2 - Retirarme.");
    System.out.print("Elige una opcion: ");
    int opcion = consola.nextInt();
    switch (opcion) {
      case 1 -> cavar();
      case 2 -> jugando = false;
      default -> System.out.println("Eleccion erronea:.");
    }
  }

  private void mostrarMateriales() {
    System.out.println("Carbon: " + carbon + " - Oro: " + oro + " - Diamantes: " + diamantes);
  }

  private void cavar() {
    int d = (int) (Math.random() * 100 + 1);
    if (d <= derrumbe) {
      derrumbado = true;
    } else {
      int material = (int) (Math.random() * 100 + 1);
      if (material <= diamante) {
        diamantes++;
        System.out.println("Has encontrado un diamante");
      } else if (material <= (20 + diamante)) {
        oro++;
        System.out.println("Has encontrado oro");
      } else {
        carbon++;
        System.out.println("Solo encontraste carbon.");
      }

      derrumbe++;
      diamante += 2;
    }
  }
}
