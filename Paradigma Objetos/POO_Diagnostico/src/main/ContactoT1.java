/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author andrik y julio
 */
public class ContactoT1 extends Contacto {

    private String correo;

    public ContactoT1(String correo, int telefono, String nombre, String primerApellido, String segundoApellido, char sexo, int edad, String cedula) {
        super(telefono, nombre, primerApellido, segundoApellido, sexo, edad, cedula);
        this.correo = correo;
    }

    @Override
    public String toString() {
        return super.toString() + "Correo: " + correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    @Override
    public String getAtributoExtra() {
        return this.correo;
    }
}
