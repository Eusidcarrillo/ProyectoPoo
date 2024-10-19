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
public class Admin extends Usuario {
    
    private int adminId;
    private String departamento;
    private ArrayList<Conductor> conductores;

    public Admin(int adminId, String departamento, ArrayList<Conductor> conductores, int id, String nombre, String direccion, String telefono, String email, ArrayList<Pago> pagos) {
        super(id, nombre, direccion, telefono, email, pagos);
        this.adminId = adminId;
        this.departamento = departamento;
        this.conductores = conductores;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(ArrayList<Conductor> conductores) {
        this.conductores = conductores;
    }

    @Override
    public String toString() {
        return "Admin{" + "adminId=" + adminId + ", departamento=" + departamento + ", conductores=" + conductores + '}';
    }

}
