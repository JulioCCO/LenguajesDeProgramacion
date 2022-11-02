package main;

import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Figura;
import Figuras.Rectangulo;
import java.awt.Rectangle;

/**
 *
 * @author jjuli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hoja hoja1 = new Hoja("hoja1");

        Circulo circulo1 = new Circulo("circulo1");
        Rectangulo rectangulo1 = new Rectangulo("rectangulo1");
        Cuadrado cuadrado1 = new Cuadrado("cuadrado1");

        Texto texto1 = new Texto("texto1");
        texto1.setTexto("Esto es un texto en texto1");

        Texto texto2 = new Texto("texto2");
        texto2.setTexto("Esto es un texto en texto2");

        Grupo grupo1 = new Grupo("grupo1");

        grupo1.agregarFigura(circulo1);
        grupo1.agregarTexto(texto1);

        hoja1.agregarGrupo(grupo1);
        hoja1.agregarTexto(texto2);
        hoja1.agregarFigura(rectangulo1);
        hoja1.agregarFigura(cuadrado1);
        
        System.out.println("Hoja1" + hoja1);
    }

}
