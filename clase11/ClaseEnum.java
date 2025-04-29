package clase11;

/**
 * Clase que demuestra el uso de una enumeración (enum) en Java
 * para representar diferentes colores.
 */
public class ClaseEnum {

    /**
     * Enumeración que define una lista de colores disponibles.
     */
    enum Color {
        AMARILLO,
        VERDE,
        ROJO,
        AZUL,
        NARANJA,
        BLANCO,
        NEGRO;
    }

    public static void main(String[] args) {
        
        // Seleccionar un color específico
        Color color = Color.NARANJA;
        System.out.println("El color seleccionado es: " + color);

        // Mostrar todos los colores disponibles
        System.out.println("\nColores disponibles:");
        for (Color c : Color.values()) {
            System.out.println(c);
        }

        // Mostrar nombre del color seleccionado
        System.out.println("\nNombre del color: " + color.name());

        // Mostrar la posición del color en la enumeración
        System.out.println("Posición del color en el enum: " + color.ordinal());

        // Buscar un color por su nombre
        Color col = Color.valueOf("VERDE");
        System.out.println("\nSe encontró el color: " + col);
    }
}
