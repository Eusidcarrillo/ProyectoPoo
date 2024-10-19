/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Usuario;
import Interfaces.IFuncion;
import java.time.LocalDate;

/**
 *
 * @author Personal
 */
public class Pago implements IFuncion {
    
    private String metodoPago;
    private double monto;
    private LocalDate fecha;
    private Usuario pago;

    public Pago(String metodoPago, double monto, LocalDate fecha, Usuario pago) {
        this.metodoPago = metodoPago;
        this.monto = monto;
        this.fecha = fecha;
        this.pago = pago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getPago() {
        return pago;
    }

    public void setPago(Usuario pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Pago{" + "metodoPago=" + metodoPago + ", monto=" + monto + ", fecha=" + fecha + ", pago=" + pago + '}';
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
