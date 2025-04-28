import java.util.Scanner;

public class CalculadoraParqueadero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Título del sistema
        System.out.println("Sistema de Parqueadero");
        System.out.println("----------------------");

        // Solicitar nombre del cliente
        System.out.print("Nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        // Solicitar placa del vehículo
        System.out.print("Placa del vehículo: ");
        String placaVehiculo = scanner.nextLine();

        // Solicitar tipo de vehículo (1 para carro, 2 para moto)
        System.out.print("Tipo de vehículo (1: Carro, 2: Moto): ");
        int tipoVehiculo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea que queda pendiente

        // Solicitar hora de ingreso en formato hh:mm:ss
        System.out.print("Hora de ingreso (formato hh:mm:ss): ");
        String horaIngreso = scanner.nextLine();

        // Solicitar hora de salida en formato hh:mm:ss
        System.out.print("Hora de salida (formato hh:mm:ss): ");
        String horaSalida = scanner.nextLine();

        // Separar la hora de ingreso en horas, minutos y segundos
        String[] partsIngreso = horaIngreso.split(":");
        int horaIng = Integer.parseInt(partsIngreso[0]);
        int minIng = Integer.parseInt(partsIngreso[1]);
        int segIng = Integer.parseInt(partsIngreso[2]);

        // Separar la hora de salida en horas, minutos y segundos
        String[] partsSalida = horaSalida.split(":");
        int horaSal = Integer.parseInt(partsSalida[0]);
        int minSal = Integer.parseInt(partsSalida[1]);
        int segSal = Integer.parseInt(partsSalida[2]);

        // Convertir la hora de ingreso a segundos
        int tiempoIngresoSegundos = horaIng * 3600 + minIng * 60 + segIng;
        // Convertir la hora de salida a segundos
        int tiempoSalidaSegundos = horaSal * 3600 + minSal * 60 + segSal;

        // Si la hora de salida es menor a la hora de ingreso, significa que pasó al día siguiente
        if (tiempoSalidaSegundos < tiempoIngresoSegundos) {
            tiempoSalidaSegundos += 24 * 3600; // Se suma un día completo en segundos
        }

        // Calcular la diferencia total en segundos entre ingreso y salida
        int diferenciaSegundos = tiempoSalidaSegundos - tiempoIngresoSegundos;

        // Convertir la diferencia en horas, minutos y segundos
        int horas = diferenciaSegundos / 3600;
        int minutos = (diferenciaSegundos % 3600) / 60;
        int segundos = diferenciaSegundos % 60;

        // Definir la tarifa por hora según el tipo de vehículo
        double tarifaHora = (tipoVehiculo == 1) ? 4000.0 : 2000.0;

        // Calcular el tiempo en formato decimal (ejemplo: 2.5 horas)
        double horasDecimal = horas + (minutos / 60.0) + (segundos / 3600.0);

        // Calcular el costo total del parqueadero
        double costoTotal = horasDecimal * tarifaHora;

        // Mostrar resumen de la operación
        System.out.println("\nResumen del Parqueadero");
        System.out.println("----------------------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Placa: " + placaVehiculo);
        System.out.println("Tipo de vehículo: " + (tipoVehiculo == 1 ? "Carro" : "Moto"));
        System.out.println("Hora de ingreso: " + horaIngreso);
        System.out.println("Hora de salida: " + horaSalida);
        System.out.println("Tiempo de parqueo: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
        System.out.println("Tarifa por hora: $" + tarifaHora);
        System.out.println("Costo total: $" + Math.round(costoTotal)); // Redondear el valor final

        scanner.close(); // Cerrar el escáner
    }
}
