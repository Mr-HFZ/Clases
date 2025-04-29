package clase11;

import java.util.Scanner;

public class ClaseHospital {

    enum Hospital {
        CINSULTA(30000, "Clinica las Americas"),
        HOSPITALIZACION(250000, "Clinica Prado"),
        OFTALMOLOGIA(1500000, "Clinica CES"),
        URGENCIAS(40000, "Hospital San Vicente"),
        ORTOPEDIA(850000, "Clinica Fracturas"),
        PEDIATRIA(140000, "Clinica Infantil");

        private int valor;
        private String sede;

        // Constructor
        Hospital(int valor, String sede) {
            this.valor = valor;
            this.sede = sede;
        }

        // Getters
        public int getValor() {
            return valor;
        }

        public String getSede() {
            return sede;
        }

        // Método opcional para imprimir bonito
        @Override
        public String toString() {
            return this.name() + " - Valor: $" + valor + " - Sede: " + sede;
        }
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una opcion de hospital");
        String opcion = scanner.next().toUpperCase();

        Hospital hospital = Enum.valueOf(Hospital.class, opcion);

        if (opcion.equals("CIRUGIA")){
            System.out.println("Eligio" + opcion + " tiene un costo de " + hospital.getValor() + " Y es atendida en " + hospital.getSede());
        }





    }
}




