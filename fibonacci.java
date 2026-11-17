import java.util.ArrayList;
import java.util.Arrays;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 *
 * - Se definen los valores del arreglo en 55
 * - echo por: cesar vasquez
 * -
 */

public class fibonacci {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        int conteo = 0;
        int limite = 0;

        do {

             if (conteo == 0 || conteo == 1 ) {
                 numeros.add(conteo);
             } else {
                 numeros.add(numeros.get(conteo - 2) + numeros.get(conteo -1));
             }

             if (numeros.get(conteo) >= 50) limite = numeros.get(conteo);
             conteo++;

        }while (limite < 50);
        System.out.println("conteo: "+ Arrays.toString(numeros.toArray()));
    }
}