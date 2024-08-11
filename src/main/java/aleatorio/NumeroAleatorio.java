package aleatorio;

import java.util.Scanner;

public class NumeroAleatorio {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    int numeroAdivinado;
    int intentos = 0;

    //numero = (int) Math.round((Math.random() * 99) + 1);
    numero = 20;
    System.out.println("Se ha generado un numero entre 1 a 100 intente adivinarlo solo tiene 3 "
        + "intentos");

    do {
      System.out.print("Adivine el numero : ");
      numeroAdivinado = Integer.parseInt(scanner.nextLine());

      intentos++;
      
      if (numeroAdivinado < numero) {
        System.out.println("El numero es mayor, intente otra vez");
      }

      if (numeroAdivinado > numero) {
        System.out.println("El numero es menor, intente otra vez");
      }

      if (intentos == 3) {
        System.out.println("Alcanzaste el limite de intentos");
      }

      System.out.println("intentos hechos " + intentos);

    } while (numeroAdivinado != numero && intentos < 3);

    if (numeroAdivinado != numero) {
      System.out.println("Alcanzaste el limite de intentos");
    } else {
      System.out.println("Lo lograste el numero es : " + numero);
    }
  }
}
