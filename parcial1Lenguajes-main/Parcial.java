
public class Parcial {

    public static void main(String[] args) {

        int count = 0;
        int num = 1;
        while (count < 5) {
            String binario = Integer.toBinaryString(num);
            String[] caracteres = binario.split("");
            boolean esPalindromo = true;
            for (int j = 0; j < caracteres.length / 2; j++) {
                if (!caracteres[j].equals(caracteres[caracteres.length - 1 - j])) {
                    esPalindromo = false;
                    break;
                }
            }
            if (esPalindromo && num != 1) {
                System.out.println(binario);
                count++;
            }
            num++;
        }

        // correcto
        /*
         * int count = 0;
         * int num = 1;
         * while (count < 5) {
         * String binario = Integer.toBinaryString(num);
         * boolean esPalindromo = true;
         * for (int j = 0; j < binario.length() / 2; j++) {
         * if (binario.charAt(j) != binario.charAt(binario.length() - 1 - j)) {
         * esPalindromo = false;
         * break;
         * }
         * }
         * if (esPalindromo) {
         * System.out.println(binario);
         * count++;
         * }
         * num++;
         * }
         */

        /*
         * for (int j = 1; j <= 10; j++) {
         * String binario = Integer.toBinaryString(j);
         * if (binario.equals(new StringBuilder(binario).reverse().toString())) {
         * System.out.println("El número binario " + binario + " es un palíndromo");
         * j++;
         * }
         * }
         */

    }
}
