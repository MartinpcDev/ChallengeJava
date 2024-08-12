package JavaBasico.inversorcadenas;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class InversorCadenas {

  public static void main(String[] args) {
    String palabra = "orellana";
    String reversePalabra = "";
    //StringBuilder reversePalabra = new StringBuilder();

    for (int i = palabra.length() - 1; i >= 0; i--) {
      //reversePalabra.append(palabra.charAt(i));
      reversePalabra += palabra.charAt(i);
    }

    System.out.println(reversePalabra);
  }
}
