/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Date;

/**
 *
 * @author jjuli
 */
public class Prestamo {
    
    private int codigoLibro;
    private int numSocio;
    private Date fecha;

    public Prestamo(int codigoLibro, int numSocio, Date fecha) {
        this.codigoLibro = codigoLibro;
        this.numSocio = numSocio;
        this.fecha = fecha;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigoLibro=" + codigoLibro + ", numSocio=" + numSocio + ", fecha=" + fecha + '}';
    }
    
    
}
