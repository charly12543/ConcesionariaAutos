package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    AutomovilJpaController aut = new AutomovilJpaController();

    public void enviarDatos(Automovil auto) {
        aut.create(auto);
        
    }

    public List<Automovil> mostrarAutos() {
       return aut.findAutomovilEntities();
        
    }

    public void borrarAuto(int idEliminar) {
        try {
            aut.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int id_auto) {
        
        return aut.findAutomovil(id_auto);
    }

    public Automovil buscarAuto(int id_buscar) {
        return aut.findAutomovil(id_buscar);
    }

    public void guardarAuto(Automovil auto) {
        try {
            aut.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
}
