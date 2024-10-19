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
public class Entrega extends Servicio {

    public Entrega(int Id, LocalDate fecha, Usuario cliente, String destino, double costo) {
        super(Id, fecha, cliente, destino, costo);
    }

    @Override
    public String toString() {
        return "Entrega{" + '}';
    }
  
}
