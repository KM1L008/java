package edu.itfip.estructura;

public class Clase_Ejecutable {

	public static void main(String[] args) {
		ClaseConstructora lista = new ClaseConstructora();

		String menu;
		Scanner teclado = new Scanner(System.in);
		menu = teclado.nextLine();
		
		int num = 5;
		
		lista.insertarNodo(num);
		
		lista.mostrarLista();
	}

}
