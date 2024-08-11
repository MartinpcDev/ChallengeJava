package rectangulo;

import java.util.Scanner;

public class DrawRectangulo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int altura;
    int base;

    System.out.print("Digite la altura: ");
    altura = Integer.parseInt(scanner.nextLine());

    System.out.print("Digite la base: ");
    base = Integer.parseInt(scanner.nextLine());

    System.out.println("Dibujo: ");

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < base; j++) {
        if (i == 0 || i == altura - 1) {
          System.out.print("*");
        } else {
          if (j == 0 || j == base - 1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }

    System.out.println("El area del poligono es  " + (base * altura) + " metros cuadrados");
  }
}
