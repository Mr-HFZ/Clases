import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private Button Calcular;

    @FXML
    private Button Terminar;

    @FXML
    private TextField primervalor;

    @FXML
    private TextField resultado;

    @FXML
    private TextField segundovalor;

    @FXML
    void Calcular(ActionEvent event) {
    float pvalor = Float.parseFloat(primervalor.getText());
    float svalor = Float.parseFloat(segundovalor.getText());
    float resultado = pvalor + svalor;
    this.resultado.setText(String.valueOf(resultado));        

    }

    @FXML
    void Terminar(ActionEvent event) {
        System.exit(0);

    }

}
