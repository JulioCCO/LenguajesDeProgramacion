package main;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author jjuli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Funciones fun = new Funciones();

        String exp = fun.solicitarExp();

        List<String> elementos = new ArrayList<>();

        elementos = fun.Token(exp);
        
        int num = fun.formular(elementos);

        if (num == -1) {
            System.err.println("El resultado de la operacion es:" + num);
            System.err.println("Operacion invalida.");
        } else {
            System.out.println("El resultado de la operacion es:" + num);
        }
    }

}
