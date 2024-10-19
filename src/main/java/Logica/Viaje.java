/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Entidades.Usuario;
import java.time.LocalDate;

/**
 *
 * @author Personal
 */
public class Viaje extends Servicio {
    
    private String origen;

    public Viaje(String origen, int Id, LocalDate fecha, Usuario cliente, String destino, double costo) {
        super(Id, fecha, cliente, destino, costo);
        this.origen = origen;
    }
  
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Viaje{" + "origen=" + origen + '}';
    }

}
