/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author jjuli
 */
public class Funciones {

    public String solicitarExp() {
        
         System.out.print("""
                          Ingrese operaciones que no den como resultado el valor -1, 
                           ya que se usa como validacion de un resultado invalido.\n """);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("\nIngrese la expresion: ");

        String expresion = myObj.nextLine();  // Read user input
        //System.out.println("La expresion ingresada es: " + expresion);  // Output user input

        return expresion;
    }

    /**
     *
     * @param operacion
     * @return
     */
    public List Token(String operacion) {
        Num num = new Num();
        List<String> elementos = new ArrayList<>();
        try {
            StringTokenizer st = new StringTokenizer(operacion, "+/-*", true);
            while (st.hasMoreTokens()) {
                String mys = st.nextToken();
                // ".*[1-9].*"   "[+-]?\\d*(\\.\\d+)?"
                boolean isNumeric = mys.matches(".*[1-9].*");
                if (isNumeric == true) {
                    elementos.add(mys);
                } else if (isOperador(mys) == true) {
                    elementos.add(mys);
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return elementos;
    }

    public boolean isOperador(String st) {
        Operadores ope = new Operadores();
        boolean estado = false;
        try {
            if (st.equalsIgnoreCase(ope.getDiv())
                    || st.equalsIgnoreCase(ope.getMult())
                    || st.equalsIgnoreCase(ope.getResta())
                    || st.equalsIgnoreCase(ope.getSuma())) {
                estado = true;
                return estado;
            } else {
                throw new ExcepcionPersonalizada(110);
            }
        } catch (ExcepcionPersonalizada e) {
            System.err.println(e.getMessage());
        }
        return estado;
    }

    public int formular(List list) {
        int result = 0;
        int num1;
        int num2;
        String operator;
        String dataNum1, dataNum2, dataOpe;
        int tamano = list.size();
        try {
            for (int i = 0; i < tamano; i++) {
                i = 0;
                dataNum1 = (String) list.get(i);
                dataOpe = (String) list.get(i + 1);
                dataNum2 = (String) list.get(i + 2);
                boolean isNumeric1 = dataNum1.matches(".*[1-9].*");
                boolean isNumeric2 = dataNum2.matches(".*[1-9].*");
                if (i == 0 && isOperador(dataNum1) == true) {
                    throw new ExcepcionPersonalizada((111));
                }
                if (tamano < 3) {
                    throw new ExcepcionPersonalizada((111));
                }
                if ((isNumeric1 == true) && (isNumeric2 == true) && (isOperador(dataOpe))) {
                    num1 = Integer.parseInt(list.get(i).toString());
                    operator = (String) list.get(i + 1);
                    num2 = Integer.parseInt(list.get(i + 2).toString());
                    if ((i + 2) <= tamano) {
                        result = operacionesBasicas(num1, num2, operator);
                        list.add(0, Integer.toString(result));
                        list.remove(i + 1);
                        list.remove(i + 1);
                        list.remove(i + 1);
                        tamano = list.size();
                    }
                } else {
                    throw new ExcepcionPersonalizada((111));
                }
                if (tamano == 1) {
                    return result;
                }
                num1 = 0;
                num2 = 0;
                operator = "";
                dataNum1 = "";
            }
        } catch (ExcepcionPersonalizada e) {
            System.err.println(e.getMessage());
        }
        return -1;
    }

    public int operacionesBasicas(int num1, int num2, String operando) {
        int resultado = -1;
        switch (operando) {
            case "+" -> {
                resultado = num1 + num2;
                return resultado;
            }
            case "-" -> {
                resultado = num1 - num2;
                return resultado;
            }
            case "/" -> {
                resultado = num1 / num2;
                return resultado;
            }
            case "*" -> {
                resultado = num1 * num2;
                return resultado;
            }
        }
        return resultado;
    }
}
