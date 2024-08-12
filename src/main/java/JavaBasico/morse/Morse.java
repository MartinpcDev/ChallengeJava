package JavaBasico.morse;

import java.util.HashMap;
import java.util.Map;

/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * EjerciciosConsola.morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En EjerciciosConsola.morse se soporta raya '—', punto '.', un espacio' ' entre letras
 *   o símbolos y dos espacios entre palabras' '.
 * - El alfabeto EjerciciosConsola.morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */
public class Morse {

  private static final HashMap<Character, String> textToMorse = new HashMap<>();
  private static final HashMap<String, Character> morseToText = new HashMap<>();

  static {
    textToMorse.put('A', ".-");
    textToMorse.put('B', "-...");
    textToMorse.put('C', "-.-.");
    textToMorse.put('D', "-..");
    textToMorse.put('E', ".");
    textToMorse.put('F', "..-.");
    textToMorse.put('G', "--.");
    textToMorse.put('H', "....");
    textToMorse.put('I', "..");
    textToMorse.put('J', ".---");
    textToMorse.put('K', "-.-");
    textToMorse.put('L', ".-..");
    textToMorse.put('M', "--");
    textToMorse.put('N', "-.");
    textToMorse.put('O', "---");
    textToMorse.put('P', ".--.");
    textToMorse.put('Q', "--.-");
    textToMorse.put('R', ".-.");
    textToMorse.put('S', "...");
    textToMorse.put('T', "-");
    textToMorse.put('U', "..-");
    textToMorse.put('V', "...-");
    textToMorse.put('W', ".--");
    textToMorse.put('X', "-..-");
    textToMorse.put('Y', "-.--");
    textToMorse.put('Z', "--..");
    textToMorse.put('0', "-----");
    textToMorse.put('1', ".----");
    textToMorse.put('2', "..---");
    textToMorse.put('3', "...--");
    textToMorse.put('4', "....-");
    textToMorse.put('5', ".....");
    textToMorse.put('6', "-....");
    textToMorse.put('7', "--...");
    textToMorse.put('8', "---..");
    textToMorse.put('9', "----.");
    textToMorse.put(' ', "  ");

    for (Map.Entry<Character, String> entry : textToMorse.entrySet()) {
      morseToText.put(entry.getValue(), entry.getKey());
    }
  }

  public static String toMorse(String text) {
    StringBuilder morse = new StringBuilder();
    for (char c : text.toUpperCase().toCharArray()) {
      morse.append(textToMorse.getOrDefault(c, "")).append(" ");
    }
    return morse.toString().trim();
  }

  public static String toText(String morse) {
    StringBuilder text = new StringBuilder();
    String[] morseWords = morse.split(" {3}");
    for (String morseWord : morseWords) {
      for (String morseChar : morseWord.split(" ")) {
        text.append(morseToText.getOrDefault(morseChar, ' '));
      }
      text.append(' ');
    }

    return text.toString().trim();
  }

  public static boolean isMorse(String input) {
    return input.trim().startsWith(".") || input.trim().startsWith("-");
  }

  public static void main(String[] args) {
    String input1 = "Hola mundo";
    String input2 = ".... --- .-.. .-  -- ..- -. -.. ---";

    if (isMorse(input1)) {
      System.out.println("Texto Natural: " + toText(input1));
    } else {
      System.out.println("Codigo Morse: " + toMorse(input1));
    }

    if (isMorse(input2)) {
      System.out.println("Texto Natural: " + toText(input2));
    } else {
      System.out.println("Codigo Morse: " + toMorse(input2));
    }
  }
}
