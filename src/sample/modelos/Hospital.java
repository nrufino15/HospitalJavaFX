package sample.modelos;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    String nombre;
    List<Paciente> pacientes;
    List<Paciente> listaespera;

    public Hospital() {
    }

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
        this.listaespera = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void addPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }

    public List<Paciente> getListaespera() {
        return listaespera;
    }

    public void setListaespera(List<Paciente> listaespera) {
        this.listaespera = listaespera;
    }

    public void addPEspera(Paciente paciente){
        this.listaespera.add(paciente);
    }

    public void remPEspera(Paciente paciente){
        this.listaespera.remove(paciente);
    }


}
