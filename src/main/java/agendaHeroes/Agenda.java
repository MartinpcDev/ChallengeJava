package agendaHeroes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

  private final ArrayList<Superheroe> agenda = new ArrayList<>();
  private final Scanner consola = new Scanner(System.in);

  public void iniciarAgenda() {
    leerDatosGuardados();
    menu();
  }

  private void menu() {
    System.out.print("""
        1 - Añadir nuevo heroe.
        2 - Ver heroes guardados.
        3. Salir.
        Elige una opcion:""");
    int opcion = consola.nextInt();
    switch (opcion) {
      case 1 -> {
        addHeroe();
      }
      case 2 -> {
        verHeroes();
      }
      case 3 -> {
        guardarHeroes();
        System.exit(0);
      }
      default -> {
        System.out.println("El dato introducido no es correcto.");
        menu();
      }
    }
  }

  private void guardarHeroes() {
    try {
      FileWriter escrituraArchivo = new FileWriter("D:\\pruebasJavaArchivos\\agenda.txt");

      for (Superheroe superheroe : agenda) {
        escrituraArchivo.write(superheroe.getNombre() + ";" + superheroe.getDescription() + ";"
            + superheroe.getDireccion() + "\n");
      }

      escrituraArchivo.close();
      System.out.println("Datos guardados correctamente");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }

  private void verHeroes() {
    if (agenda.isEmpty()) {
      System.out.println("No hay heroes actualmente");
    } else {
      for (Superheroe superheroe : agenda) {
        System.out.println(superheroe);
      }
      System.out.println();
    }
    menu();
  }

  private void addHeroe() {
    consola.nextLine();
    String nombre;
    String description;
    String direccion;
    System.out.print("Introduce el nombre: ");
    nombre = consola.nextLine();
    System.out.print("Introduce la descripcion: ");
    description = consola.nextLine();
    System.out.print("Introduce la direccion: ");
    direccion = consola.nextLine();

    agenda.add(new Superheroe(nombre, description, direccion));
    menu();
  }

  private void leerDatosGuardados() {
    try {
      FileReader leerArchivo = new FileReader("D:\\pruebasJavaArchivos\\agenda.txt");
      BufferedReader leyendo = new BufferedReader(leerArchivo);
      String line = leyendo.readLine();

      while (line != null) {
        String[] lineSeparada = line.split(";");
        agenda.add(new Superheroe(lineSeparada[0], lineSeparada[1], lineSeparada[2]));
        line = leyendo.readLine();
      }

      leyendo.close();
      leerArchivo.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
