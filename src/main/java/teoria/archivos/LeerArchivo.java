package teoria.archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeerArchivo {

  public static void main(String[] args) {
    String ruta = "D:\\pruebasJavaArchivos\\texto.txt";
    try {
      FileWriter archivo = new FileWriter(ruta);
      archivo.write("Escribiendo en archivo\n");
      archivo.write("Penultima Linea\n");
      archivo.write("Linea Final");
      archivo.close();

      FileReader archivoLectura = new FileReader(ruta);
      BufferedReader leyendo = new BufferedReader(archivoLectura);
      String line = leyendo.readLine();

      while (line != null) {
        System.out.println(line);
        line = leyendo.readLine();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
