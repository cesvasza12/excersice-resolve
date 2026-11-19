import java.text.Normalizer;

public class palindromo {

    /*
     * Escribe una función que reciba un texto y retorne verdadero o
     * falso (Boolean) según sean o no palíndromos.
     * Un Palíndromo es una palabra o expresión que es igual si se lee
     * de izquierda a derecha que de derecha a izquierda.
     * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
     * Ejemplo: Ana lleva al oso la avellana.
     */

    public static void main(String[] args) {

         boolean isPalindromo = validIsPalindromo("Ana lleva al oso la avellana");
        // boolean isPalindromo = validIsPalindromo("A la vibora vibora del amar");
        System.out.println(isPalindromo ? "Es un palindromo! " : "No es un palindromo!");

    }

    private static boolean validIsPalindromo(String s) {

        String newSenteces = s.toLowerCase().trim();
        String sinTildes = Normalizer.normalize(newSenteces, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
        String sinEspacios = sinTildes.replace(" ", "");

        // 2. Elimina todos los puntos
        String sentecesComplete =  sinEspacios.replace(".", "");
        StringBuilder value  = new StringBuilder();
        value.append(sentecesComplete);
        return sentecesComplete.contentEquals(value.reverse());

    }
}