package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    
    ControladoraPersistencia persis = new ControladoraPersistencia();
        

    public void enviarDatos(String modelo, String marca, String motor, String color, 
            String placa, int cantPuertas) {
        //Creamos una instancia de la clase automovil
        Automovil auto = new Automovil();
        
        //Seteamos los datos obtenidos de la IGU
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantPuertas(cantPuertas);
     
        //Enviamos el objeto completo a la persistencia
        persis.enviarDatos(auto);
    }

    public List<Automovil> mostrarAutos() {
        return persis.mostrarAutos();
    }

    public void borrarAuto(int idEliminar) {
         persis.borrarAuto(idEliminar);
    }

    public Automovil traerAuto(int id_auto) {
        return persis.traerAuto(id_auto);
    }

    public Automovil buscarAuto(int id_buscar) {
       return persis.buscarAuto(id_buscar);
    }

    public void guardarAuto(Automovil auto, String modelo, 
                            String marca, String motor, String color, 
                            String placa, int cantPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);       
        auto.setCantPuertas(cantPuertas);
        
        persis.guardarAuto(auto);
        
    }

      

             
    
}
