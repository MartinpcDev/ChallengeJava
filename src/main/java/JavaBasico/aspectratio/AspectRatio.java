package JavaBasico.aspectratio;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo:
 *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */
public class AspectRatio {

  public static void main(String[] args) {
    String imageURL =
        "https://i.blogs.es/d91a00/img_20160524_200140314/2560_3000.jpg";

    try {
      BufferedImage image = ImageIO.read(new URL(imageURL));
      if (image != null) {
        int width = image.getWidth();
        int heigth = image.getHeight();
        String aspectRatio = calculateAspectRatio(width, heigth);
        System.out.println("Aspect Ratio: " + aspectRatio);
      } else {
        System.out.println("Error al leer la imagen");
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  private static String calculateAspectRatio(int width, int height) {
    int gcd = gcd(width, height);
    int aspectWidth = width / gcd;
    int aspectHeight = height / gcd;
    return aspectWidth + ":" + aspectHeight;
  }

  private static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
