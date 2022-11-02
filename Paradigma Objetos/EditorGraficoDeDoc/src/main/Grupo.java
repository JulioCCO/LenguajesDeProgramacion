/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Figuras.Figura;
import java.util.ArrayList;

/**
 *
 * @author jjuli
 */
public class Grupo {
    
    private String nombre;
    private ArrayList<Figura> listaFiguras;
    private ArrayList<Texto> listaTextos;

    public Grupo(String nombre) {
        this.listaTextos = new ArrayList<>();
        this.listaFiguras = new ArrayList<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public ArrayList<Texto> getListaTextos() {
        return listaTextos;
    }
    
    public void agregarFigura(Figura figura){
        listaFiguras.add(figura);
    }
    
    public void agregarTexto(Texto texto){
        listaTextos.add(texto);
    }

    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + nombre + ", listaFiguras=" + listaFiguras + ", listaTextos=" + listaTextos + '}';
    }
}   
