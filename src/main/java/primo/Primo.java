package primo;

import java.util.stream.IntStream;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class Primo {

  public static void main(String[] args) {

    IntStream.range(1, 101).forEach(elemento -> System.out.println(elemento + isPrimo(elemento)));
  }

  private static String isPrimo(int numero) {
    boolean rpta = numero > 1;

    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        rpta = false;
        break;
      }
    }

    return rpta ? " es Primo" : " no es Primo";
  }
}
