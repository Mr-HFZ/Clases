import java.util.Scanner;

public class SistemaRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definición de precios de los platos principales
        int precioPasta = 37000;
        int precioRissoto = 42000;
        int precioChurrasco = 45600;
        int precioRobalo = 39000;

        // Definición de precios de bebidas
        int precioJugo = 10000;
        int precioCerveza = 6500;
        int precioGaseosa = 4500;

        // Definición de precios de postres
        int precioTiramisu = 12000;
        int precioTresLeches = 8000;

        System.out.println("Sistema de Restaurante");
        System.out.println("---------------------");

        // Ingresar el día de la semana (0-6)
        System.out.print("Ingrese el día de la semana (0: Domingo, 1: Lunes, ..., 6: Sábado): ");
        int diaSemana = scanner.nextInt();

        // Ingresar cantidad de mesas que se van a atender
        System.out.print("Ingrese la cantidad de mesas: ");
        int cantidadMesas = scanner.nextInt();

        double totalFactura = 0; // Acumula el total de todas las mesas

        // Procesar cada mesa
        for (int mesa = 1; mesa <= cantidadMesas; mesa++) {
            System.out.println("\nMesa #" + mesa);
            System.out.print("Cantidad de personas en la mesa: ");
            int cantidadPersonas = scanner.nextInt();

            double totalMesa = 0; // Total para la mesa actual

            // Procesar cada persona de la mesa
            for (int persona = 1; persona <= cantidadPersonas; persona++) {
                System.out.println("\nPersona #" + persona + " de la Mesa #" + mesa);

                // Menú de platos principales
                System.out.println("Menú de platos:");
                System.out.println("1. Pasta corta ($37,000)");
                System.out.println("2. Rissoto ($42,000)");
                System.out.println("3. Churrasco ($45,600)");
                System.out.println("4. Robalo ($39,000)");
                System.out.print("Seleccione un plato (1-4): ");
                int platoSeleccionado = scanner.nextInt();

                double precioPlatoOriginal = 0;
                double precioPlatoFinal = 0;
                String nombrePlato = "";

                // Determinar plato seleccionado y aplicar descuentos según el día
                switch (platoSeleccionado) {
                    case 1: // Pasta corta
                        nombrePlato = "Pasta corta";
                        precioPlatoOriginal = precioPasta;
                        if (diaSemana == 1) { // Lunes: 10% de descuento
                            precioPlatoFinal = precioPlatoOriginal * 0.9;
                        } else if (diaSemana == 0 || diaSemana == 6) { // Fin de semana: 15% de descuento
                            precioPlatoFinal = precioPlatoOriginal * 0.85;
                        } else {
                            precioPlatoFinal = precioPlatoOriginal;
                        }
                        break;
                    case 2: // Rissoto
                        nombrePlato = "Rissoto";
                        precioPlatoOriginal = precioRissoto;
                        if (diaSemana == 2) { // Martes: 5% de descuento
                            precioPlatoFinal = precioPlatoOriginal * 0.95;
                        } else if (diaSemana == 0 || diaSemana == 6) { // Fin de semana
                            precioPlatoFinal = precioPlatoOriginal * 0.85;
                        } else {
                            precioPlatoFinal = precioPlatoOriginal;
                        }
                        break;
                    case 3: // Churrasco
                        nombrePlato = "Churrasco";
                        precioPlatoOriginal = precioChurrasco;
                        if (diaSemana == 3) { // Miércoles: 15% de descuento
                            precioPlatoFinal = precioPlatoOriginal * 0.85;
                        } else if (diaSemana == 0 || diaSemana == 6) { // Fin de semana
                            precioPlatoFinal = precioPlatoOriginal * 0.85;
                        } else {
                            precioPlatoFinal = precioPlatoOriginal;
                        }
                        break;
                    case 4: // Robalo
                        nombrePlato = "Robalo";
                        precioPlatoOriginal = precioRobalo;
                        if (diaSemana == 4) { // Jueves: 25% de descuento
                            precioPlatoFinal = precioPlatoOriginal * 0.75;
                        } else if (diaSemana == 0 || diaSemana == 6) { // Fin de semana
                            precioPlatoFinal = precioPlatoOriginal * 0.85;
                        } else {
                            precioPlatoFinal = precioPlatoOriginal;
                        }
                        break;
                    default: // Opción inválida
                        System.out.println("Opción no válida, se cobrará el plato más económico (Pasta corta).");
                        nombrePlato = "Pasta corta";
                        precioPlatoOriginal = precioPasta;
                        precioPlatoFinal = precioPasta;
                }

                // Mostrar el plato seleccionado y su precio
                System.out.println("Plato seleccionado: " + nombrePlato);
                System.out.println("Precio original: $" + (int) precioPlatoOriginal);
                System.out.println("Precio con descuento: $" + (int) precioPlatoFinal);

                // Sumar el plato al total de la mesa
                totalMesa += precioPlatoFinal;

                // Preguntar si desea ordenar bebida
                System.out.print("¿Desea ordenar una bebida? (1: Sí, 0: No): ");
                int ordenarBebida = scanner.nextInt();

                if (ordenarBebida == 1) {
                    // Menú de bebidas
                    System.out.println("Menú de bebidas:");
                    System.out.println("1. Jugo ($10,000)");
                    System.out.println("2. Cerveza ($6,500)");
                    System.out.println("3. Gaseosa ($4,500)");
                    System.out.print("Seleccione una bebida (1-3): ");
                    int bebidaSeleccionada = scanner.nextInt();

                    // Agregar el precio de la bebida al total de la mesa
                    switch (bebidaSeleccionada) {
                        case 1:
                            System.out.println("Bebida seleccionada: Jugo");
                            totalMesa += precioJugo;
                            break;
                        case 2:
                            System.out.println("Bebida seleccionada: Cerveza");
                            totalMesa += precioCerveza;
                            break;
                        case 3:
                            System.out.println("Bebida seleccionada: Gaseosa");
                            totalMesa += precioGaseosa;
                            break;
                        default:
                            System.out.println("Opción no válida, no se añadirá bebida.");
                    }
                }

                // Preguntar si desea ordenar postre
                System.out.print("¿Desea ordenar un postre? (1: Sí, 0: No): ");
                int ordenarPostre = scanner.nextInt();

                if (ordenarPostre == 1) {
                    // Menú de postres
                    System.out.println("Menú de postres:");
                    System.out.println("1. Tiramisú ($12,000)");
                    System.out.println("2. Tres leches ($8,000)");
                    System.out.print("Seleccione un postre (1-2): ");
                    int postreSeleccionado = scanner.nextInt();

                    // Agregar el precio del postre al total de la mesa
                    switch (postreSeleccionado) {
                        case 1:
                            System.out.println("Postre seleccionado: Tiramisú");
                            totalMesa += precioTiramisu;
                            break;
                        case 2:
                            System.out.println("Postre seleccionado: Tres leches");
                            totalMesa += precioTresLeches;
                            break;
                        default:
                            System.out.println("Opción no válida, no se añadirá postre.");
                    }
                }
            }

            // Mostrar total para la mesa actual
            System.out.println("\nTotal para la Mesa #" + mesa + ": $" + (int) totalMesa);

            // Acumular el total de la factura general
            totalFactura += totalMesa;
        }

        // Mostrar resumen de la factura
        System.out.println("\nResumen de la Factura");
        System.out.println("--------------------");
        System.out.println("Subtotal: $" + (int) totalFactura);

        // Preguntar si desea incluir el servicio (10%)
        System.out.print("¿Desea incluir el servicio (10%)? (1: Sí, 0: No): ");
        int incluirServicio = scanner.nextInt();

        double valorServicio = 0;
        if (incluirServicio == 1) {
            valorServicio = totalFactura * 0.1;
            System.out.println("Valor del servicio (10%): $" + (int) valorServicio);
            totalFactura += valorServicio;
        }

        // Mostrar el total a pagar
        System.out.println("Total a pagar: $" + (int) totalFactura);

        // Cerrar el scanner
        scanner.close();
    }
}
