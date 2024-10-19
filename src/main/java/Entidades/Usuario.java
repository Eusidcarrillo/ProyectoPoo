/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interfaces.IFuncion;
import Persistencia.Pago;
import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public abstract class Usuario implements IFuncion{
    
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private ArrayList<Pago> pagos;

    public Usuario(int id, String nombre, String direccion, String telefono, String email, ArrayList<Pago> pagos) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.pagos = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + ", pagos=" + pagos + '}';
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
