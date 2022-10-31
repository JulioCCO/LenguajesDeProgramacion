/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author andrik y julio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        
        
        ContactoT1 contactoT1 = new ContactoT1("Andrik@hotmail.com", 12345678, "Andrik", "Solano", "Jimenez", 'M', 19,"2-0742-9632");
        ContactoT2 contactoT2 = new ContactoT2("Guapo", 61647329, "Julio Cesar", "Castro", "Ortiz", 'M', 29, "3-9473-0183");
        
        EventoT1 evento1 = new EventoT1("Juan Carlos",22, "Conferencia de finanzas", "22/09/22", "Parque Ciudad Quesada");
        
        EventoT2 evento2 = new EventoT2("Super Heroes",60, "Concurso de disfrazes", "12/03/23", "Centro Nacional de COnvenciones");
        
        
        Agenda agenda = new Agenda();

        agenda.insertarContacto(contactoT1);

        agenda.insertarContacto(contactoT2);
        
        agenda.insertarEvento(evento1);
        agenda.insertarEvento(evento2);

        agenda.imprimirContacto("Andrik");
        main.GUI_imprimir(agenda);
        main.GUI_imprimirEvento(agenda);
    }

    public void GUI_imprimir(Agenda agenda) {

        GUI_imprimir gui_imprimir = new GUI_imprimir(agenda);
        gui_imprimir.setVisible(true);
        gui_imprimir.setLocationRelativeTo(null);
    }
    
    public void GUI_imprimirEvento(Agenda agenda) {

        GUI_Eventos gui_eventos = new GUI_Eventos(agenda);
        gui_eventos.setVisible(true);
        gui_eventos.setLocationRelativeTo(null);
    }

}
