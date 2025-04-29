package clase11;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEmpleado {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        LinkedList<Empleado> listaEmpleado = new LinkedList<Empleado>();
        for(int i =0; i < 3 ; i++){
            Empleado empleado = new Empleado();

            System.out.println("Nombre");
            empleado.setNombre(scanner.nextLine());
            System.out.println("profecion");
            empleado.setProfecion(scanner.nextLine());
            System.out.println("Empresa");
            empleado.setEmpresa(scanner.nextLine());

            listaEmpleado.add(empleado);

        }

        for(Empleado empleado : listaEmpleado){
            System.out.println(empleado.getNombre() + " " + empleado.getProfecion() + " " + empleado.getEmpresa());
            
        }


        
    }
    
}
