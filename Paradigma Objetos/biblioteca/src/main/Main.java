package main;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Libro> listaLibros = new ArrayList<>();
    public static ArrayList<Socio> listaSocios = new ArrayList<>();
    public static ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

    public static void main(String[] args) {

        Libro libro1 = new Libro(0, "El nombre del viento", "Patrick Rothfuss");
        Libro libro2 = new Libro(1, "El Principito", "Antoine de Saint-Exupéry");
        Libro libro3 = new Libro(2, "Asi hablo Zaratustra", "Friedrich Nietzsche");
        Libro libro4 = new Libro(3, "El hombre en busca de sentido", "Viktor Emil Frankl");
        Libro libro5 = new Libro(4, "El arte de la guerra", "Sun Tzu");
        Libro libro6 = new Libro(5, "Que hace vivir a los hombres", "Lev Nikoláievich Tolstói");
        Libro libro7 = new Libro(6, "El arte de amar", "Erich Fromm");
        Libro libro8 = new Libro(7, "Psicología oscura", "Spencer Le Marchant Moore");
        Libro libro9 = new Libro(8, "Inteligencia emocional", "Goleman ");
        Libro libro10 = new Libro(9, "El principe", "Nicolas Maquiavelo");
        Libro libro11 = new Libro(10, "Como un hombre piensa asi es su vida", "james Allen");
        Libro libro12 = new Libro(11, "El hombre multiorgasmico", "");
        Libro libro13 = new Libro(12, "El Hobbit", "John Ronald Reuel Tolkien");
        Libro libro14 = new Libro(13, "El hombre mas rico de Babilonia", "George Samuel Clason");

        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        listaLibros.add(libro4);
        listaLibros.add(libro5);
        listaLibros.add(libro6);
        listaLibros.add(libro7);
        listaLibros.add(libro8);
        listaLibros.add(libro9);
        listaLibros.add(libro10);
        listaLibros.add(libro11);
        listaLibros.add(libro12);
        listaLibros.add(libro13);
        listaLibros.add(libro14);

        Socio socio1 = new Socio(0, "Julio", "Penjamo");
        Socio socio2 = new Socio(1, "Josue", "Platanar");
        Socio socio3 = new Socio(2, "Steven", "Cedral");
        Socio socio4 = new Socio(3, "José", "Cuidad Quesada");
        Socio socio5 = new Socio(4, "Fabricio", "Purblo Nuevo");
        Socio socio6 = new Socio(5, "Minor", "Santa Clara");

        listaSocios.add(socio1);
        listaSocios.add(socio2);
        listaSocios.add(socio3);
        listaSocios.add(socio4);
        listaSocios.add(socio5);
        listaSocios.add(socio6);

        Funciones fun = new Funciones();
        System.out.println("Verificando estado de los libros\n");
        fun.estadoDeTodosLibros(listaLibros);

        System.out.println("\nRealizando prestamo al socio, codigo = 0\n");
        // Al socio1 se le prestan los libros: libro1, libro2, libro3 
        fun.realizarPrestamo(0, 0, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(0, 1, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(0, 2, listaLibros, listaSocios, listaPrestamos);

        // Al socio2 se le prestan los libros: libro4, libro5, libro6, libro1
        System.out.println("\nRealizando prestamo al socio, codigo = 1\n");
        fun.realizarPrestamo(1, 3, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(1, 4, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(1, 5, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(1, 0, listaLibros, listaSocios, listaPrestamos);

        System.out.println("\nRealizando prestamo al socio, codigo = 2\n");
        fun.realizarPrestamo(2, 6, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(2, 7, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(2, 8, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(2, 9, listaLibros, listaSocios, listaPrestamos);

        System.out.println("\nRealizando prestamo al socio, codigo = 2\n");
        fun.realizarPrestamo(3, 10, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(3, 11, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(3, 12, listaLibros, listaSocios, listaPrestamos);
        fun.realizarPrestamo(3, 13, listaLibros, listaSocios, listaPrestamos);

        System.out.println("\nVerificando estado de los libros\n");
        fun.estadoDeTodosLibros(listaLibros);

        System.out.println("\nListar socios con 3 o mas prestamos.\n");
        fun.listarSociosConMasDe3Prestamos(listaSocios);
    }

}
