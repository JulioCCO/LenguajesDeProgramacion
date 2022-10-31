/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author AndrikSJ
 */
public class EventoT2 extends Evento{
    
    private String tematica;

    public EventoT2(String tematica, int cantidadPersonas, String nombre, String fecha, String locacion) {
        super(cantidadPersonas, nombre, fecha, locacion);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
    
    @Override
    public String getAtributoExtra() {
        return this.tematica;
    }
    
    
    
}
