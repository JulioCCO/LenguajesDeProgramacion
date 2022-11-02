/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author jjuli
 */
public class Cuadrado extends Figura {

    public Cuadrado(String nombre) {
        super(nombre);
        lados = 4;
        ancho = 4;
        largo = 4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public double perimetro() {
        double result = 0;
        result = largo * 4;
        return result;
    }

    @Override
    public double area() {
        double result = 0;
        result = largo * ancho;
        return result;
    }

}
