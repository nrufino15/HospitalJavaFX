package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class InicioController {
    @FXML
     Label inicio;

    static String  TEXTO="Bienvenido a Hospital ISAAC Seleccione que desea hacer:";

    @FXML public void initialize() {
        inicio.setText(TEXTO);
    }
}
