package sample.controller;

import sample.modelos.Paciente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatosContoller {

    public List<Paciente> cargarcsv (String ruta){
        List<Paciente> pacientes = new ArrayList<>();
        if (ruta == null){
            ruta="src\\sample\\data\\Hospital.csv";
        }
        try {
            BufferedReader rfile = new BufferedReader( new FileReader(ruta));
            String linea;

            while ((linea = rfile.readLine()) != null){
                String[] partes = linea.split(",");
                Paciente paciente = new Paciente();
                paciente.setDni(partes[0]);
                paciente.setNombre(partes[1]);
                paciente.setApellidos(partes[2]);
                paciente.setEmail(partes[3]);
                paciente.setGenero(partes[4]);
                paciente.setFechaNacimiento(partes[5]);
                paciente.setDireccion(partes[6]);
                paciente.setTelefono(Integer.parseInt(partes[7]));
                paciente.setPeso(Float.parseFloat(partes[8]));
                paciente.setAltura(Integer.parseInt(partes[9]));
                pacientes.add(paciente);
            }

        }catch (IOException e){

        }
        return pacientes;
    }
}
