package varios;

import java.util.Arrays;

public class EmailValidator {

  public static void main(String[] args) {
    System.out.println(validateEmail("mart.@inch.is"));
  }

  public static String validateEmail(String email) {
    String[] arrobaArray = email.split("@");
    String[] puntoArray = email.split("\\.");
    String message;
    System.out.println(Arrays.toString(arrobaArray));
    if (arrobaArray.length > 1) {
      message = "El email no puede tener mas de 1 arroba";
    } else if (arrobaArray.length == 1) {
      message = "El email debe contener un arroba al menos";
    } else if (puntoArray.length > 1) {
      message = "El email no puede tener mas de un punto";
    } else {
      message = "Ingrese un formato valido";
    }

    return message;
  }
}
