/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Entidades.Usuario;
import Persistencia.Pago;
import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class Conductor extends Usuario {
    
    private double vehiculo;
    private String licencia;

    public Conductor(double vehiculo, String licencia, int id, String nombre, String direccion, String telefono, String email, ArrayList<Pago> pagos) {
        super(id, nombre, direccion, telefono, email, pagos);
        this.vehiculo = vehiculo;
        this.licencia = licencia;
    }

    public double getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(double vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Conductor{" + "vehiculo=" + vehiculo + ", licencia=" + licencia + '}';
    }

}
