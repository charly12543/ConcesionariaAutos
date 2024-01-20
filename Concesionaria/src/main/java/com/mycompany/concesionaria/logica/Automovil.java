package com.mycompany.concesionaria.logica;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Automovil implements Serializable {
    
    @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_automovil;
    @Basic
    private String modelo;
    private String marca;
    private String motor;
    private String color;
    private String placa;
    private int cantPuertas;

    public Automovil() {
    }

    public Automovil(int id_automovil, String modelo, String marca, String motor, String color, String placa, int cantPuertas) {
        this.id_automovil = id_automovil;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.placa = placa;
        this.cantPuertas = cantPuertas;
    }

    public int getId_automovil() {
        return id_automovil;
    }

    public void setId_automovil(int id_automovil) {
        this.id_automovil = id_automovil;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        return "Automovil{" + "id_automovil=" + id_automovil + ", modelo=" + modelo + ", marca=" + marca + ", motor=" + motor + ", color=" + color + ", placa=" + placa + ", cantPuertas=" + cantPuertas + '}';
    }
    
    
    
    
}
