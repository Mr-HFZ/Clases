import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private Button aceptar;

    @FXML
    private TextField nombre;

    @FXML
    void aceptar(ActionEvent event) {

        String nom = nombre.getText().toString();//getText para tomomar de la caja // setText para ponerlo en la caja
        JOptionPane.showMessageDialog(null,"Bienvenido " + nom + " a JavaFx");

    }

}
