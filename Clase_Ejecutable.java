package edu.itfip.estructura;

public class Clase_Ejecutable {

	public static void main(String[] args) {
		ClaseConstructora lista = new ClaseConstructora();
		
		int num = 5;
		
		lista.insertarNodo(num);
		
		lista.mostrarLista();
	}

}
