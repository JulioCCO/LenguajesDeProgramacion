/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author andrik y julio
 */
public class Contacto {

    private int telefono;

    Persona persona;

    public Contacto(int telefono, String nombre, String primerApellido, String segundoApellido, char sexo, int edad, String cedula) {
        this.telefono = telefono;
        this.persona = new Persona(nombre, primerApellido, segundoApellido, sexo, edad, cedula);
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "telefono: " + telefono + ", " + persona;
    }
    
    public String getAtributoExtra() {
        return "";
    }
    
    
}
