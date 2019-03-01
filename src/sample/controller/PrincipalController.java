package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import sample.modelos.Hospital;
import sample.modelos.Paciente;

import java.io.IOException;
import java.util.List;


public  class PrincipalController {
    @FXML
    AnchorPane botones,panel;

    @FXML
    Button lista,filtro,csv,estadistica,espera;

    @FXML
    AnchorPane inicio = null , alista = null , afiltro= null , acsv=null;

    Hospital hospital = new Hospital("Isaac");

    @FXML public void initialize(){
        try {
            inicio= FXMLLoader.load(getClass().getResource("../FXML/inicio.fxml"));
        }catch (IOException e){
            e.printStackTrace();
        }
        panel.getChildren().add(inicio);
        estadistica.setDisable(true);
        estadistica.setOpacity(0);
        espera.setDisable(true);
        espera.setOpacity(0);
        System.out.println("Hospital " + hospital.getNombre()+" creado");

    }
    @FXML public void  clicLista(ActionEvent event){
        try {
            alista=FXMLLoader.load(getClass().getResource("../fxml/hostital.fxml"));
        }catch (IOException e){
            e.printStackTrace();
        }

        panel.getChildren().setAll(alista);

    }

    public List<Paciente> getpacientes(){
         return this.hospital.getPacientes();
    }

    public void setpacientes(List<Paciente> pacientes){

        this.hospital.setPacientes(pacientes);
    }


}
