package factorial;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    long resultado;
    System.out.print("Introduce un numero para calcular el factorial: ");
    numero = scanner.nextInt();
    scanner.close();
    resultado = factorial(numero);
    System.out.println();
    System.out.println(numero + "! = " + resultado);
  }

  private static int factorial(int numero) {
    if (numero == 0) {
      return 1;
    }
    System.out.print(numero + "\t");
    return numero * factorial(numero - 1);
  }
}
