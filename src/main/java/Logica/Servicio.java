/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Entidades.Usuario;
import Interfaces.IFuncion;
import java.time.LocalDate;

/**
 *
 * @author Personal
 */
public abstract class Servicio implements IFuncion {
    
    private int Id;
    private LocalDate fecha;
    private Usuario cliente;
    private String destino;
    private double costo;

    public Servicio(int Id, LocalDate fecha, Usuario cliente, String destino, double costo) {
        this.Id = Id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.destino = destino;
        this.costo = costo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "Id=" + Id + ", fecha=" + fecha + ", cliente=" + cliente + ", destino=" + destino + ", costo=" + costo + '}';
    }
    
    @Override
    public void metodo1() {
        System.out.println("Implementacion del método1 en Usuario");
    }
    
    @Override
    public void metodo2() {
        System.out.println("Implementacion del método2 en Usuario");
    }

}
