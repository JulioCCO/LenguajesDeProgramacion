/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author jjuli
 */
public class Socio {
    
    private int numSocio;
    private String nombre;
    private String direccion;
    
    ArrayList<Integer> librosEnPrestamo;

    public Socio(int numSocio, String nombre, String direccion) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.librosEnPrestamo = new ArrayList<>();
    }
    
    public int librosPrestados(){
        int cantidad = librosEnPrestamo.size();
        return cantidad;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
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

    @Override
    public String toString() {
        return "Socio{" + "numSocio=" + numSocio + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
}
