/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author jjuli
 */
public abstract class Figura {
    
    String nombre;
    public int radio;
    public int lados;
    public int altura;
    public int largo;
    public int ancho;
    public final double PI = 3.14;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double area();

    public abstract double perimetro();

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + '}';
    }
    
}
