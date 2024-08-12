package JavaBasico.sumadigitospares;

import java.util.Scanner;

public class SumaPares {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int suma = 0;

    System.out.print("Introduce un numero: ");
    long numero = scanner.nextLong();

    while (numero > 0) {
      long temp = numero % 10;
      if (temp % 2 == 0) {
        suma += (int) temp;
      }
      numero /= 10;
    }

    System.out.println("La suma de pares es : " + suma);
    System.out.println("La suma de pares es : " + withMethods(numero, suma));
  }

  private static int withMethods(long numero, int suma) {
    String numeroString = Long.toString(numero);
    int[] arrayNumero = new int[numeroString.length()];

    for (int i = 0; i < numeroString.length(); i++) {
      arrayNumero[i] = numeroString.charAt(i) - '0';
      if (arrayNumero[i] % 2 == 0) {
        suma += arrayNumero[i];
      }
    }

    return suma;
  }
}
