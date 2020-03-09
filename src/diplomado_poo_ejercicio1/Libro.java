package diplomado_poo_ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Libro {

	private String autor = "";
	private String titulo = "";
	private int paginas = 0;
	private List<Libro> listaLibros=new ArrayList<Libro>();

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Libro(String autor, String titulo, int paginas) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.paginas = paginas;
	}

	public Libro() {
		super();
	}

	@Override
	public String toString() {
		return "Libro [el libro=" + titulo + ", " + "del autor=" + autor + ",tiene  paginas=" + paginas + "]";
	}
	
	public int comprarLibros(int paginasCompra)
	{
		
		for (int i = 0; i < listaLibros.size(); i++) {
			
			if (listaLibros.get(paginasCompra) != null) {
				
			}
			
			
		}
		
		
		
		
		return paginas;
		
		
	}

}
