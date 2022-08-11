package main

import "fmt"

func main() {

	conjuto := [...]string{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
	rotaciones := 3
	var dir string
	// true es izquierda
	// false derecha
	direccion := false

	if direccion == true {
		dir = "Izquierda"
	} else {
		dir = "Derecha"
	}

	fmt.Println("\nLista original: ", conjuto)
	fmt.Println("Numero de rotaciones: ", rotaciones)
	fmt.Println("Direccion: " + dir + "\n")
	rotar(&conjuto, rotaciones, direccion)

}

func rotar(lista *[10]string, numRotaciones int, direccion bool) {
	// true es izquierda
	// false derecha
	for rotaciones := 0; rotaciones < numRotaciones; rotaciones++ {
		if direccion == true {
			var dato string = lista[0]
			for i := 0; i < len(lista); i++ {
				if i != 9 {
					lista[i] = lista[i+1]
				} else {
					lista[9] = dato
				}
			}

		} else {
			var dato string = lista[9]
			for i := (len(lista) - 1); i > -1; i-- {
				if i != 0 {
					lista[i] = lista[i-1]
				} else {
					lista[0] = dato
				}
			}
		}
	}
	fmt.Println("Resutaldo: ", *lista)
}