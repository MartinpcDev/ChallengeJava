package JavaBasico.areapoligono;

/*
 * Crea una única función (importante que solo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro solo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class Areapoligono {

  public static void main(String[] args) {

    Poligono cuadrado = new Cuadrado(18.0);
    Poligono triangulo = new Triangulo(18.0, 14.0);
    Poligono rectangulo = new Rectangulo(18.0, 14.0);

    System.out.println("El area del cuadrado es : " + cuadrado.calcularArea());
    System.out.println("El area del triangulo es : " + triangulo.calcularArea());
    System.out.println("El area del Rectangulo es : " + rectangulo.calcularArea());
  }

  private abstract static class Poligono {

    abstract Double calcularArea();
  }

  private static class Triangulo extends Poligono {

    Double base;
    Double altura;

    public Triangulo(Double base, Double altura) {
      this.base = base;
      this.altura = altura;
    }

    @Override
    Double calcularArea() {
      return (base * altura) / 2;
    }
  }

  private static class Rectangulo extends Poligono {

    Double base;
    Double altura;

    public Rectangulo(Double base, Double altura) {
      this.base = base;
      this.altura = altura;
    }

    @Override
    Double calcularArea() {
      return base * altura;
    }
  }

  private static class Cuadrado extends Poligono {

    Double lado;

    public Cuadrado(Double lado) {
      this.lado = lado;
    }

    @Override
    Double calcularArea() {
      return lado * lado;
    }
  }

}
