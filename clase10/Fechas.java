import java.util.Date;

public class Fechas {
    public static void main(String[] args) {
        Date fecha = new Date();

        int dia = fecha.getDate();
        int mes = fecha.getMonth() + 1;
        int año = fecha.getYear() + 1900;
        int diaSemana = fecha.getDay(); // 0 domingo, 1 lunes, 2 martes...
        int hora = fecha.getHours();
        int minutos = fecha.getMinutes();
        int segundos = fecha.getSeconds();

        /** System.out.println("Dia " + dia);
        System.out.println("Mes " + mes);
        System.out.println("Año " + año);
        System.out.println("Día de la semana: " + diaSemana);
        System.out.println("Hora: " + hora);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos " + segundos); */

        // mostrar con las herramientas de fecha  que hoy es Lunes 21 de abril de 2025 y son las 6:39:47pm
        String diaSemanaNum = (diaSemana == 1) ? "Lunes" : (diaSemana == 2) ? "Martes" : (diaSemana == 3) ? "Miércoles" : (diaSemana == 4) ? "Jueves" : (diaSemana == 5) ? "Viernes" : "Domingo"; 
        System.out.println(diaSemanaNum + " " + dia + " de abril de " + año + " y son las " + hora + ":" + minutos + ":" + segundos);

        // se tiene una fecha de nacimiento (año-mes-dia) y una fecha actual, debo calcular la edad de una persona mostrando de forma exacta el total de años, meses y dias que tiene

        
        String fechaNacimiento = "1990-04-21"; // fecha en String
        String[] partes = fechaNacimiento.split("-"); // S e hace un split para separar la fecha por "-"
        int añoNacimiento = Integer.parseInt(partes[0]); // la posicion 0 de l split la vuelvo un ENTERO
        int mesNacimiento = Integer.parseInt(partes[1]);
        int diaNacimiento = Integer.parseInt(partes[2]);
        int edad = año - añoNacimiento; // Para cualcular la edad le resto el año a la fecha de nacimiento(fechaNacimiento) 
        int meses = mes - mesNacimiento; // Le resto a la fecha de nacimiento el mes actual 
        int dias = dia - diaNacimiento;  // Al dia de nacimiento le resto el dia actual 

        // con esto consigo restarle a la fecha de nacimiento la fecha actual y obtener la edad en años, meses y dias
        
        

    }
    
}
