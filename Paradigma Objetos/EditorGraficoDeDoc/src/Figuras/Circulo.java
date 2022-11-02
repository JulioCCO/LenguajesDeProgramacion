/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @   author jjuli
 */
public class Circulo extends Figura {

    public Circulo(String nombre) {
        super(nombre);
        radio = 30;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public double area() {
        double result = 0;
        result = PI * (radio ^ 2);
        return result;
    }

    @Override
    public double perimetro() {
        double result = 0;
        result = PI * diametro();
        return result;
    }

    public double diametro() {
        double result = 0;
        result = radio * 2;
        return result;
    }


    
    
}
