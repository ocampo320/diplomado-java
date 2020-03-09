package diplomado_poo_ejercicio1_libros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		List<Libro> listaLibros = new ArrayList<Libro>();
		Libro llamarLibro = new Libro();
		String libroString;
		int pagina = 0;

		listaLibros.add(new Libro("andres", "el libro 1", 50));
		listaLibros.add(new Libro("carlos", "el libro 2", 80));
		listaLibros.add(new Libro("felipe", "el libro 3", 550));
		listaLibros.add(new Libro("camilo", "el libro 4", 780));
		listaLibros.add(new Libro("pedro", "el libro 5", 59));
		listaLibros.add(new Libro("julilan", "el libro 6", 508));
		listaLibros.add(new Libro("juan", "el libro 7", 140));
		listaLibros.add(new Libro("kelly", "el libro 8", 148));
		listaLibros.add(new Libro("marta", "el libro 9", 789));
		listaLibros.add(new Libro("andrea", "el libro 10", 103));

		System.out.println(listaLibros);

		Scanner buscarScanner = new Scanner(System.in);
		System.out.println("ingre el libro a buscar");
		libroString = buscarScanner.nextLine();

		for (int i = 0; i < listaLibros.size(); i++) {
			if (libroString.equals(listaLibros.get(i).getAutor())) {
				
				pagina = listaLibros.get(i).getPaginas();

			}
			

		}
		System.out.println("El libro tiene :"+pagina+" paginas");
	}

}
