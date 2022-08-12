package main

import (
	"fmt"
	"strings"
)

func main() {

	texto := "Este texto tiene letras\n" + " palabras y saltos de linea"

	/*
		"Este texto tiene letras\n" + " palabras y saltos de linea"

		"Este es el texto\n" + " numero 2 el cual tienen\n" + " 3 saltos lineas"

	*/
	letras, palabras, saltos := contarTexto(texto)
	fmt.Println("\nEl texto a analizar es: ", "\n\n"+texto)
	fmt.Println("\nLa cantidad de letras es: ", letras)
	fmt.Println("La cantidad de palabras es: ", palabras)
	fmt.Println("la cantidad de saltos de linea es: ", saltos)

}

func contarTexto(txt string) (letras int, palabras int, saltos int) {
	contLetra := 0
	textoPalabras := strings.Split(txt, " ")
	txtSaltos := strings.Split(txt, "\n")

	for i := 0; i < len(textoPalabras); i++ {
		for j := 0; j < len(textoPalabras[i]); j++ {
			contLetra += 1
		}
	}
	return contLetra - (len(txtSaltos) - 1), len(textoPalabras), (len(txtSaltos) - 1)
}

