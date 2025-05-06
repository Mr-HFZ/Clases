package Parcial2;

import java.util.*;

public class ListaEmpleado {
    public static void main(String[] args) {
        // Obtener fecha actual
        Date fecha = new Date();
        int diaActual = fecha.getDate();
        int mesActual = fecha.getMonth() + 1;
        int añoActual = fecha.getYear() + 1900;

        // Lista de empleados y egresados
        LinkedList<Empleados> listaEmpleado = new LinkedList<>();
        HashSet<Egresado> listaEgresados = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Ingresar Empleado");
            System.out.println("2. Ingresar Egresado");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. Mostrar Egresados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    Empleados empleado = new Empleados();

                    String nombreEmp;
                    do {
                        System.out.print("Nombre: ");
                        nombreEmp = scanner.nextLine();
                    } while (!validarNombre(nombreEmp));
                    empleado.setNombre(nombreEmp);

                    String cargo;
                    do {
                        System.out.print("Cargo: ");
                        cargo = scanner.nextLine();
                    } while (!validarCampoLetras(cargo));
                    empleado.setCargo(cargo);


                    String dependencia;
                    do {
                        System.out.print("Dependencia: ");
                        dependencia = scanner.nextLine();
                    } while (!validarCampoLetras(dependencia));
                    empleado.setDependencia(dependencia);

                    // Validación Fecha de Matrícula
                    String fechaMatriculaEmp;
                    do {
                        System.out.print("Fecha de matrícula (AAAA-MM-DD): ");
                        fechaMatriculaEmp = scanner.nextLine();
                    } while (!validarFecha(fechaMatriculaEmp));
                    empleado.setFecha1(fechaMatriculaEmp);

                    // Cálculo de duración
                    String[] partesEmp = fechaMatriculaEmp.split("-");
                    int añoMatEmp = Integer.parseInt(partesEmp[0]);
                    int mesMatEmp = Integer.parseInt(partesEmp[1]);
                    int diaMatEmp = Integer.parseInt(partesEmp[2]);

                    int añosEmp = añoActual - añoMatEmp;
                    int mesesEmp = mesActual - mesMatEmp;
                    int diasEmp = diaActual - diaMatEmp;

                    if (diasEmp < 0) {
                        diasEmp += 30;
                        mesesEmp--;
                    }
                    if (mesesEmp < 0) {
                        mesesEmp += 12;
                        añosEmp--;
                    }

                    empleado.setFecha2(añosEmp + "-" + mesesEmp + "-" + diasEmp);
                    listaEmpleado.add(empleado);
                    break;

                case 2:
                    Egresado egresado = new Egresado();

                    // Validación Nombre
                    String nombreEgre;
                    do {
                        System.out.print("Nombre: ");
                        nombreEgre = scanner.nextLine();
                    } while (!validarNombre(nombreEgre));
                    egresado.setNombre(nombreEgre);

                    // Validación Edad
                    int edad;
                    do {
                        System.out.print("Edad: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Ingrese una edad válida: ");
                            scanner.next(); 
                        }
                        edad = scanner.nextInt();
                        scanner.nextLine(); 
                    } while (!validarEdad(edad));
                    egresado.setEdad(edad);

                    String fechaMatriculaEgre;
                    do {
                        System.out.print("Fecha de matrícula (AAAA-MM-DD): ");
                        fechaMatriculaEgre = scanner.nextLine();
                    } while (!validarFecha(fechaMatriculaEgre));
                    egresado.setFecha1(fechaMatriculaEgre);

                    // Cálculo de duración
                    String[] partesEgre = fechaMatriculaEgre.split("-");
                    int añoMatEgre = Integer.parseInt(partesEgre[0]);
                    int mesMatEgre = Integer.parseInt(partesEgre[1]);
                    int diaMatEgre = Integer.parseInt(partesEgre[2]);

                    int añosEgre = añoActual - añoMatEgre;
                    int mesesEgre = mesActual - mesMatEgre;
                    int diasEgre = diaActual - diaMatEgre;

                    if (diasEgre < 0) {
                        diasEgre += 30;
                        mesesEgre--;
                    }
                    if (mesesEgre < 0) {
                        mesesEgre += 12;
                        añosEgre--;
                    }

                    egresado.setFecha2(añosEgre + "-" + mesesEgre + "-" + diasEgre);
                    listaEgresados.add(egresado);
                    break;

                case 3:
                    System.out.println("--- Empleados Registrados ---");
                    for (Empleados emp : listaEmpleado) {
                        System.out.println("Nombre: " + emp.getNombre());
                        System.out.println("Cargo: " + emp.getCargo());
                        System.out.println("Dependencia: " + emp.getDependencia());
                        System.out.println("Fecha de Matrícula: " + emp.getFecha1());
                        System.out.println("Tiempo Laborado: " + emp.getFecha2());
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("--- Egresados Registrados ---");
                    for (Egresado e : listaEgresados) {
                        System.out.println("Nombre: " + e.getNombre());
                        System.out.println("Edad: " + e.getEdad());
                        System.out.println("Fecha de Ingreso: " + e.getFecha1());
                        System.out.println("Tiempo desde Ingreso: " + e.getFecha2());
                        System.out.println();
                    }
                    break;
            }
        }
    }

    public static boolean validarNombre(String nom) {
        return nom.length() >= 1; 
    }

    public static boolean validarEdad(int edad) {
        return edad > 0; 
    }

    public static boolean validarCampoLetras(String campo) {
        return campo.length() >= 1 && campo.matches("[a-zA-Z]+");
    }

    public static boolean validarFecha(String fecha) {
        return fecha.length() == 10;
    }
}
