package agendaHeroes;

public class Superheroe {

  private String nombre;
  private String description;
  private String direccion;

  public Superheroe(String nombre, String description, String direccion) {
    this.nombre = nombre;
    this.description = description;
    this.direccion = direccion;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDescription() {
    return description;
  }

  public String getDireccion() {
    return direccion;
  }

  @Override
  public String toString() {
    return "Superheroe [" +
        "nombre='" + nombre + '\'' +
        ", description='" + description + '\'' +
        ", direccion='" + direccion + '\'' +
        ']';
  }
}
