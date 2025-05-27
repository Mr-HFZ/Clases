import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JuegoController {

    @FXML
    private TextField entradaUsuario;

    @FXML
    private Label resultadoLabel;

    @FXML
    private Label intentosLabel;

    @FXML
    private TableView<String> tablaIntentos;

    @FXML
    private TableColumn<String, String> columnaIntento;

    private String numeroSecreto;
    private int intentos = 0;
    private ObservableList<String> intentosPrevios;

    @FXML
    public void initialize() {
        numeroSecreto = generarNumeroSecreto();
        intentosPrevios = FXCollections.observableArrayList();
        columnaIntento.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue()));
        tablaIntentos.setItems(intentosPrevios);
    }

    @FXML
    void verificarIntento(ActionEvent event) {
        String intento = entradaUsuario.getText();
        if (!intento.matches("\\d{3}")) {
            resultadoLabel.setText("Ingresa un número de 3 cifras.");
            return;
        }

        intentos++;
        intentosPrevios.add(intento);
        entradaUsuario.clear();

        int toros = 0;
        int vacas = 0;

        for (int i = 0; i < 3; i++) {
            char c = intento.charAt(i);
            if (c == numeroSecreto.charAt(i)) {
                toros++;
            } else if (numeroSecreto.contains(Character.toString(c))) {
                vacas++;
            }
        }

        if (toros == 3) {
            resultadoLabel.setText("¡Ganaste! El número era: " + numeroSecreto);
        } else {
            resultadoLabel.setText(toros + " Toros, " + vacas + " Vacas.");
        }

        intentosLabel.setText("Intentos: " + intentos);
    }

    private String generarNumeroSecreto() {
        Random rand = new Random();
        List<Integer> cifras = new ArrayList<>();
        while (cifras.size() < 3) {
            int digito = rand.nextInt(10);
            if (!cifras.contains(digito)) {
                cifras.add(digito);
            }
        }
        return "" + cifras.get(0) + cifras.get(1) + cifras.get(2);
    }
}
