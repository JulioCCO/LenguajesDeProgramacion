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
public class Hoja {

    private String nombre;
    private ArrayList<Figura> listaFiguras;
    private ArrayList<Texto> listaTextos;
    private ArrayList<Grupo> listaGrupos;

    public Hoja(String nombre) {
        this.nombre = nombre;
        this.listaTextos = new ArrayList<>();
        this.listaFiguras = new ArrayList<>();
        this.listaGrupos = new ArrayList<>();
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

    public ArrayList<Grupo> getListaGrupos() {
        return listaGrupos;
    }
    
    public void agregarFigura(Figura figura) {
        listaFiguras.add(figura);
    }

    public void agregarTexto(Texto texto) {
        listaTextos.add(texto);
    }

    public void agregarGrupo(Grupo grupo) {
        listaGrupos.add(grupo);
    }

    @Override
    public String toString() {
        return "Hoja{" + "nombre=" + nombre + ", listaFiguras=" + listaFiguras + ", listaTextos=" + listaTextos + ", listaGrupos=" + listaGrupos + '}';
    }
    
    
   
}
