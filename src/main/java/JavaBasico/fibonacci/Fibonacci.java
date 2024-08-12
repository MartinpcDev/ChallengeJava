package JavaBasico.fibonacci;

import java.util.stream.IntStream;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Fibonacci {

  public static void main(String[] args) {
    int range = 13;
    final int[] numero0 = {0};
    final int[] numero1 = {1};
    //System.out.println(Arrays.toString(fibonacciList(range)));
    IntStream.range(0, range).forEach(element -> {
      System.out.print("[" + numero0[0] + "]\t");
      int fib = numero0[0] + numero1[0];
      numero0[0] = numero1[0];
      numero1[0] = fib;
    });
  }

  private static int[] fibonacciList(int range) {
    int[] array = new int[range];
    array[0] = 0;
    array[1] = 1;
    for (int i = 2; i < range; i++) {
      array[i] = array[i - 2] + array[i - 1];
    }

    return array;
  }
}
