/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author AndrikSJ
 */
public class Evento {
    
    private int cantidadPersonas;
    private String nombre;
    private String fecha;
    private String locacion;

    public Evento(int cantidadPersonas, String nombre, String fecha, String locacion) {
        this.cantidadPersonas = cantidadPersonas;
        this.nombre = nombre;
        this.fecha = fecha;
        this.locacion = locacion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }
    
    public String getAtributoExtra() {
        return "";
    }
    
}
