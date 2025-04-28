import java.util.ArrayList;
import java.util.List;

public class PromedioMultiplos {
    private List<Integer> numeros;

    public PromedioMultiplos() {
        this.numeros = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public double calcularPromedioMultiplosDeTres() {
        int suma = 0, count = 0;
        for (int i = 0; i < numeros.size(); i++) {
            int num = numeros.get(i);
            if (num % 3 == 0) {
                suma += num;
                count++;
            }
        }
        return count > 0 ? (double) suma / count : 0;
    }

    public static void main(String[] args) {
        PromedioMultiplos promedio = new PromedioMultiplos();
        List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            int num = 0;
            boolean esNumero = true;

            for (int j = 0; j < arg.length(); j++) {
                char c = arg.charAt(j);
                if (c < '0' || c > '9') {
                    esNumero = false;
                    break;
                }
            }

            if (esNumero) {
                for (int j = 0; j < arg.length(); j++) {
                    num = num * 10 + (arg.charAt(j) - '0');
                }
                listaNumeros.add(num);
            }
        }

        promedio.setNumeros(listaNumeros);
        double resultado = promedio.calcularPromedioMultiplosDeTres();
        System.out.println("El promedio de los múltiplos de 3 es: " + resultado);
    }
}
