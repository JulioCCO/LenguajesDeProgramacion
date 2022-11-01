/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Date;

public class Funciones {

    public void listarSociosConMasDe3Prestamos(ArrayList<Socio> listaSocios) {
        for (Socio socio : listaSocios) {
            if (socio.librosEnPrestamo.size() >= 3) {
                System.out.println("El socio " + socio.getNombre() + ", tiene " + socio.librosEnPrestamo.size() + " en prestamo.");
            }
        }
    }

    // True = disponible
    public void estadoDeTodosLibros(ArrayList<Libro> listaLibros) {
        for (Libro libro : listaLibros) {
            if (libro.isEstado() == true) {
                System.out.println("El libro: " + libro.getTitulo() + " se encuentra disponible.");
            } else if (libro.isEstado() == false) {
                System.out.println("El libro: " + libro.getTitulo() + " se encuentra ocupado.");
            }
        }
    }

    public boolean verificarSiExisteLibro(int codigoLibro, ArrayList<Libro> listaLibros) {
        for (Libro libro : listaLibros) {
            if (libro.getCodigo() == codigoLibro) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarSiExisteSocio(int numSocio, ArrayList<Socio> listaSocios) {
        for (Socio socio : listaSocios) {
            if (socio.getNumSocio() == numSocio) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarSiElLibroEstaPrestamo(int codigoLibro, ArrayList<Prestamo> listaPrestamo) {
        boolean verificar = false;
        for (Prestamo prestamo : listaPrestamo) {
            if (prestamo.getCodigoLibro() == codigoLibro) {
                verificar = true;
                break;
            }
        }
        if (verificar == true) {
            System.out.println("Prestamo activo, no se puede prestar este libro.");
            return verificar;
        } else {
            System.out.println("Prestamo inactivo, se puede prestar este libro.");
            return verificar;
        }
    }

    public void realizarPrestamo(int numSocio, int codigoLibro, ArrayList<Libro> listaLibros,
            ArrayList<Socio> listaSocios, ArrayList<Prestamo> listaPrestamo) {

        boolean socioExiste = false;
        boolean libroExiste = false;
        boolean libroPrestado = false;

        libroExiste = verificarSiExisteLibro(codigoLibro, listaLibros);
        socioExiste = verificarSiExisteSocio(numSocio, listaSocios);
        libroPrestado = verificarSiElLibroEstaPrestamo(codigoLibro, listaPrestamo);

        if (libroExiste == true && socioExiste == true && libroPrestado == false) {
            for (Libro libro : listaLibros) {
                if (libro.getCodigo() == codigoLibro) {
                    libro.setEstado(false);
                }
            }
            for (Socio socio : listaSocios) {
                if (socio.getNumSocio() == numSocio) {
                    socio.librosEnPrestamo.add(codigoLibro);
                }
            }
            Date date = new Date();
            Prestamo prestamo = new Prestamo(codigoLibro, numSocio, date);
            listaPrestamo.add(prestamo);
        } else {

            if (libroExiste == false) {
                System.out.println("El libro no existe o el codigo es erroneo.");
            }

            if (socioExiste == false) {
                System.out.println("El socio no existe o el codigo es erroneo.");
            }

            if (libroPrestado == true) {
                System.out.println("El libro ya se encuentra prestado.");
            }
        }
    }
}
