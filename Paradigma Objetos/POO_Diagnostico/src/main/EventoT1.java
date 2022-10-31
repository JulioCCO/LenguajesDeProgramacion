/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author AndrikSJ
 */
public class EventoT1 extends Evento{
    
    private String nombreConferencista;
    
    public EventoT1(String nombreConferencista, int cantidadPersonas, String nombre, String fecha, String locacion) {
        super(cantidadPersonas, nombre, fecha, locacion);
        this.nombreConferencista = nombreConferencista;
    }

    public String getNombreConferencista() {
        return nombreConferencista;
    }

    public void setNombreConferencista(String nombreConferencista) {
        this.nombreConferencista = nombreConferencista;
    }
    
    
    @Override
    public String getAtributoExtra() {
        return this.nombreConferencista;
    }
       
    
}
