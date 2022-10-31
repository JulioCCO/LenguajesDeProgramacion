/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author andrik y julio
 */
public class Agenda {

    public ArrayList<Contacto> agenda = new ArrayList<>(); // Create an ArrayList object
    public ArrayList<Evento> agendaEvento = new ArrayList<>(); // Create an ArrayList object
   

    public void insertarContacto(ContactoT1 contacto) {
        agenda.add(contacto);
    }

    public void insertarContacto(ContactoT2 contacto) {
        agenda.add(contacto);
    }
    
    public void insertarEvento(EventoT1 evento) {
        agendaEvento.add(evento);
    }
    
    public void insertarEvento(EventoT2 evento) {
        agendaEvento.add(evento);
    }

    public void eliminarContacto(String nombre) {

        for (Contacto contacto : this.agenda) {
            if (contacto.getPersona().getNombre().equals(nombre)) {
                this.agenda.remove(contacto);
            }
        }
    }

    public void imprimirContacto(String nombre) {
        for (Contacto contacto : this.agenda) {
            if (contacto.getPersona().getNombre().equals(nombre)) {
                System.out.println(contacto.toString());
                break;
            }
        }
    }

    public Contacto obtenerContacto(String nombre) {
        for (Contacto contacto : this.agenda) {
            if (contacto.getPersona().getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public Evento obtenerEvento(String nombre) {
        for (Evento evento : this.agendaEvento) {
            if (evento.getNombre().equals(nombre)) {
                return evento;
            }
        }
        return null;
    }    
    
    


}
