package main

import "fmt"

type calzado struct {
	marca  string
	precio int
	talla  int
}

func main() {

	var GeorgeCleverley calzado
	var ADiciannoveventitre calzado
	var SebastianTarek calzado
	var Santoni calzado
	var Magnanni calzado
	var Bally calzado
	var EdwardGreen calzado
	var JohnLobb calzado
	var Buscemi calzado
	var Guidi calzado

	// lC = lista Calzado[NombreCalzado]

	lCGeorgeCleverley := []calzado{}
	lCoADiciannoveventitre := []calzado{}
	lCSebastianTarek := []calzado{}
	lCSantoni := []calzado{}
	lCMagnanni := []calzado{}
	lCBally := []calzado{}
	lCEdwardGreen := []calzado{}
	lCJohnLobb := []calzado{}
	lCBuscemi := []calzado{}
	lCGuidi := []calzado{}

	llenarStock(crearZapatos(34, 1250, "George Cleverley", GeorgeCleverley), &lCGeorgeCleverley)
	llenarStock(crearZapatos(35, 3155, "A Diciannoveventitre", ADiciannoveventitre), &lCoADiciannoveventitre)
	llenarStock(crearZapatos(36, 2802, "Sebastian Tarek", SebastianTarek), &lCSebastianTarek)
	llenarStock(crearZapatos(37, 740, "Santoni", Santoni), &lCSantoni)
	llenarStock(crearZapatos(38, 895, "Magnanni", Magnanni), &lCMagnanni)
	llenarStock(crearZapatos(39, 650, "Bally", Bally), &lCBally)
	llenarStock(crearZapatos(40, 2000, "Edward Green", EdwardGreen), &lCEdwardGreen)
	llenarStock(crearZapatos(41, 1625, "John Lobb", JohnLobb), &lCJohnLobb)
	llenarStock(crearZapatos(42, 1887, "Buscemi", Buscemi), &lCBuscemi)
	llenarStock(crearZapatos(43, 2121, "Guidi", Guidi), &lCGuidi)

	fmt.Println("\nLista de zapatos inicial: ", lCGeorgeCleverley)
	fmt.Println("Tamaño de la lista: ", len(lCGeorgeCleverley))

	for i := 0; i < 10; i++ {
		vendercalzado(&lCGeorgeCleverley)
	}
	fmt.Println("\nLista de zapatos despues de 10 ventas: ", lCGeorgeCleverley)
	fmt.Println("Tamaño de la lista: ", len(lCGeorgeCleverley))

}
func vendercalzado(lista *[]calzado) {
	copyList := *lista
	if len(copyList) == 0 {
		println("Zapatos agotados")
		copyList = append(copyList[:0], copyList[1:]...)
	} else {
		copyList = append(copyList[:0], copyList[1:]...)
		*lista = copyList
	}
}

func llenarStock(cal calzado, lista *[]calzado) {
	for i := 0; i < 10; i++ {
		*lista = append(*lista, cal)
	}
}

func crearZapatos(t int, p int, m string, zapato calzado) calzado {

	zapato.talla = t
	zapato.precio = p
	zapato.marca = m

	return zapato
}
