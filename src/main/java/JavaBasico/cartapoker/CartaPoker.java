package JavaBasico.cartapoker;

public class CartaPoker {

  public static void main(String[] args) {
    String palo = getPalo();
    String carta = getCarta();

    System.out.println("Tu carta es: " + carta + " de " + palo);
  }

  private static String getPalo() {
    int numero = (int) (Math.random() * 4 + 1);
    switch (numero) {
      case 1 -> {
        return "Picas";
      }
      case 2 -> {
        return "Diamantes";
      }
      case 3 -> {
        return "Trebol";
      }
      default -> {
        return "Corazones";
      }
    }
  }

  private static String getCarta() {
    int numero = (int) (Math.random() * 13 + 1);

    if (numero == 1) {
      return "As";
    } else if (numero > 1 && numero < 11) {
      return Integer.toString(numero);
    } else if (numero == 11) {
      return "J";
    } else if (numero == 12) {
      return "Q";
    } else {
      return "K";
    }
  }
}
