import java.util.ArrayList;
import java.util.List;

public class BinariosTerminadosEnUno {
    private List<Integer> numeros;
    private List<String> binarios;

    public BinariosTerminadosEnUno() {
        this.numeros = new ArrayList<>();
        this.binarios = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public List<String> getBinarios() {
        return binarios;
    }

    public void convertirABinario() {
        binarios.clear();
        for (int i = 0; i < numeros.size(); i++) {
            int num = numeros.get(i);
            String binario = "";
            while (num > 0) {
                binario = (num % 2) + binario;
                num /= 2;
            }
            if (!binario.equals("")) {
                binarios.add(binario);
            }
        }
    }

    public void mostrarBinariosTerminadosEnUno() {
        for (int i = 0; i < binarios.size(); i++) {
            String binario = binarios.get(i);
            if (binario.charAt(binario.length() - 1) == '1') {
                System.out.println(binario);
            }
        }
    }

    public static void main(String[] args) {
        BinariosTerminadosEnUno binariosObj = new BinariosTerminadosEnUno();
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

        binariosObj.setNumeros(listaNumeros);
        binariosObj.convertirABinario();
        binariosObj.mostrarBinariosTerminadosEnUno();
    }
}
