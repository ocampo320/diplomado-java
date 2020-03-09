package diplomado_poo_ejercicio1_libros;

public class Libro {

	private String autor = "";
	private String titulo = "";
	private int paginas = 0;
	private int idLibro=0;
	private static int contador=0;

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
		this.idLibro=++contador;
		this.autor = autor;
		this.titulo = titulo;
		this.paginas = paginas;
	}

	public Libro() {
		super();
	}

	

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	@Override
	public String toString() {
		return "Libro [ id_Libro=" +idLibro+" autor=" + autor + ", titulo=" + titulo + ", paginas=" + paginas + "]\n";
	}

	public int comprarLibros(int buscarId) {
		
		return paginas;

	}

}
