package promedio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromedioNumeros {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();
    int sum = 0;
    double average;
    int operacion = 0;
    boolean status = false;
    System.out.print("Ingrese la cantidad de numeros: ");
    int quantity = Integer.parseInt(scanner.nextLine());

    do {
      operacion++;
      System.out.print("Ingrese el " + operacion + "° numero : ");
      int numero = Integer.parseInt(scanner.nextLine());
      numeros.add(numero);
      sum += numero;
    } while (!status && operacion < quantity);

    average = (double) sum / numeros.size();
    System.out.println("El promedio es: " + average);
  }
}
