package varios;

public class PasswordGenerator {

  public static void main(String[] args) {
    Generator generator = new Generator(12, 10);
  }
}

class Generator {

  String[] pass;

  public Generator(int nPass, int longitud) {
    pass = new String[nPass];
    generarPass(longitud);
    mostrarPass();
  }

  private void mostrarPass() {
    for (String s : pass) {
      System.out.println("Contraseña generada: " + s);
    }
  }

  private void generarPass(int longitud) {
    for (int i = 0; i < pass.length; i++) {
      StringBuilder passActual = new StringBuilder();
      for (int j = 0; j < longitud; j++) {
        passActual.append(generarChar());
      }
      pass[i] = passActual.toString();
    }
  }

  private char generarChar() {
    boolean esValida = false;
    int n = 0;

    while (!esValida) {
      n = (int) (Math.random() * 123);
      if (esNumeroOLetra(n)) {
        esValida = true;
      }
    }

    return (char) n;
  }

  private boolean esNumeroOLetra(int n) {
    return (n == 45 || n == 95 ||
        (n >= 48 && n <= 57) ||
        (n >= 65 && n <= 90) ||
        (n >= 97 && n <= 122));
  }
}
