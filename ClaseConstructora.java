package edu.itfip.estructura;

import edu.itfip.listas.Nodo;

public class ClaseConstructora {
	// nombre_clase_nodo + nombre_var + = + new + nombre_clase_nodo+() + ;

	// Creando dos nodos
	ClaseNodo primero = new ClaseNodo();
	ClaseNodo ultimo = new ClaseNodo();
	
	public ClaseConstructora() {
		primero = null;
		ultimo = null;
	}
	
	public void insertarNodo(int num) {
		ClaseNodo nuevo = new ClaseNodo();
		
		nuevo.num = num;

		//este if siempre va a ser igual
		
		if (primero == null) {
			primero = nuevo;
			primero.siguiente = null;
			ultimo = nuevo;
		} else {
			ultimo.siguiente = nuevo;
			nuevo.siguiente = null;
			ultimo = nuevo;
		}
		
		System.out.println("Nodo ingresado");
	}
	
	public void mostrarLista() {
		ClaseNodo actual = new ClaseNodo();
		actual = primero;
		if (primero != null) {
			while (actual != null) {
				System.out.print(actual.num + "");
				actual = actual.siguiente;
			}
		} else {
			System.out.println("Lista vacio");
		}
		System.out.println();
		System.out.println();
	}
}
