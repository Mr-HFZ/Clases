import java.util.ArrayList;
import java.util.List;

public class SumaRango {
    private int inicio;
    private int fin;

    public SumaRango() {
        this.inicio = 0;
        this.fin = 0;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int calcularSumaRango() {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Debes ingresar dos valores separados por un espacio.");
            return;
        }

        String input = args[0];
        int espacioIndex = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                espacioIndex = i;
                break;
            }
        }

        if (espacioIndex == -1) {
            System.out.println("Formato incorrecto. Usa: <inicio> <fin>");
            return;
        }

        int inicio = 0, fin = 0;
        for (int i = 0; i < espacioIndex; i++) {
            inicio = inicio * 10 + (input.charAt(i) - '0');
        }
        for (int i = espacioIndex + 1; i < input.length(); i++) {
            fin = fin * 10 + (input.charAt(i) - '0');
        }

        SumaRango sumaRango = new SumaRango();
        sumaRango.setInicio(inicio);
        sumaRango.setFin(fin);

        int resultado = sumaRango.calcularSumaRango();
        System.out.println("La suma del rango es: " + resultado);
    }
}
