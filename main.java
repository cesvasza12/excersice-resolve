public class main {

    public static void main(String[] args) {

        /*
         * Escribe un programa que muestre por consola (con un print) los
         * números de 1 a 100 (ambos incluidos y con un salto de línea entre
         * cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         */

         returnFizz();

    }

    public static void returnFizz() {
        for (int i=0; i<100; i++) {
            System.out.println("Estos son los numeros del 1 al 100!");
            System.out.println(returnWord(i));
        }
    }

    public static String returnWord(int n) {
        boolean esPrimo3 = n % 3 == 0;
        boolean esPrimo5 = n % 5 == 0;

        if (esPrimo3 && esPrimo5)  return "fizzbuzz";
        if (esPrimo3) return  "fizz";
        if (esPrimo5) return "buzz";

        return String.valueOf(n);

    }
}
