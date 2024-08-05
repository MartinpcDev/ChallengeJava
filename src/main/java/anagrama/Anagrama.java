package anagrama;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class Anagrama {

  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.print("Ingrese la primera palabra: ");
    String word1 = consola.nextLine();
    System.out.print("Ingrese la primera palabra: ");
    String word2 = consola.nextLine();
    System.out.println("Es un anagrama? : " + isAnagrama(word1, word2));
  }

  private static boolean isAnagrama(String word1, String word2) {
    if (word1.equalsIgnoreCase(word2)) {
      return false;
    }
    char[] charWord1 = word1.toLowerCase().toCharArray();
    char[] charWord2 = word2.toLowerCase().toCharArray();
    Arrays.sort(charWord1);
    Arrays.sort(charWord2);

    return Arrays.equals(charWord1, charWord2);
  }
}
