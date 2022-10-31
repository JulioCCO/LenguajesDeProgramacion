/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author andrik y julio
 */
public class ContactoT2 extends Contacto{
    
    private String apodo;
    public ContactoT2(String apodo, int telefono, String nombre, String primerApellido, String segundoApellido, char sexo, int edad, String cedula) {
        super(telefono, nombre, primerApellido, segundoApellido, sexo, edad, cedula);
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return super.toString() + "apodo: " + apodo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    @Override
    public String getAtributoExtra() {
        return this.apodo;
    }
    
    
    
}
