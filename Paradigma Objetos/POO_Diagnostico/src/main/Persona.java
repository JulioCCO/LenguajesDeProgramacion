/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author andrik y julio
 */
public class Persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private char sexo;
    private int edad;

    public Persona(String nombre, String primerApellido, String segundoApellido, char sexo, int edad, String cedula) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.sexo = sexo;
        this.edad = edad;
        this.cedula = cedula;
    }

    public Persona() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    @Override
    public String toString() {
        return "nombre: " + nombre + ", primer pellido: " + primerApellido 
                + ", segundo apellido: " + segundoApellido + ", cedula: " + cedula 
                + ", sexo: " + sexo + ", edad: " + edad;
    }
    
    
    
}
