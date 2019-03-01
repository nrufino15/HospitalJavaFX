package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.modelos.Paciente;

import java.util.List;

public class TablaPacientesController {
    @FXML
    TableView<Paciente> tpacientes;

    List<Paciente> p = null;
    ObservableList<Paciente> pacientes;

    @FXML
    public void initialize() {
        pacientes = FXCollections.observableArrayList();
        p = new DatosContoller().cargarcsv(null);
        setTableView();
    }
    private void setTableView(){

        TableColumn dni = new TableColumn("dni");
        TableColumn nombre = new TableColumn("nombre");
        TableColumn apellidos = new TableColumn("apellidos");
        TableColumn email = new TableColumn("email");
        TableColumn genero = new TableColumn("genero");
        TableColumn fechaNacimiento = new TableColumn("fechaNacimiento");
        TableColumn direccion = new TableColumn("direccion");
        TableColumn telefono = new TableColumn("telefono");
        TableColumn peso = new TableColumn("peso");
        TableColumn altura = new TableColumn("altura");

        dni.setCellValueFactory(new PropertyValueFactory<Paciente,String>("dni"));
        nombre.setCellValueFactory(new PropertyValueFactory<Paciente,String>("nombre"));
        apellidos.setCellValueFactory(new PropertyValueFactory<Paciente,String>("apellidos"));
        email.setCellValueFactory(new PropertyValueFactory<Paciente,String>("email"));
        genero.setCellValueFactory(new PropertyValueFactory<Paciente,String>("genero"));
        fechaNacimiento.setCellValueFactory(new PropertyValueFactory<Paciente,String>("fechaNacimiento"));
        direccion.setCellValueFactory(new PropertyValueFactory<Paciente,String>("direccion"));
        telefono.setCellValueFactory(new PropertyValueFactory<Paciente,Integer>("telefono"));
        peso.setCellValueFactory(new PropertyValueFactory<Paciente,Float>("peso"));
        altura.setCellValueFactory(new PropertyValueFactory<Paciente,Integer>("altura"));

        tpacientes.getColumns().addAll(dni,nombre,apellidos,email,genero,fechaNacimiento,direccion,telefono,peso,altura);

        pacientes.addAll(p);
        tpacientes.setItems(pacientes);
    }
}
