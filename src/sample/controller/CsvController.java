package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import sample.modelos.Paciente;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CsvController {

    @FXML
    Button cargar , buscar;

    @FXML
    Label msn;

    @FXML
    TextField ruta;

    File file = null;

    boolean exito=false;

    List<Paciente> pacientes = new ArrayList<>();
    @FXML
    public void initialize() {

    }

    @FXML public void  clicBuscar(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccione CSV");

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("CSV","*.csv")
        );

        file = fileChooser.showOpenDialog(null);
        ruta.setText(file.getAbsolutePath());
    }

    @FXML public void  clicCargar(ActionEvent event){

        msn.setDisable(false);
        msn.setOpacity(1);
        pacientes = new DatosContoller().cargarcsv(file.getAbsolutePath());
        if (pacientes.isEmpty()){
            msn.setText("Ocurio un error intentelo mas tarde");
        }else {
            msn.setText("Datos introducidos correctamente");
        }


    }

}
