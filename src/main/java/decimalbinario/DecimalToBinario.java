package decimalbinario;

/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
public class DecimalToBinario {

  public static void main(String[] args) {
    int numero = 80;
    int[] numeroBinary = new int[256];
    int counter = 0;
    String binary = "";
    String reverseBinary = "";

    do {
      numeroBinary[counter] = numero % 2;
      binary += numeroBinary[counter];
      numero = numero / 2;
      counter++;
    } while (numero != 0);

    for (int i = binary.length() - 1; i >= 0; i--) {
      reverseBinary += binary.charAt(i);
    }

    System.out.println(reverseBinary);
  }
}
