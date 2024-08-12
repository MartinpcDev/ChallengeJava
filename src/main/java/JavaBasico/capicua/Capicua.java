package JavaBasico.capicua;

import java.util.Scanner;

public class Capicua {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String numeroString = "";

    System.out.print("Ingrese un numero: ");
    int numero = scanner.nextInt();
    isCapicua(numero, numeroString);
  }

  private static void isCapicua(int numero, String numeroString) {
    int numeroSave = numero;
    while (numero > 0) {
      int temp = numero % 10;
      numeroString += temp;
      numero /= 10;
    }

    if (numeroSave == Integer.parseInt(numeroString)) {
      System.out.println("EL numero es EjerciciosConsola.capicua");
    } else {
      System.out.println("EL numero NO es EjerciciosConsola.capicua");
    }
  }
}
