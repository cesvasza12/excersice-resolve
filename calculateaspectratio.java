import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;

/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo:
 *   https://i.pinimg.com/originals/d0/06/51/d0065164280b22a286f2e38d5ad2eb0d.jpg
 * - Por ratio hacemos referencia por ejemplo a los "400:700" de una
 *   imagen de 1200*2133.
 */

public class calculateaspectratio {


    public static void main(String[] args) {

        try {

            URL url = new URL("https://i.pinimg.com/originals/d0/06/51/d0065164280b22a286f2e38d5ad2eb0d.jpg");
            BufferedImage image = ImageIO.read(url);

            System.out.println("imagen aspect ratio: " +
                    retornAspectRatio(image.getWidth(),  image.getHeight()));

        } catch (IOException e) {
            System.out.println("Error url: "+ e);
        }

    }

    private static String retornAspectRatio(int width, int height) {
        BigInteger a = BigInteger.valueOf(width);
        BigInteger b = BigInteger.valueOf(height);

        BigInteger cmd = a.gcd(b);

        return a.divide(cmd) +":"+ b.divide(cmd);
    }
}