package agendaTelefonica;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class agenda extends Contacto {

	private ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
	static int contador = 0;
	private int disponibles = 0;

	public agenda(String nombre, String numero, ArrayList<Contacto> lista) {
		super(nombre, numero);
		this.listaContactos = lista;
	}

	public agenda() {
		super();
	}

	public agenda(String nombre, String numero) {
		super(nombre, numero);
	}

	public String BuscarContacto(String nombreBuscar) {
		for (int i = 0; i < listaContactos.size(); i++) {

			if (nombreBuscar.equals(listaContactos.get(i).getNombre())) {

				return listaContactos.get(i).getNumero();
			}
		}
		return null;

	}

	public void ingresarContacto(Contacto contacto) {

		listaContactos.add(contacto);
	}

	public String mostrar()
	{
		return listaContactos.toString();
		
	}
	
	
}
