import java.util.Arrays;
import java.util.Scanner;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 *
 * - autor mouredev
 * - Fecha ejecucion 17/11/2026
 * - Realizado por: Cesar Vasquez.
 *
 */

public class anagrama {

    public static void main(String[] args) {

        Scanner solicita = new Scanner(System.in);

        System.out.println("Ingresa las palabras anagramas: ");
        String wordOne = solicita.nextLine();
        String wordTwo = solicita.nextLine();

        System.out.println("Las palabras: " + wordOne + ", "+ wordTwo);
        System.out.println(transformAnagrama(wordOne, wordTwo) ? "Es anagrama" : " No es anagrama");

    }

    private static boolean transformAnagrama(String wordOne, String wordTwo) {

        if (wordOne.equalsIgnoreCase(wordTwo)) return false;


        char[] arrayOne = wordOne.toLowerCase().toCharArray();
        char[] arrayTow = wordTwo.toLowerCase().toCharArray();

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTow);

        System.out.println("nueva palabraa: "+Arrays.toString(arrayOne) + " ,"+ Arrays.toString(arrayTow));

        return !Arrays.equals(arrayOne, arrayTow);
    }
}
