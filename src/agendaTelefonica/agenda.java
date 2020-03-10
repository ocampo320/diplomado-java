package agendaTelefonica;

public class agenda extends Contacto {
	private Contacto agenda[] = new Contacto[10];

	public agenda() {

	}

	public void listarContactos() {
		for (int i = 0; i < agenda.length && agenda[i] != null; i++) {
			System.out.println("nombre: " + agenda[i].getNombre() + " telefono: " + agenda[i].getNumero());
		}

	}

	public boolean ingresarContacto(Contacto contacto) {
		for (int i = 0; i < agenda.length; i++) {
			if (agenda[i] == null) {
				agenda[i] = contacto;
				return true;
			}

		}

		return false;

	}

	public void buscarContacto(String nombre) {

		for (int i = 0; i < agenda.length; i++) {
			if (agenda[i] != null && nombre.equals(agenda[i].getNombre())) {
				System.out.println("el numero encontado es: " + agenda[i].getNumero());
			}

		}

	}

	public int disponible() {
		int contador = 0;
		while (agenda[contador] != null) {
			contador++;
		}
		return agenda.length - contador;

	}

}
