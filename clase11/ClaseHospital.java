package clase11;

import java.util.Scanner;

/**
 * Programa que simula la selección de un servicio hospitalario,
 * mostrando el costo y la sede donde se presta el servicio.
 */
public class ClaseHospital {

    // Enumeración de servicios hospitalarios
    enum Hospital {
        CONSULTA(30000, "Clínica las Américas"),
        HOSPITALIZACION(250000, "Clínica Prado"),
        OFTALMOLOGIA(1500000, "Clínica CES"),
        URGENCIAS(40000, "Hospital San Vicente"),
        ORTOPEDIA(850000, "Clínica Fracturas"),
        PEDIATRIA(140000, "Clínica Infantil");

        private final int valor;  // Valor del servicio
        private final String sede;  // Nombre de la sede

        /**
         * Constructor de la enumeración.
         * @param valor Valor del servicio.
         * @param sede Nombre de la sede donde se presta el servicio.
         */
        Hospital(int valor, String sede) {
            this.valor = valor;
            this.sede = sede;
        }

        public int getValor() {
            return valor;
        }

        public String getSede() {
            return sede;
        }

        @Override
        public String toString() {
            return this.name() + " - Valor: $" + valor + " - Sede: " + sede;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Opciones disponibles:");
        // Mostrar todas las opciones al usuario
        for (Hospital servicio : Hospital.values()) {
            System.out.println(servicio);
        }

        System.out.println("\nIngrese el servicio que desea (ejemplo: CONSULTA, URGENCIAS, etc.):");
        String opcion = scanner.next().toUpperCase();

        try {
            // Buscar la opción ingresada
            Hospital hospital = Hospital.valueOf(opcion);

            // Mostrar información del servicio seleccionado
            System.out.println("\nEligió: " + opcion);
            System.out.println("Costo: $" + hospital.getValor());
            System.out.println("Sede: " + hospital.getSede());

        } catch (IllegalArgumentException e) {
            System.out.println("\nLa opción ingresada no es válida. Por favor, intente de nuevo.");
        }

        scanner.close();
    }
}
