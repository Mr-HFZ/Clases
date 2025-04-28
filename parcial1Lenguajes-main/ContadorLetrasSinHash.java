import java.util.Scanner;

public class ContadorLetrasSinHash {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase:");
        String texto = scanner.nextLine().toLowerCase(); // Leer la frase y convertir a minúsculas

        // Eliminar todos los espacios en blanco de la frase
        texto = texto.replace(" ", "");

        // Crear un arreglo para contar la cantidad de veces que aparece cada letra
        // El arreglo tiene 26 posiciones, una para cada letra de la 'a' a la 'z'
        int[] conteo = new int[26];

        // Recorrer cada caracter del texto
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Verificar si el caracter es una letra entre 'a' y 'z'
            if (c >= 'a' && c <= 'z') {
                // Incrementar el contador correspondiente a la letra
                conteo[c - 'a']++;
            }
        }

        // Variable para construir el resultado final
        String resultado = "";

        // Recorrer el texto de nuevo para respetar el orden de aparición
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Verificar si el caracter es una letra válida
            if (c >= 'a' && c <= 'z') {
                // Comprobar si la letra ya ha sido contada y mostrada
                boolean yaContada = false;

                // Revisar todas las posiciones anteriores a la actual
                for (int j = 0; j < i; j++) {
                    if (texto.charAt(j) == c) {
                        yaContada = true;
                        break;
                    }
                }

                // Si la letra no ha sido contada aún, añadirla al resultado
                if (!yaContada) {
                    resultado += c + "" + conteo[c - 'a'] + " ";
                }
            }
        }

        // Imprimir el resultado final quitando espacios extra al final
        System.out.println("Resultado:");
        System.out.println(resultado.trim());

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
