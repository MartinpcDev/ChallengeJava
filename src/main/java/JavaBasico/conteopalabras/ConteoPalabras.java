package JavaBasico.conteopalabras;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */
public class ConteoPalabras {

  public static void main(String[] args) {
    String palabra = "ornitorrinco";
    int i;
    int length = palabra.toLowerCase().length();
    int[] counter = new int[256];

    for (i = 0; i < length; i++) {
      counter[palabra.charAt(i)]++;
    }

    for (i = 0; i < counter.length; i++) {
      if (counter[i] != 0) {
        System.out.println((char) i + ": " + counter[i]);
      }
    }

  }
}
